package chapterthree.corejavaapis.understandingarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[]args){
      //  Sorting an ArrayList is very similar to sorting an array. You just use a different helper class:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers); // [5, 81, 99]
    }
}
