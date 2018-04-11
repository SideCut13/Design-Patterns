package adapter.object_adapter;

import adapter.ChinesePondTurtle;
import adapter.MutantTurtle;
import adapter.Turtle;

public class MainObjectAdapter {
    public static void main(String[] args) {

        Turtle turtle = new ChinesePondTurtle();
        MutantTurtle mutantTurtle = new MutantTurtleObjectAdapter(turtle);
        System.out.println("Mutant turtle object adapter says:");
        mutantTurtle.speak();
        mutantTurtle.eat();
    }
}
