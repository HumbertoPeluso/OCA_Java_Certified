package chaptertwo.operatorsandstatements.understandjavastatements;

public class IfThenElseStatement {

    public static void main(String[] args) {
        int hourOfDay = 10;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }
        //code above is reduntant and can be improved

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }
        //the code above was improved with else statement

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
        /*In this example, the Java process will continue execution until it encounters an if-then
        statement that evaluates to true*/


        /*if-then-else statements is that order is important. For example, see what happens if we
        reorder the previous snippet of code as follows*/
        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

       /* int x = 1;
        if (x) { // DOES NOT COMPILE (x is not a boolean value

        }*/
    }

}
