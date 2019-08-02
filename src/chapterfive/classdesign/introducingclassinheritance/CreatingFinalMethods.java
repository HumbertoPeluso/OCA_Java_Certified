package chapterfive.classdesign.introducingclassinheritance;

public class CreatingFinalMethods {

    /*final methods cannot be overridden. If you recall our discussion of modifi ers from
    Chapter 4, you can create a method with the final keyword. By doing so, though, you forbid a child class from overriding this method. This rule is in place both when you override
    a method and when you hide a method. In other words, you cannot hide a static method in
    a parent class if it is marked as final.*/
}

class Bird2 {
    public final boolean hasFeathers() {
        return true;
    }
}

class Penguin extends Bird2 {
  //  public final boolean hasFeathers() { // DOES NOT COMPILE -  is marked as final in the parent class Bird,
    //so the child class Penguin cannot override the parent method, resulting in a compiler error.
    //    return false;
  //  }
}
