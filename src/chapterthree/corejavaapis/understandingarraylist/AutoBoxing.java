package chapterthree.corejavaapis.understandingarraylist;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[]args){
        /*Why won’t you need to be concerned with whether a primitive or wrapper class is returned,
                you ask? Since Java 5, you can just type the primitive value and Java will convert it to the
        relevant wrapper class for you. This is called autoboxing. Let’s look at an example:*/
         List<Double> weights = new ArrayList<>();
         weights.add(50.5); // [50.5] --  autoboxes the double primitive into a Double object and adds that to the List
         weights.add(new Double(60)); // [50.5, 60.0] --  shows that you can still write code the long way and pass in a wrapper object
         weights.remove(50.5); // [60.0] --  again autoboxes into the wrapper object and passes it to remove()
         double first = weights.get(0); // 60.0 --  retrieves the Double and unboxes it into a double primitive

       // What do you think happens if you try to unbox a null?
         List<Integer> heights = new ArrayList<>();
         heights.add(null);
         int h = heights.get(0); // NullPointerException

      //  Be careful when autoboxing into Integer. What do you think this code outputs?
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers); //1
    }
}
