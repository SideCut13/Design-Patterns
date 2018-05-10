package com.design_patterns.adapter.object_adapter;

import com.design_patterns.adapter.MutantTurtle;
import com.design_patterns.adapter.Turtle;

public class MutantTurtleObjectAdapter implements MutantTurtle{

    private Turtle turtle;

    public MutantTurtleObjectAdapter(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void speak() {
        turtle.sound();
    }

    @Override
    public void eat() {
        turtle.eat();
    }
}
