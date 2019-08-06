package chaptersix.exceptions.understandingexceptions.throwinganexception;

public class ThrowingAnException {
    public static void main(String[]args) throws Exception {
        String[] animals = new String[0];
        System.out.println(animals[0]);

       /* This code throws an ArrayIndexOutOfBoundsException. That means questions about
        exceptions can be hidden in questions that appear to be about something else.*/

        /*The second way for code to result in an exception is to explicitly request Java to throw
                one. Java lets you write statements like these:*/

       // throw new Exception();
      //  throw new Exception("Ow! I fell.");
      //  throw new RuntimeException();
        throw new RuntimeException("Ow! I fell.");

        /*
        Type                    How to recognize            Ok for program            Is program required
                                                            to catch                  to handle or declare

        Runtime Exception       Subclass of                  yes                        No
                                RunTimeException

        Checked Ecxception      Subclass of Exception        yes                        yes
                                but not subclass of
                                RuntimeException

        Error                   Subclass of Error             No                         No

        */

    }
}
