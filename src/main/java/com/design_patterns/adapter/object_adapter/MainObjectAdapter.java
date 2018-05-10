package com.design_patterns.adapter.object_adapter;

import com.design_patterns.adapter.ChinesePondTurtle;
import com.design_patterns.adapter.MutantTurtle;
import com.design_patterns.adapter.Turtle;

public class MainObjectAdapter {
    public static void main(String[] args) {

        Turtle turtle = new ChinesePondTurtle();
        MutantTurtle mutantTurtle = new MutantTurtleObjectAdapter(turtle);
        System.out.println("Mutant turtle object adapter says:");
        mutantTurtle.speak();
        mutantTurtle.eat();
    }
}
