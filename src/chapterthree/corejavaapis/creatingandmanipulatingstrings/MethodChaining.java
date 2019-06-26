package chapterthree.corejavaapis.creatingandmanipulatingstrings;

public class MethodChaining {
public static void main(String[]args){

    String start = "AniMaL ";
    String trimmed = start.trim(); // "AniMaL"
    String lowercase = trimmed.toLowerCase(); // "animal"
    String result = lowercase.replace('a', 'A'); // "Animal"
    System.out.println(result);

    /*This is just a series of String methods. Each time one is called, the returned value is put
    in a new variable. There are four String values along the way, and Animal is output.
            However, on the exam there is a tendency to cram as much code as possible into a small
    space. You’ll see code using a technique called method chaining. Here’s an example:*/

    String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
    System.out.println(result2);
  //  This code is equivalent to the previous example

   // Remember that String is immutable. What do you think the result of this code is?

     String a = "abc";
     String b = a.toUpperCase();
     b = b.replace("B", "2").replace('C', '3');
     System.out.println("a=" + a);
     System.out.println("b=" + b);
}


}
