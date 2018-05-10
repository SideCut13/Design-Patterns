package com.design_patterns.prototype;

public class AnimalCloneFactory {
    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
