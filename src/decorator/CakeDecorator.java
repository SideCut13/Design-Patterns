package decorator;

public class CakeDecorator implements Cake{
    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void decorate() {
        this.cake.decorate();
    }
}
