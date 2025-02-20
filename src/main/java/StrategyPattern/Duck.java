package StrategyPattern;

abstract class Duck {

    void quack() {}

    void swim() {}

    void fly() {}

    abstract void display();      // abstract because since all the  duck subtype look's different.

    // Other duck-like method's
}
