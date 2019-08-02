package chapterfive.classdesign.implementinginterfaces;

public class StaticInterfaceMethods {

    /*A static method defi ned in an interface
    is not inherited in any classes that implement the interface.*/

    // 1 - Like all methods in an interface, a static method is assumed to be public and will not
          //compile if marked as private or protected.
    // 2 - To reference the static method, a reference to the name of the interface must be used.
}

interface Hop {
    static int getJumpHeight() { //  works just like a static method as defi ned in a class. In other words, it can be accessed without an instance of the class using the Hop.getJumpHeight() syntax.
        return 8;
    }
}

class Bunny implements Hop {
    public void printDetails() {
      //  System.out.println(getJumpHeight()); // DOES NOT COMPILE -  the static interface methods are not inherited by a class implementing the interface
        System.out.println(Hop.getJumpHeight());
    }
}

