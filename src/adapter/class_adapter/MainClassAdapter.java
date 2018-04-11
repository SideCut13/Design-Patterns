package adapter.class_adapter;

import adapter.MutantTurtle;

public class MainClassAdapter {
    public static void main(String[] args) {
        MutantTurtle mutantTurtle = new TurtleClassAdapter();
        System.out.println("Turtle class adapter says: ");
        mutantTurtle.speak();
        mutantTurtle.eat();
    }
}
