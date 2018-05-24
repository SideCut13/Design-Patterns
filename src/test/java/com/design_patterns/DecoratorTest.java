package com.design_patterns;

import com.design_patterns.decorator.BasicCake;
import com.design_patterns.decorator.BirthdayCake;
import com.design_patterns.decorator.Cake;
import com.design_patterns.decorator.WeddingCake;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoratorTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private Cake basicCake = new BasicCake();
    private Cake birthdayCake = new BirthdayCake(new BasicCake());
    private Cake weddingCake = new WeddingCake(new BasicCake());
    private Cake weddingBirthdayCake = new BirthdayCake(new WeddingCake(new BasicCake()));
    private String expectedOutput;

    @BeforeEach
    public void setOutputBefore(){
        System.setOut(new PrintStream(outputStream));
    }
    @Test
    public void birthdayCakeOutputTest() {
        birthdayCake.decorate();
        expectedOutput = "Basic, normal, boring cake. Add rainbow colors, inscription 'HAPPY BIRTHDAY DUMMY', candles on the top. ";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "BIRTHDAY CAKE OUTPUT TEST FAILED");
    }
    @Test
    public void weddingCakeOutputTest(){
        weddingCake.decorate();
        expectedOutput = "Basic, normal, boring cake. Add 5 layers with almond cream, white and pink sugar roses, figurine of happy couple at the top. ";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "WEDDING CAKE OUTPUT TEST FAILED");
    }
    @Test
    public void weddingBirthdayCakeOutputTest(){
        weddingBirthdayCake.decorate();
        expectedOutput = "Basic, normal, boring cake. Add 5 layers with almond cream, white and pink sugar roses, figurine of happy couple at the top. Add rainbow colors, inscription 'HAPPY BIRTHDAY DUMMY', candles on the top. ";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "RECYCLED CAKE OUTPUT TEST FAILED");
    }
    @Test
    public void basicCakeOutputTest(){
        basicCake.decorate();
        expectedOutput = "Basic, normal, boring cake. ";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "BASIC CAKE OUTPUT TEST FAILED");
    }
    @AfterEach
    public void outputAfterEach(){
        System.err.println("Output: " + outputStream.toString());
    }
}
