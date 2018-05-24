package com.design_patterns.adapter;

public class TeenageMutantNinjaTurtle implements MutantTurtle {

    @Override
    public void speak() {
        System.out.print("DIE");
    }

    @Override
    public void eat() {
        System.out.print("I eat tears of my enemies!");
    }
}
