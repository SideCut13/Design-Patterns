package decorator;

public class BasicCake implements Cake {
    @Override
    public void decorate() {
        System.out.print("Basic, normal, boring cake. ");
    }
}
