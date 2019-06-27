package chapterthree.corejavaapis.understandingarraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingAnArrayList {
    public static void main(String[]args){

        /*add()
        The add() methods insert a new value in the ArrayList. The method signatures are as
        follows:*/
        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]

        /*Now, let’s use generics to tell the compiler we only want to allow String objects in
        our ArrayList:*/
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
       // safer.add(Boolean.TRUE); // DOES NOT COMPILE

     //   Now let’s try adding multiple values to different positions.
        List<String> birds = new ArrayList<>();
         birds.add("hawk"); // [hawk]
         birds.add(1, "robin"); // [hawk, robin]
         birds.add(0, "blue jay"); // [blue jay, hawk, robin]
         birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
         System.out.println(birds); // [blue jay, cardinal, hawk, robin]

        /*remove()
        The remove() methods remove the fi rst matching value in the ArrayList or remove the
        element at a specifi ed index. The method signatures are as follows:*/
         List<String> birds2 = new ArrayList<>();
         birds2.add("hawk"); // [hawk]
         birds2.add("hawk"); // [hawk, hawk]
         System.out.println(birds2.remove("cardinal")); // prints false
         System.out.println(birds2.remove("hawk")); // prints true
         System.out.println(birds2.remove(0)); // prints hawk
         System.out.println(birds2); // []

       // set()
       /* The set() method changes one of the elements of the ArrayList without changing the size.
                The method signature is as follows:*/
         List<String> birds3 = new ArrayList<>();
         birds3.add("hawk"); // [hawk]
         System.out.println(birds3.size()); // 1
         birds3.set(0, "robin"); // [robin]
         System.out.println(birds3.size()); // 1
         birds3.set(1, "robin"); // IndexOutOfBoundsException


      //  isEmpty() and size()
       /* The isEmpty() and size() methods look at how many of the slots are in use. The method
        signatures are as follows:*/
        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty()); // true
        System.out.println(birds4.size()); // 0
        birds4.add("hawk"); // [hawk]
        birds4.add("hawk"); // [hawk, hawk]
        System.out.println(birds4.isEmpty()); // false
        System.out.println(birds4.size()); // 2

       // clear()
        /*The clear() method provides an easy way to discard all elements of the ArrayList. The
        method signature is as follows:*/
        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        birds5.add("hawk"); // [hawk, hawk]
        System.out.println(birds5.isEmpty()); // false
        System.out.println(birds5.size()); // 2
        birds5.clear(); // []
        System.out.println(birds5.isEmpty()); // true
        System.out.println(birds5.size()); // 0

       // contains()
        /*The contains() method checks whether a certain value is in the ArrayList. The method
        signature is as follows:*/
        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk"); // [hawk]
        System.out.println(birds6.contains("hawk")); // true
        System.out.println(birds6.contains("robin")); // false

        /*equals()
        Finally, ArrayList has a custom implementation of equals() so you can compare two lists
        to see if they contain the same elements in the same order.*/
         List<String> one = new ArrayList<>();
         List<String> two = new ArrayList<>();
         System.out.println(one.equals(two)); // true
         one.add("a"); // [a]
         System.out.println(one.equals(two)); // false
         two.add("a"); // [a]
         System.out.println(one.equals(two)); // true
         one.add("b"); // [a,b]
         two.add(0, "b"); // [b,a]
         System.out.println(one.equals(two)); // false

    }
}
