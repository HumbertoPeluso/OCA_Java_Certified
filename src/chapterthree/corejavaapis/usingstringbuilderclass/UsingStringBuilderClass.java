package chapterthree.corejavaapis.usingstringbuilderclass;

public class UsingStringBuilderClass {
    public static void main(String[] args) {

    /* A small program can create a lot of String objects very quickly. For example, how many
do you think this piece of code creates?*/

        String alpha = "";
        for (
                char current = 'a';
                current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

        /*The empty String on line 10 is instantiated, and then line 12 appends an "a". However,
                because the String object is immutable, a new String object is assigned to alpha and the
“” object becomes eligible for garbage collection. The next time through the loop, alpha is
        assigned a new String object, "ab", and the "a" object becomes eligible for garbage
        collection. The next iteration assigns alpha to "abc" and the "ab" object becomes eligible
        for garbage collection, and so on.*/

        /*The StringBuilder class
        creates a String without storing all those interim String values. Unlike the String class,
        StringBuilder is not immutable.*/

         StringBuilder alpha2 = new StringBuilder(); //  a new StringBuilder object is instantiated
         for(char current = 'a'; current <= 'z'; current++)
             alpha2.append(current); //The call to append() adds a character to the StringBuilder object each time through the for loop and appends the value of current to the end of alpha
         System.out.println(alpha2);

         // This code reuses the same StringBuilder without
        //creating an interim String each time.

    }

}
