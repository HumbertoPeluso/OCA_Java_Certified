package chaptersix.exceptions.usingatrystatement.throwingasecondexception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingASecondException {
    public static void main(String[]args){
        FileReader reader = null;
        try{
            reader = read();
        }catch (IOException e){
            try {
                if (reader != null) reader.close();
            }catch (IOException inner){
                
            }
        }
    }

    private static FileReader read()  throws IOException  {
        return null;
    }

    //What do you think this method returns? Go slowly. It’s tricky
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch(NullPointerException e){
                result += "catch";
                throw new RuntimeException();
            } finally{
                result += "finally";
                throw new Exception();
            }
        }catch (Exception e){
            result += "done";
        }
        return result;
    }

    /*The correct answer is before catch finally done. Everything is normal up until line
35, when "before" is added. Line 36 throws a NullPointerException. Line 37 is skipped
    as Java goes straight to the catch block. Line 38 does catch the exception, and "catch" is
    added on line 39. Then line 40 throws a RuntimeException. The finally block runs after
    the catch regardless of whether an exception is thrown; it adds "finally" to result*/

}
