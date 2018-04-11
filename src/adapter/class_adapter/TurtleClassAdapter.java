package adapter.class_adapter;

import adapter.ChinesePondTurtle;
import adapter.MutantTurtle;

public class TurtleClassAdapter extends ChinesePondTurtle implements MutantTurtle {

    @Override
    public void speak() {
        super.sound();
    }

    @Override
    public void eat(){
        super.eat();
    }
}
