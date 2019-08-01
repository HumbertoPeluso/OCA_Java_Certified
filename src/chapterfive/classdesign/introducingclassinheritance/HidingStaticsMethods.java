package chapterfive.classdesign.introducingclassinheritance;

public class HidingStaticsMethods {

   /* A hidden method occurs when a child class defi nes a static method with the same name
    and signature as a static method defi ned in a parent class. Method hiding is similar but
    not exactly the same as method overriding. First, the four previous rules for overriding a
    method must be followed when a method is hidden. In addition, a new rule is added for
    hiding a method, namely that the usage of the static keyword must be the same between
    parent and child classes.*/

   // 1 - The method in the child class must have the same signature as the method in the parent
    //class

    // 2 - The method in the child class must be at least as accessible or more accessible than the
    //method in the parent class

    // 3 - The method in the child class may not throw a checked exception that is new or
    //broader than the class of any exception thrown in the parent class method.

    // 4 - If the method returns a value, it must be the same or a subclass of the method in the
    //parent class, known as covariant return types.

    // 5 - The method defined in the child class must be marked as static if it is marked as
    //static in the parent class (method hiding). Likewise, the method must not be marked
    //as static in the child class if it is not marked as static in the parent class (method
    //overriding).
}

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
    // ///////////////////////

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    // //////////////////////

  /*  public void sneeze() { // DOES NOT COMPILE - sneeze() is marked as static in the parent class but not in the child class.
        System.out.println("Panda bear sneezes quietly");
    }*/

    /*public static void hibernate() { // DOES NOT COMPILE - is an instance member in the parent class but a static method in the child class
        System.out.println("Panda bear is going to sleep");
    }*/

    public static void main(String[] args) {
        Panda.eat();
    }
}
