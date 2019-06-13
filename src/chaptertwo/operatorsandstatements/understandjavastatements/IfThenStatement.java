package chaptertwo.operatorsandstatements.understandjavastatements;

public class IfThenStatement {
    /*Often, we only want to execute a block of code under certain circumstances. The if-then
    statement, as shown in Figure 2.2, accomplishes this by allowing our application to execute
    a particular block of code if and only if a boolean expression evaluates to true at runtime.*/
    public static void main(String[] args) {
        int hourOfDay = 10;
        int morningGreetingCount = 0;
        if (hourOfDay < 11)
            System.out.println("Good Morning");

        if(hourOfDay < 11) { // brackets are optional for single statement and required for multiple statements
            System.out.println("Good Morning");
            morningGreetingCount++;
        }
    }
}
