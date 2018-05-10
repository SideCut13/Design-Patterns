package com.design_patterns.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        System.out.println("BIRTHDAY CAKE:");
        Cake birthdayCake = new BirthdayCake(new BasicCake());
        birthdayCake.decorate();
        System.out.println("\n");



        System.out.println("WEDDING CAKE:");
        Cake weddingCake = new WeddingCake(new BasicCake());
        weddingCake.decorate();
        System.out.println("\n");



        System.out.println("RECYCLED CAKE:");
        System.out.println("The bride dumped groom right at the altar... so wedding cake is no more necessary. Let's redecorate it to Johns' birthday!");
        Cake weddingBirthdayCake = new BirthdayCake(new WeddingCake(new BasicCake()));
        weddingBirthdayCake.decorate();

    }
}
