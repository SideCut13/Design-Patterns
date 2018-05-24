package com.design_patterns;

import com.design_patterns.builder.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    private static Cook cook = new Cook();
    private static BurgerBuilder spicyBurger = new SpicyBurger();
    private static BurgerBuilder cheeseBurger = new CheeseBurger();
    private static BurgerBuilder classicBurger = new ClassicBurger();
    private static Burger readySpicyBurger;
    private static Burger readyCheeseBurger;
    private static Burger readyClassicBurger;

    @BeforeAll
    public static void readyBurgers(){
        cook.setBurgerBuilder(spicyBurger);
        cook.buildBurger();
        readySpicyBurger = cook.getBurger();

        cook.setBurgerBuilder(cheeseBurger);
        cook.buildBurger();
        readyCheeseBurger = cook.getBurger();

        cook.setBurgerBuilder(classicBurger);
        cook.buildBurger();
        readyClassicBurger = cook.getBurger();
    }
    @Test
    public void bunTests(){
        Assertions.assertEquals(readySpicyBurger.getBun(), readyCheeseBurger.getBun(), "BUNS IN SPICY AND CHEESE BURGERS EQUALS TEST FAILED");
        Assertions.assertNotEquals(readyClassicBurger.getBun(), readySpicyBurger.getBun(), "BUNS IN SPICY AND CLASSIC BURGERS NOT EQUALS TEST FAILED");
        Assertions.assertTrue(readySpicyBurger.getBun().contains("wheat"), "WHEAT BUN IN SPICY BURGER TRUE TEST FAILED");
        Assertions.assertTrue(readyClassicBurger.getBun().contains("whole"), "WHOLEWHEAT BUN IN CLASSIC BURGER TEST FAILED");
    }
    @Test
    public void meatTests(){
        Assertions.assertTrue(readyCheeseBurger.getMeat().length() == readyClassicBurger.getMeat().length(), "MEATS IN CHEESE AND CLASSIC BURGER TRUE TEST FAILED");
        Assertions.assertTrue(readySpicyBurger.getMeat().startsWith("p") && readySpicyBurger.getMeat().endsWith("k"), "MEAT IN SPICY BURGER TRUE TEST FAILED");
    }
    @Test
    public void vegetablesTests(){
        Assertions.assertFalse(readyClassicBurger.getVegetables().contains("pickles"), "VEGETABLES IN CLASSIC BURGER FALSE TEST FAILED");
        Assertions.assertNotEquals(readyClassicBurger.getVegetables(), readyCheeseBurger.getVegetables(), "VEGETABLES IN CLASSIC BURGER OR IN CHEESE BURGER IS NOT OK");
        Assertions.assertFalse(readySpicyBurger.getVegetables().startsWith("k") && readySpicyBurger.getVegetables().length()>35, "VEGETABLES IN SPICY BURGER IS NOT OK");
    }
    @Test
    public void sauceTests(){
        Assertions.assertTrue(readyCheeseBurger.getSauce().contains("ketchup"), "SAUCE IN CHEESE BURGER TRUE TEST FAILED");
        Assertions.assertTrue(readyClassicBurger.getSauce().startsWith("mustard"), "SAUCE IN CLASSIC BURGER TRUE TEST FAILED");
        Assertions.assertFalse(!readySpicyBurger.getSauce().contains("devil"), "SAUCE IN SPICY BURGER TRUE TEST FAILED");
    }
    @Test
    public void cheeseTest(){
        Assertions.assertEquals("cheddar, rokpol, mozzarella, smoked cheese", readyCheeseBurger.getCheese(), "CHEESE IN CHEESE BURGER EAUALS TEST FAILED");
        Assertions.assertEquals(readyClassicBurger.getCheese(), readySpicyBurger.getCheese(), "CHEESE IN CLASSIC AND SPICY BURGERS EQUALS TEST FAILED");
    }
    @Test
    public void testBuilder(){
        Assertions.assertAll(
                "BURGER EQUALS TESTS",
                ()->{
                    Assertions.assertEquals(spicyBurger.getBurger(), readySpicyBurger, "SPICY AND READY SPICY BURGERS EQUALS TEST FAILED");
                    Assertions.assertEquals(cheeseBurger.getBurger(), readyCheeseBurger, "CHEESE AND READY CHEESE BURGERS EQUALS TEST FAILED");
                    Assertions.assertEquals(classicBurger.getBurger(), readyClassicBurger, "CLASSIC AND READY CLASSIC BURGERS EQUALS TEST FAILED");
                }
        );
    }
}
