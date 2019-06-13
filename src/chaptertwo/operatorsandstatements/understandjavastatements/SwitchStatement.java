package chaptertwo.operatorsandstatements.understandjavastatements;

public class SwitchStatement {
    /*Data types supported by switch statements include the following:
            ■ int and Integer
■ byte and Byte
■ short and Short
■ char and Character
■ int and Integer
■ String
■ enum values
For the exam, we recommend you memorize this list. Note that boolean and long, and
    their associated wrapper classes, are not supported by switch statements.*/
    public static void main(String[] args) {

        int dayOfWeek = 5;
        //  keyword
        switch (dayOfWeek) {
            default: //Optional default that may appear anywhere within switch statement
                System.out.println("Weekday");
                break; //break is optional
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        System.out.println("..........End of first example");
        System.out.println("");
        System.out.println("");

        //without some breaks

        int dayOfWeek2 = 5;
        switch(dayOfWeek2) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        System.out.println("..........End of secong example");
        System.out.println("");
        System.out.println("");




    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
          //  case middleName: // DOES NOT COMPILE  because middleName is not a
            //final variable, despite having a known value at this particular line of execution
          //      id = 5;
         //       break;
            case suffix: //Compiles because suffix is a final constant variable
                id = 0;
                break;
         //   case lastName: // DOES NOT COMPILE  despite lastName being final, it is not constant as it is passed to the function
         //      id = 8;
         //       break;
        //    case 5: // DOES NOT COMPILE
        //        id = 7;
          //      break;
        //    case 'J': // DOES NOT COMPILE
         //       id = 10;
          //      break;
          //  case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
          //      id=15;
           //     break;
        }
        return id;
    }

}
