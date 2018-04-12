package prototype;

import java.util.ArrayList;
import java.util.List;

public class Sheep implements Animal {
    private String name;
    private List<String> sheepList;

    public Sheep(String name, List<String> sheepList) {
        this.name = name;
        this.sheepList = sheepList;
    }

    public String getName() {
        return name;
    }

    public List<String> getSheepList() {
        return sheepList;
    }

    @Override
    public Animal makeCopy() {
        Sheep sheep = null;
        try{
            Sheep sheepCopy = (Sheep) super.clone();
            sheep = new Sheep(new String(sheepCopy.getName()), new ArrayList<>(sheepCopy.getSheepList()));
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
