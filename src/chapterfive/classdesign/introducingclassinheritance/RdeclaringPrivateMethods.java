package chapterfive.classdesign.introducingclassinheritance;

public class RdeclaringPrivateMethods {

   /* Java permits you to redeclare a new method in the child class with the same or modifi ed signature as the method in the parent class. This method in the child class is a separate
            and independent method, unrelated to the parent version’s method, so none of the rules for
    overriding methods are invoked. For example, let’s return to the Camel example we used in
    the previous section and show two related classes that defi ne the same method:*/
}

 class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel {
    private int getNumberOfHumps() {
        return 2;
    }
}

   /* This code compiles without issue. Notice that the return type differs in the child method
        from String to int. In this example, the method getNumberOfHumps() in the parent class
is hidden, so the method in the child class is a new method and not an override of the
        method in the parent class. */