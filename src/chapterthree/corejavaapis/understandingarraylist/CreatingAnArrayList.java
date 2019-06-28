package chapterthree.corejavaapis.understandingarraylist;

import java.util.ArrayList;
import java.util.List;

public class CreatingAnArrayList {
    public static void main(String[]args){
       // there are three ways to create an ArrayList:
        ArrayList list1 = new ArrayList(); // says to create an ArrayList containing space for the default number of
                                          //elements but not to fill any slots yet

        ArrayList list2 = new ArrayList(10); // create an ArrayList containing a specifi c number of slots, but again not to assign any

        ArrayList list3 = new ArrayList(list2); // tells Java that we
                                                //want to make a copy of another ArrayList. We copy both the size and contents of that
                                               //ArrayList.

        /*the new and improved way. Java 5 introduced generics, which allow you to specify the type
        of class that the ArrayList will contain.*/
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        /*you can store an ArrayList in a List reference variable but not vice
        versa. The reason is that List is an interface and interfaces can’t be instantiated.*/
        List<String> list6 = new ArrayList<>();
       // ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

    }
}
