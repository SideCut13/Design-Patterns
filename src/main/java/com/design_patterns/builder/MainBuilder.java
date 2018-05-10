package com.design_patterns.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Cook cook = new Cook();
        BurgerBuilder spicyBurger = new SpicyBurger();
        BurgerBuilder cheeseBurger = new CheeseBurger();
        BurgerBuilder classicBurger = new ClassicBurger();

        cook.setBurgerBuilder(spicyBurger);
        cook.buildBurger();
        Burger readySpicyBurger = cook.getBurger();
        System.out.println("Spicy burger: " + readySpicyBurger);
        cook.setBurgerBuilder(cheeseBurger);
        cook.buildBurger();
        Burger readyCheeseBurger = cook.getBurger();
        System.out.println("Cheese burger: " + readyCheeseBurger);
        cook.setBurgerBuilder(classicBurger);
        cook.buildBurger();
        Burger readyClassicBurger = cook.getBurger();
        System.out.println("Classic burger: " + readyClassicBurger);
    }
}
