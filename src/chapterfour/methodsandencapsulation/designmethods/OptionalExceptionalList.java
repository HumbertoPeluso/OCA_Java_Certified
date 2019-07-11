package chapterfour.methodsandencapsulation.designmethods;

public class OptionalExceptionalList {
    public static void main(String[]args){
        /*
        In Java, code can indicate that something went wrong by throwing an exception. We’ll cover
        this in Chapter 6, “Exceptions.” For now, you just need to know that it is optional and
        where in the method signature it goes if present. In the example, InterruptedException is a
        type of Exception. You can list as many types of exceptions as you want in this clause separated by commas.
        */
    }

    public void zeroExceptions() { }
    public void oneException() throws IllegalArgumentException { }
    public void twoExceptions() throws IllegalArgumentException, InterruptedException { }

}
