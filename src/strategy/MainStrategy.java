package strategy;

import strategy.fly.FlyImpl1;
import strategy.fly.FlyImpl2;

public class MainStrategy {
    public static void main(String[] args) {

        Kiwi kiwi = new Kiwi(new FlyImpl1());
        kiwi.setFly(new FlyImpl2());
        System.out.println("Kiwi: " + kiwi.toString());

        Flamingo flamingo = new Flamingo(new FlyImpl2());
        System.out.println("Young flamingo: " + flamingo.toString());
        flamingo.setFly(new FlyImpl1());
        System.out.println("Old flamingo: " + flamingo.toString());
    }
}
