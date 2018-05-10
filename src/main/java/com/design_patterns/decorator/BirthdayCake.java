package com.design_patterns.decorator;

public class BirthdayCake extends CakeDecorator{

    public BirthdayCake(Cake cake){
        super(cake);
    }
    @Override
    public void decorate(){
        super.decorate();
        System.out.print("Add rainbow colors, inscription 'HAPPY BIRTHDAY DUMMY', candles on the top. ");
    }
}