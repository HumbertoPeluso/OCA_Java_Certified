package chapterfour.methodsandencapsulation.creatingcrunstructors;

public class DefaultConstructor {
    /*Every class in Java has a constructor whether you code one or not. If you don’t include any
    constructors in the class, Java will create one for you without any parameters.*/
}

class Rabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(); // Calls default constructor

        //  look at how to call these constructors

        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
     //   Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE - constructor has private access
    }
}

class Rabbit1 { // only who calls default constructor
}
class Rabbit2 {
    public Rabbit2() { }
}
class Rabbit3 {
    public Rabbit3(boolean b) { }
}
class Rabbit4 {
    private Rabbit4() { }
}
