package chapterthree.corejavaapis.understandingarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {
    public static void main(String[]args){

         List<String> list = new ArrayList<>();
         list.add("hawk");
         list.add("robin");
         Object[] objectArray = list.toArray(); //  shows that an ArrayList knows how to convert itself to an array. The
                                               // only problem is that it defaults to an array of class Object. This
                                              // isn’t usually what you want

         System.out.println(objectArray.length); // 2
         String[] stringArray = list.toArray(new String[0]); // specifi es the type of the array and does what we
                                                            // actually want. The advantage of specifying a size of 0
                                                           // for the parameter is that Java will create a new array of
                                                          // the proper size for the return value. If you like, you can
                                                         // suggest a larger array to be used instead. If the ArrayList
                                                        // fi ts in that array, it will be returned. Otherwise, a new
                                                       // one will be created.

         System.out.println(stringArray.length); // 2

        /*When a change is made to one, it is available in the other. It
        is a fi xed-size list and is also known a backed List because the array changes with it. Pay
        careful attention to the values here:*/
         String[] array = { "hawk", "robin" }; // [hawk, robin]
         List<String> list2 = Arrays.asList(array); // returns fixed size list
         System.out.println(list2.size()); // 2
         list2.set(1, "test"); // [hawk, test]
         array[0] = "new"; // [new, test]
         for (String b : array) System.out.print(b + " "); // new test
         list2.remove(1); // throws UnsupportedOperation Exception


    }
}
