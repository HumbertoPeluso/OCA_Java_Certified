package chapterone.javabuildingblocks.distinguishingbetweenobjectsreferencesandprimitives;


/*There are a few important differences you should know between primitives and reference
        types. First, reference types can be assigned null, which means they do not currently refer
        to an object. Primitive types will give you a compiler error if you attempt to assign them
        null.*/
public class KeyDifferences {
    // int value = null; // DOES NOT COMPILE
    String s = null;

    /*reference types can be used to call methods when they do not point to null.
    Primitives do not have methods declared on them.*/
    String reference = "hello";
    int len = reference.length();
   // int bad = len.length(); // DOES NOT COMPILE
}
