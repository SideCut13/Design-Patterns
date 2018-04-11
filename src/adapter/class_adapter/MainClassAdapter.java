package adapter.class_adapter;

import adapter.Turtle;

public class MainClassAdapter {
    public static void main(String[] args) {

        Turtle turtle = new TurtleClassAdapter();
        System.out.println("Turtle class adapter says: ");
        turtle.sound();
        turtle.eat();
    }
}