package chapterfive.classdesign.creatingabstractclasses;

public class DefiningAnAbstractClass {
    /*In fact, an abstract class is not required to
            include any abstract methods.*/
}

abstract class Cow { //Although an abstract class doesn’t have to implement any abstract methods, an abstract
                     // method may only be defi ned in an abstract class
}

class Chicken {
 //   public abstract void peck(); // DOES NOT COMPILE - an abstract method is not defi ned within an abstract class
}

abstract class Turtle {
  //  public abstract void swim() {} // DOES NOT COMPILE -  two brackets are provided instead of a semicolon, and Java interprets this as providing a body to an abstract method
   // public abstract int getAge() { // DOES NOT COMPILE -  it also provides a body to an abstract method
     //   return 10;
    //}
}