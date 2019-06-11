package chapterone.javabuildingblocks.distinguishingbetweenobjectsreferencesandprimitives;


import java.util.Date;

/*A reference type refers to an object (an instance of a class). Unlike primitive types that hold
        their values in the memory where the variable is allocated, references do not hold the value
        of the object they refer to. Instead, a reference “points” to an object by storing the memory
        address where the object is located, a concept referred to as a pointer. Unlike other
        languages, Java does not allow you to learn what the physical memory address is. You can
        only use the reference to refer to the object*/
public class ReferenceTypes {

    java.util.Date today; //  is a reference of type Date and can only point to a Date object.
    String greeting; //  is a reference that can only point to a String object

    //the following statements assign these references to new objects:
    java.util.Date today2 = new java.util.Date();
    String greeting2 = "How are you?";


}
