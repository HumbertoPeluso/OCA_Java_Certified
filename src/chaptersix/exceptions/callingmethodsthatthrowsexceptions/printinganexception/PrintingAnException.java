package chaptersix.exceptions.callingmethodsthatthrowsexceptions.printinganexception;

public class PrintingAnException {

    /*There are three ways to print an exception. You can let Java print it out, print just the message,
    or print where the stack trace comes from. This example shows all three approaches:*/
    public static void main(String[]args){
        try{
            hop();
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop(){
        throw new RuntimeException("cannot hop");

       /* java.lang.RuntimeException: cannot hop
        cannot hop
        java.lang.RuntimeException: cannot hop
        at trycatch.Handling.hop(Handling.java:15)
        at trycatch.Handling.main(Handling.java:7)*/

    }

}
