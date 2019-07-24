package chapterfour.methodsandencapsulation.overloadingmethods;

public class Primitives {

    /*Primitives work in a way similar to reference variables. Java tries to fi nd the most specifi c
    matching overloaded method. What do you think happens here?*/
}

class Plane {
    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123); // int
        p.fly(123L); // long
        /*If we comment out the overloaded
        method with the int parameter list, the output becomes long long*/

    }
}