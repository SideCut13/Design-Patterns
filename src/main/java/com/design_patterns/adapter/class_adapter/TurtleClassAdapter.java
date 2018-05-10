package com.design_patterns.adapter.class_adapter;

import com.design_patterns.adapter.TeenageMutantNinjaTurtle;
import com.design_patterns.adapter.Turtle;

public class TurtleClassAdapter extends TeenageMutantNinjaTurtle implements Turtle{

    @Override
    public void sound() {
        super.speak();
    }

    @Override
    public void eat(){
        super.eat();
    }
}
