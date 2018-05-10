package com.design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        AnimalCloneFactory animalCloneFactory = new AnimalCloneFactory();
        List<String> strings = new ArrayList<>();
        Sheep sheep = new Sheep("Dolly", strings);
        strings.add(sheep.getName());
        Sheep sheep2 = (Sheep) animalCloneFactory.getClone(sheep);
        strings.add(sheep2.getName());

        System.out.println("Clone sheep: " + sheep2.getName());
        System.out.println("First sheep list: " + sheep.getSheepList());
        System.out.println("Clone sheep list: " + sheep2.getSheepList());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Element list " + i + " value " + strings.get(i));
        }
        System.out.println("Identity first sheep:" + System.identityHashCode(sheep));
        System.out.println("Identity clone sheep:" + System.identityHashCode(sheep2));

        if(sheep.getName() == sheep2.getName()){
            System.out.println("Name ok!");
        }
        if(sheep.getSheepList() == sheep2.getSheepList()){
            System.out.println("Sheep list ok!");
        }


    }
}
