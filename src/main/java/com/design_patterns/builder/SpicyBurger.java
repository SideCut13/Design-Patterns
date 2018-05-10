package com.design_patterns.builder;

public class SpicyBurger extends BurgerBuilder{
    @Override
    public void buildBun() {
        burger.setBun("wheat");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("pork");
    }

    @Override
    public void buildVegetables() {
        burger.setVegetables("jalapeno, chilli, red onion, arugula");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("tabasco, tears of the devil");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("cheddar");
    }

}
