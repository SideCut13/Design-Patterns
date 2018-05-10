package com.design_patterns.adapter;

public class TeenageMutantNinjaTurtle implements MutantTurtle {

    @Override
    public void speak() {
        System.out.println("DIE");
    }

    @Override
    public void eat() {
        System.out.println("I eat tears of my enemies!");
    }
}
