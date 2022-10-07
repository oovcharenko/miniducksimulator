package ducks.behavior;

import ducks.behavior.FlyBehavior;

public class FlyWhithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
