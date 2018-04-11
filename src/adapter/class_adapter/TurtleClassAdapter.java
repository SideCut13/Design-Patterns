package adapter.class_adapter;

import adapter.TeenageMutantNinjaTurtle;
import adapter.Turtle;

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
