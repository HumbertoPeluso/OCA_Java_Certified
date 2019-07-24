package chapterfour.methodsandencapsulation.overloadingmethods;

public class Autoboxing {

    /*Java will convert a primitive int to an object Integer
    to add it to an ArrayList through the wonders of autoboxing*/

    public static void main(String[] args) {

        fly(3); // Java will match the int numMiles version. Java tries to use the most specifi c parameter
        /*list it can fi nd. When the primitive int version isn't present, it will autobox. However, when
        the primitive int version is provided, there is no reason for Java to do the extra work of
        autoboxing.*/

    }

    public static void fly(Integer numMiles) {
    }

    public static void fly(int numMiles) {
    }

}
