package chaptersix.exceptions.RecognizingCommonExceptionsType.errors;

public class ErrorsClass {
    public static void main(String[]args){

        /*ExceptionInInitializerError

        Java runs static initializers the fi rst time a class is used. If one of the static initializers
throws an exception, Java can’t start using the class. It declares defeat by throwing an
        ExceptionInInitializerError. This code shows an ArrayIndexOutOfBounds in a static
        initializer:*/

        /*StackOverflowError

        When Java calls methods, it puts parameters and local variables on the stack. After doing
        this a very large number of times, the stack runs out of room and overfl ows. This is called a
        StackOverflowError. Most of the time, this error occurs when a method calls itself
          */


       /* NoClassDefFoundError

        This error won’t show up in code on the exam—you just need to know that it is an error.
        NoClassDefFoundError occurs when Java can’t fi nd the class at runtime.*/

    }

    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];

        /*Exception in thread "main" java.lang.ExceptionInInitializerError
        Caused by: java.lang.ArrayIndexOutOfBoundsException: -1*/
    }

    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);

      //  Exception in thread "main" java.lang.StackOverflowError
    }

}
