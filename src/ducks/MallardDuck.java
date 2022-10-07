package ducks;

import ducks.behavior.FlyWhithWings;
import ducks.behavior.Quack;

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWhithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
