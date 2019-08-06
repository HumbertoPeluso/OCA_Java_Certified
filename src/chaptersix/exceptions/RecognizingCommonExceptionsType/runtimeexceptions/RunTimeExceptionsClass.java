package chaptersix.exceptions.RecognizingCommonExceptionsType.runtimeexceptions;

public class RunTimeExceptionsClass {
    public static void main(String[]args){

       /* ArithmeticException

        Trying to divide an int by zero gives an undefi ned result. When this occurs, the JVM will
        throw an ArithmeticException:*/

        int answer = 11 / 0;

        /*ArrayIndexOutOfBoundsException

        You know by now that array indexes start with 0 and go up to 1 less than the length of the
        array—which means this code will throw an ArrayIndexOutOfBoundsException:*/

        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);

       /* ClassCastException

        Java tries to protect you from impossible casts. This code doesn’t compile because Integer
        is not a subclass of String:*/
        String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj;


    }

    /* IllegalArgumentException

       IllegalArgumentException is a way for your program to protect itself. We fi rst saw the
       following setter method in the Swan class in Chapter 4, “Methods and Encapsulation.”*/
    public void setNumberEggs(int numberEggs) {// setter
        if (numberEggs >= 0) // guard condition
          /*this*/  numberEggs = numberEggs;


       /* NumberFormatException

        Java provides methods to convert strings to numbers. When these are passed
        an invalid value, they throw a NumberFormatException. The idea is similar to
        IllegalArgumentException. Since this is a common problem, Java gives it a separate class.
        In fact, NumberFormatException is a subclass of IllegalArgumentException. Here’s an
        example of trying to convert something non-numeric into an int:*/

       Integer.parseInt("abc");

        /*Exception in thread "main" java.lang.NumberFormatException: For input string:
        "abc"*/

    }

    /*NullPointerException

        Instance variables and methods must be called on a non-null reference. If the reference is
        null, the JVM will throw a NullPointerException. It’s usually subtle, such as this example, which
        checks whether you remember instance variable references default to null.*/
    String name;
    public void printLength() throws NullPointerException {
        System.out.println(name.length());
    }
}
