package chapterthree.corejavaapis.understandingjavaarrays;

public class CreatingAnArrayWithReferenceVariables {
    /*You can choose any Java type to be the type of the array. This includes classes you create
    yourself. Let’s take a look at a built-in type with String:*/
}

 class ArrayType {
    public static void main(String args[]) {
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@

        /*Remember casting from the previous chapter when you wanted to force a bigger type
        into a smaller type? You can do that with arrays too:*/
         String[] strings = { "stringValue" }; // creates an array of type String
         Object[] objects = strings; // doesn’t require a cast because Object is  a broader type than String
         String[] againStrings = (String[]) objects; //  a cast is needed because we are moving to a more specifi c type
        // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE -- doesn’t compile because a String[] only allows String objects and
        //StringBuilder is not a String.
         /*objects[0] = new StringBuilder(); // careful! --  From the point of view of the compiler, this is just
        fi ne. A StringBuilder object can clearly go in an Object[]. The problem is that we don’t
        actually have an Object[]. We have a String[] referred to from an Object[] variable. At
        runtime, the code throws an ArrayStoreException. You don’t need to memorize the name
        of this exception, but you do need to know that the code will throw an exception.*/


    } }
