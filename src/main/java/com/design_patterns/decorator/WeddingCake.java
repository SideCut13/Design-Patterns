package com.design_patterns.decorator;

public class WeddingCake extends CakeDecorator{
    public WeddingCake(Cake cake){
        super(cake);
    }

    @Override
    public void decorate(){
        super.decorate();
        System.out.print("Add 5 layers with almond cream, white and pink sugar roses, figurine of happy couple at the top. ");
    }
}
