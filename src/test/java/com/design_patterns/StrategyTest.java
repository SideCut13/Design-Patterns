package com.design_patterns;

import com.design_patterns.strategy.Flamingo;
import com.design_patterns.strategy.Kiwi;
import com.design_patterns.strategy.fly.FlyImpl1;
import com.design_patterns.strategy.fly.FlyImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    private Kiwi kiwi = new Kiwi(new FlyImpl2());
    private Flamingo flamingo = new Flamingo(new FlyImpl2());
    private String expectedOutput;

    @Test
    public void kiwiImpl1Test() {
        kiwi.setFly(new FlyImpl1());
        expectedOutput = "I can fly so high !";
        Assertions.assertEquals(expectedOutput, kiwi.toString(), "KIWI IMPL1 OUTPUT TEST FAILED");
    }
    @Test
    public void kiwiOutputImpl2Test() {
        expectedOutput = "I can't fly :(";
        Assertions.assertEquals(expectedOutput, kiwi.toString(), "KIWI IMPL2 OUTPUT TEST FAILED");
    }
    @Test
    public void flamingoImpl1Test() {
        flamingo.setFly(new FlyImpl1());
        expectedOutput = "I can fly so high !";
        Assertions.assertEquals(expectedOutput, flamingo.toString(), "FLAMINGO IMPL1 OUTPUT TEST FAILED");
    }
    @Test
    public void flamingoOutputImpl2Test() {
        expectedOutput = "I can't fly :(";
        Assertions.assertEquals(expectedOutput, flamingo.toString(), "FLAMINGO IMPL2 OUTPUT TEST FAILED");
    }
    @Test
    public void flamingoKiwiEqualsImpl1Test(){
        kiwi.setFly(new FlyImpl1());
        flamingo.setFly(new FlyImpl1());
        Assertions.assertEquals(kiwi.toString(), flamingo.toString(), "KIWI AND FLAMINGO IMPL1 TEST EQUALS FAILED");
    }
    @Test
    public void flamingoKiwiEqualsImpl2Test(){
        Assertions.assertEquals(kiwi.toString(), flamingo.toString(), "KIWI AND FLAMINGO IMPL2 TEST EQUALS FAILED");
    }
    @Test
    public void flamingoKiwiNotEqualsTest1(){
        flamingo.setFly(new FlyImpl1());
        Assertions.assertNotEquals(kiwi.toString(), flamingo.toString(), "KIWI AND FLAMINGO TEST 1 NOT EQUALS FAILED");
    }
    @Test
    public void flamingoKiwiNotEqualsTest2(){
        kiwi.setFly(new FlyImpl1());
        Assertions.assertNotEquals(kiwi.toString(), flamingo.toString(), "KIWI AND FLAMINGO TEST 2 NOT EQUALS FAILED");
    }
}
