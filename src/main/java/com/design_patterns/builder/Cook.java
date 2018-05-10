package com.design_patterns.builder;

public class Cook {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }
    public Burger getBurger(){
        return burgerBuilder.getBurger();
    }
    public void buildBurger(){
        burgerBuilder.buildNewBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildVegetables();
        burgerBuilder.buildSauce();
        burgerBuilder.buildCheese();
    }

}
