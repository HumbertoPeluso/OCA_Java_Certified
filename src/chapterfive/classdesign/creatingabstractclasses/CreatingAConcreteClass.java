package chapterfive.classdesign.creatingabstractclasses;

public class CreatingAConcreteClass {

    /*When working with abstract classes, it is important to remember that by themselves, they
    cannot be instantiated and therefore do not do much other than defi ne static variables and
    methods.*/
}

abstract class Eel {
    public static void main(String[] args) {
      //  final Eel eel = new Eel(); // DOES NOT COMPILE - cannot be instantiated
    }
}

    /*When you see a concrete class extending an abstract
class on the exam, check that it implements all of the required abstract methods.*/

abstract class Animal2 {
    public abstract String getName();
}

// public class Walrus extends Animal2 { // DOES NOT COMPILE - need to implements methods from abstract class
// }

