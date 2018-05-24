package com.design_patterns;

import com.design_patterns.adapter.ChinesePondTurtle;
import com.design_patterns.adapter.MutantTurtle;
import com.design_patterns.adapter.TeenageMutantNinjaTurtle;
import com.design_patterns.adapter.Turtle;
import com.design_patterns.adapter.class_adapter.TurtleClassAdapter;
import com.design_patterns.adapter.object_adapter.MutantTurtleObjectAdapter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AdapterTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private Turtle turtle = new ChinesePondTurtle();
    private MutantTurtle mutantTurtle = new MutantTurtleObjectAdapter(turtle);
    private Turtle turtle2 = new TurtleClassAdapter();
    private MutantTurtle mutantTurtle2 = new TeenageMutantNinjaTurtle();
    private String expectedOutput;

    @BeforeEach
    public void setOutputBefore(){
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void turtleSoundOutputTest() {
        turtle.sound();
        expectedOutput = "Plum plum";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "TURTLE SOUND OUTPUT TEST FAILED");
    }
    @Test
    public void turtleEatOutputTest() {
        turtle.eat();
        expectedOutput = "I eat shrimps!";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "TURTLE EAT OUTPUT TEST FAILED");
    }
    @Test
    public void turtleAdapterSoundOutputTest() {
        turtle2.sound();
        expectedOutput = "DIE";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "TURTLE ADAPTER SOUND OUTPUT TEST FAILED");
    }
    @Test
    public void turtleAdapterEatOutputTest() {
        turtle2.eat();
        expectedOutput = "I eat tears of my enemies!";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "TURTLE ADAPTER EAT OUTPUT TEST FAILED");
    }
    @Test
    public void mutantTurtleSoundOutputTest() {
        mutantTurtle2.speak();
        expectedOutput = "DIE";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "MUTANT TURTLE SOUND OUTPUT TEST FAILED");
    }
    @Test
    public void mutantTurtleEatOutputTest() {
        mutantTurtle2.eat();
        expectedOutput = "I eat tears of my enemies!";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "MUTANT TURTLE EAT OUTPUT TEST FAILED");
    }
    @Test
    public void mutantTurtleAdapterSoundOutputTest() {
        mutantTurtle.speak();
        expectedOutput = "Plum plum";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "MUTANT TURTLE ADAPTER SOUND OUTPUT TEST FAILED");
    }
    @Test
    public void mutantTurtleAdapterEatOutputTest() {
        mutantTurtle.eat();
        expectedOutput = "I eat shrimps!";
        Assertions.assertEquals(expectedOutput, outputStream.toString(), "MUTANT TURTLE ADAPTER EAT OUTPUT TEST FAILED");
    }
    @AfterEach
    public void outputAfterEach(){
        System.err.println("Output: " + outputStream.toString());
    }
}
