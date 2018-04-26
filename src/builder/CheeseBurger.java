package builder;

public class CheeseBurger extends BurgerBuilder{
    @Override
    public void buildBun() {
        burger.setBun("wheat");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("beef");
    }

    @Override
    public void buildVegetables() {
        burger.setVegetables("lettuce, tomato");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("ketchup");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("cheddar, rokpol, mozzarella, smoked cheese");
    }

}
