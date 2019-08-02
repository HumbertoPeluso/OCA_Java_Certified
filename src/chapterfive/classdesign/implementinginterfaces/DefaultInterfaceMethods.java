package chapterfive.classdesign.implementinginterfaces;

public class DefaultInterfaceMethods {

    /*An interface is an abstract data type that defi nes a list of abstract
    public methods that any class implementing the interface must provide. An interface can
also include a list of constant variables and default methods, which we’ll cover in this section.*/

    /*A default method is a method defi ned within an
    interface with the default keyword in which a method body is provided*/

    // 1 - A default method may only be declared within an interface and not within a class or
          //abstract class.
    // 2 - A default method must be marked with the default keyword. If a method is marked as
           //default, it must provide a method body.
    // 3 - A default method is not assumed to be static, final, or abstract, as it may be used
          //or overridden by a class that implements the interface.
    // 4 - Like all methods in an interface, a default method is assumed to be public and will not
           //compile if marked as private or protected.

}

interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() { //default method provides a body.
        return 10.0;
    }
}

    /* Any class that implements IsWarmBlooded may rely on the default
    implementation of getTemperature() or
        override the method and create its own version.*/