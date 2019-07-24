package chapterfour.methodsandencapsulation.passingdataamongmethods;

public class PassingDataAmongMethods {

    /*Java is a “pass-by-value” language. This means that a copy of the variable is made and the
    method receives that copy. Assignments made in the method do not affect the caller.*/

    public static void main(String[]args){
        int num = 4;
        newNumber(5);
        System.out.println(num); // 4
        System.out.println("......................");

       /* Now that you’ve seen primitives, let’s try an example with a reference type. What do you
        think is output by the following code?*/

        String name = "Webby";
        speak(name);
        System.out.println(name); // Webby

        System.out.println("...............");

        /*As an example, we have code that calls a method on the
        StringBuilder passed into the method:*/

        StringBuilder name2 = new StringBuilder();
        speak(name2);
        System.out.println(name2); // Webby
    }

    public static void newNumber(int num){
        num = 8;
    }

    private static void speak(String name) {
        name = "Sparky";
    }

    private static void speak(StringBuilder s) {
        s.append("Webby");
    }


}
