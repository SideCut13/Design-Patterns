package com.design_patterns;

import com.design_patterns.prototype.AnimalCloneFactory;
import com.design_patterns.prototype.Sheep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    private AnimalCloneFactory animalCloneFactory = new AnimalCloneFactory();
    private List<String> sheepList = new ArrayList<>();
    private Sheep sheep = new Sheep("Dolly", sheepList);
    private Sheep sheep2 = (Sheep) animalCloneFactory.getClone(sheep);

    @Test
    public void sheepNameEqualsTest(){
        Assertions.assertEquals(sheep.getName(), sheep2.getName(), "SHEEP NAMES EQUALS TEST FAILED");
    }
    @Test
    public void sheepObjectEqualsTest(){
        Assertions.assertNotEquals(sheep, sheep2, "SHEEP OBJECT NOT EQUALS TEST FAILED");
    }
    @Test
    public void sheepListNotEqualsTest(){
        sheepList.add(sheep.getName());
        sheepList.add(sheep2.getName());
        Assertions.assertNotEquals(sheep.getSheepList(), sheep2.getSheepList(), "SHEEP LIST NOT EQUALS TEST FAILED");
    }
    @Test
    public void sheepHashcodeNotEqualsTest() {
        Assertions.assertNotEquals(System.identityHashCode(sheep), System.identityHashCode(sheep2), "SHEEP HASHCODE NOT EQUALS TEST FAILED");
    }
}
