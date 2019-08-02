package chapterfive.classdesign.creatingabstractclasses;

public class ExtendingAnAbstractClass {
}

abstract class Animal3 {
    public abstract String getName();
}

abstract class Eagle extends Animal3 { // Does not implement getName because its also abstract
}

    /*abstract classes can extend other abstract classes and are
        not required to provide implementations for any of the abstract methods. It follows, then,
        that a concrete class that extends an abstract class must implement all inherited abstract
methods.*/

abstract class BigCat extends Animal {
    public abstract void roar();
}

class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

   /* it must implement all inherited
    abstract methods not defi ned in a parent class.*/
}