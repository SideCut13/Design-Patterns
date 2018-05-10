package com.design_patterns.strategy;

import com.design_patterns.strategy.fly.Fly;

public class Bird {

    private Fly fly;

    public Bird(Fly fly) {
        this.fly = fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return  fly.fly();
    }
}
