package com.design_patterns.builder;

public class Burger {
    private String bun;
    private String meat;
    private String vegetables;
    private String sauce;
    private String cheese;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    public String getSauce() {
        return sauce;
    }

    public String getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "bun = " + bun + ", meat = " + meat + ", vegetables = " + vegetables + ", sauce = " + sauce + ", cheese = " + cheese;
    }
}
