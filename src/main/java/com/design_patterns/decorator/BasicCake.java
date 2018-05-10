package com.design_patterns.decorator;

public class BasicCake implements Cake {
    @Override
    public void decorate() {
        System.out.print("Basic, normal, boring cake. ");
    }
}
