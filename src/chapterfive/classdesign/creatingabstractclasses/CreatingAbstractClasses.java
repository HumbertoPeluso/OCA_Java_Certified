package chapterfive.classdesign.creatingabstractclasses;

public class CreatingAbstractClasses {

    /* An abstract class is a class that is marked with the abstract keyword and cannot be instantiated.
     An abstract method is a method marked with the abstract keyword defi ned in an
    abstract class, for which no implementation is provided in the class in which it is declared.*/

    // Abstract Class Defi nition Rules:
    // 1 - Abstract classes cannot be instantiated directly.
    // 2 - Abstract classes may be defined with any number, including zero, of abstract and nonabstract methods.
    // 3 - Abstract classes may not be marked as private or final
    // 4 - An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
    // 5 - The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

   // Abstract Method Defi nition Rules:

    // 1 - Abstract methods may only be defined in abstract classes.
    // 2 - Abstract methods may not be declared private or final.
    // 3 - Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
    // 4 - Implementing an abstract method in a subclass follows the same rules for overriding a
           //method. For example, the name and signature must be the same, and the visibility of
          //the method in the subclass must be at least as accessible as the method in the parent
         //class.
}

abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}

class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
}