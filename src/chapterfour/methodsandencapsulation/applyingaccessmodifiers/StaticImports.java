package chapterfour.methodsandencapsulation.applyingaccessmodifiers;

/*

Static imports are for importing static members of
classes.

you saw that we could import a specifi c class or all the classes in a
package:
*/

// import java.util.ArrayList;
// import java.util.*;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList; // static import

public class StaticImports {

    public static void main(String[]args){

        List<String> list = asList("one", "two"); // no Arrays

    }
}



