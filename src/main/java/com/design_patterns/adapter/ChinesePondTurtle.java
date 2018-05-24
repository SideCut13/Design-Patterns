package com.design_patterns.adapter;

public class ChinesePondTurtle implements Turtle {

    @Override
    public void sound() {
        System.out.print("Plum plum");
    }

    @Override
    public void eat() {
        System.out.print("I eat shrimps!");
    }
}
