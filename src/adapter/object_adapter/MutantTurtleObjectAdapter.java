package adapter.object_adapter;

import adapter.MutantTurtle;
import adapter.Turtle;

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
