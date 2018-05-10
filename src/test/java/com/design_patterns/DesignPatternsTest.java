package com.design_patterns;

import com.design_patterns.adapter.ChinesePondTurtle;
import com.design_patterns.adapter.MutantTurtle;
import com.design_patterns.adapter.Turtle;
import com.design_patterns.adapter.class_adapter.TurtleClassAdapter;
import com.design_patterns.adapter.object_adapter.MutantTurtleObjectAdapter;
import com.design_patterns.builder.*;
import com.design_patterns.decorator.BasicCake;
import com.design_patterns.decorator.BirthdayCake;
import com.design_patterns.decorator.Cake;
import com.design_patterns.decorator.WeddingCake;
import com.design_patterns.prototype.AnimalCloneFactory;
import com.design_patterns.prototype.Sheep;
import com.design_patterns.strategy.Flamingo;
import com.design_patterns.strategy.Kiwi;
import com.design_patterns.strategy.fly.FlyImpl1;
import com.design_patterns.strategy.fly.FlyImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DesignPatternsTest {
    @Test
    public void testAdapter() {
        System.out.println("ADAPTER TESTS:");
        Turtle turtle = new ChinesePondTurtle();
        MutantTurtle mutantTurtle = new MutantTurtleObjectAdapter(turtle);
        Turtle turtleAdapter = new TurtleClassAdapter();
        Assertions.assertNotNull(turtle, () -> "NULL OBJECT OF TURTLE");
        Assertions.assertNotNull(mutantTurtle, () -> "NULL OBJECT OF MUTANT TURTLE");
        Assertions.assertNotNull(turtleAdapter, () -> "NULL OBJECT OF TURTLE ADAPTER");
        System.out.println("NOT NULL ADAPTER OBJECTS TESTS OK!");
    }

    @Test
    public void testBuilder(){
        System.out.println("BUILDER TESTS: ");
        Cook cook = new Cook();
        BurgerBuilder spicyBurger = new SpicyBurger();
        BurgerBuilder cheeseBurger = new CheeseBurger();
        BurgerBuilder classicBurger = new ClassicBurger();


        cook.setBurgerBuilder(spicyBurger);
        cook.buildBurger();
        Burger readySpicyBurger = cook.getBurger();


        cook.setBurgerBuilder(cheeseBurger);
        cook.buildBurger();
        Burger readyCheeseBurger = cook.getBurger();


        cook.setBurgerBuilder(classicBurger);
        cook.buildBurger();
        Burger readyClassicBurger = cook.getBurger();

        Assertions.assertAll(
                "BURGER TESTS",
                ()->{
                    Assertions.assertEquals(spicyBurger.getBurger(), readySpicyBurger);
                    Assertions.assertEquals(cheeseBurger.getBurger(), readyCheeseBurger);
                    Assertions.assertEquals(classicBurger.getBurger(), readyClassicBurger);
                    Assertions.assertAll(
                            "BUN TEST",
                            ()->{
                                Assertions.assertTrue(readySpicyBurger.getBun() != null && readyCheeseBurger.getBun() != null && readySpicyBurger.getBun().equals(readyCheeseBurger.getBun()), "BUN IN SPICY BURGER AND IN CHEESE BURGER IS NOT OK");
                                Assertions.assertTrue(readyClassicBurger.getBun().contains("wheat") && !readyClassicBurger.getBun().equals(readySpicyBurger.getBun()), "BUN IN CLASSIC BURGER IS NOT OK");
                                System.out.println("BUN TESTS OK!");
                                Assertions.assertAll(
                                        "MEAT TEST",
                                        () ->{
                                            Assertions.assertTrue(readyCheeseBurger.getMeat().length() == readyClassicBurger.getMeat().length() && !readyClassicBurger.getMeat().isEmpty(), "MEAT IN CHEESE BURGER AND IN CLASSIC BURGER IS NOT OK");
                                            Assertions.assertTrue(readySpicyBurger.getMeat().startsWith("p") && readySpicyBurger.getMeat().endsWith("k"), "MEAT IN SPICY BURGER IS NOT OK");
                                            System.out.println("MEAT TESTS OK!");
                                            Assertions.assertAll(
                                                    "VEGETABLES TEST",
                                                    ()->{
                                                        Assertions.assertFalse(readyClassicBurger.getVegetables().contains("pickles"), "VEGETABLES IN CLASSIC BURGER IS NOT OK");
                                                        Assertions.assertNotEquals(readyClassicBurger.getVegetables(), readyCheeseBurger.getVegetables(), "VEGETABLES IN CLASSIC BURGER OR IN CHEESE BURGER IS NOT OK");
                                                        Assertions.assertFalse(readySpicyBurger.getVegetables().startsWith("k") && readySpicyBurger.getVegetables().length()>35, "VEGETABLES IN SPICY BURGER IS NOT OK");
                                                        System.out.println("VEGETABLES TESTS OK!");
                                                        Assertions.assertAll(
                                                                "SAUCE TESTS",
                                                                () ->{
                                                                    Assertions.assertTrue(readyCheeseBurger.getSauce().contains("ketchup"), "SAUCE IN CHEESE BURGER IS NOT OK");
                                                                    Assertions.assertTrue(readyClassicBurger.getSauce().startsWith("mustard"), "SAUCE IN CLASSIC BURGER IS NOT OK");
                                                                    Assertions.assertFalse(!readySpicyBurger.getSauce().contains("devil"), "SAUCE IN SPICY BURGER IS NOT OK");
                                                                    System.out.println("SAUCE TESTS OK!");
                                                                    Assertions.assertAll(
                                                                            "CHEESE TEST",
                                                                            () ->{
                                                                                Assertions.assertEquals(readyCheeseBurger.getCheese(), "cheddar, rokpol, mozzarella, smoked cheese", "CHEESE IN CHEESE BURGER IS NOT OK");
                                                                                Assertions.assertEquals(readyClassicBurger.getCheese(), readySpicyBurger.getCheese(), "CHEESE IN CLASSIC BURGER AND IN SPICY BURGER IS NOT OK");
                                                                                System.out.println("CHEESE TESTS OK!");
                                                                            }
                                                                    );
                                                                }
                                                        );
                                                    }
                                            );
                                        }
                                );
                            }
                    );

                }
        );
    }
    @Test
    public void testDecorator(){
        System.out.println("DECORATOR TESTS:");
        Assertions.assertTimeout(
                Duration.ofSeconds(1),
                ()->{
                    Cake birthdayCake = new BirthdayCake(new BasicCake());
                    birthdayCake.decorate();
                    Cake weddingCake = new WeddingCake(new BasicCake());
                    weddingCake.decorate();
                    Cake weddingBirthdayCake = new BirthdayCake(new WeddingCake(new BasicCake()));
                    weddingBirthdayCake.decorate();
                },
                "DECORATOR TIME IS TOO LONG");
        System.out.println("DECORATOR TEST OK!");
    }
    @Test
    public void testPrototype(){
        System.out.println("PROTOTYPE TESTS:");
        AnimalCloneFactory animalCloneFactory = new AnimalCloneFactory();
        List<String> strings = new ArrayList<>();
        Sheep sheep = new Sheep("Dolly", strings);
        strings.add(sheep.getName());
        Sheep sheep2 = (Sheep) animalCloneFactory.getClone(sheep);
        strings.add(sheep2.getName());
        Assertions.assertEquals(sheep.getName(), sheep2.getName(), "SHEEP NAMES IS NOT OK");
        Assertions.assertNotEquals(sheep.getSheepList(), sheep2.getSheepList(), "SHEEPLISTS IS NOT OK");
        System.out.println("PROTOTYPE TESTS OK!");
    }
    @Test
    public void testStrategy(){
        System.out.println("STRATEGY TESTS:");
        Kiwi kiwi = new Kiwi(new FlyImpl2());
        Flamingo flamingo = new Flamingo(new FlyImpl2());
        Assertions.assertEquals(flamingo.toString(), kiwi.toString());
        flamingo.setFly(new FlyImpl1());
        Assertions.assertNotEquals(flamingo.toString(), kiwi.toString());
        System.out.println("STRATEGY TESTS OK!");
    }
}
