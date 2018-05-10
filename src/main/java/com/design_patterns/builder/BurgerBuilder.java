package com.design_patterns.builder;

public abstract class BurgerBuilder {
    protected Burger burger;

    public Burger getBurger() {
        return burger;
    }

    public void buildNewBurger(){
        burger = new Burger();
    }
    public abstract void buildBun();
    public abstract void buildMeat();
    public abstract void buildVegetables();
    public abstract void buildSauce();
    public abstract void buildCheese();
}
