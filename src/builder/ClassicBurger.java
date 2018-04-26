package builder;

public class ClassicBurger extends BurgerBuilder{
    @Override
    public void buildBun() {
        burger.setBun("wholewheat");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("beef");
    }

    @Override
    public void buildVegetables() {
        burger.setVegetables("lettuce, pickle, tomato");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("mustard, ketchup");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("cheddar");
    }

}
