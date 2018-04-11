package adapter;

public class ChinesePondTurtle implements Turtle {

    @Override
    public void sound() {
        System.out.println("Plum plum");
    }

    @Override
    public void eat() {
        System.out.println("I eat shrimps!");
    }
}
