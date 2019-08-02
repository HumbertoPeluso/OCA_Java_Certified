package chapterfive.classdesign.implementinginterfaces;

public class InheritingAnInterface {

    // 1 - An interface that extends another interface, as well as an abstract class that
          //implements an interface, inherits all of the abstract methods as its own abstract
         //methods.
    // 2 - The first concrete class that implements an interface, or extends an abstract class
          //that implements an interface, must provide an implementation for all of the inherited
         //abstract methods.
}

  //  Unlike an abstract class, though, an interface may extend multiple interfaces
  interface HasTail {
      public int getTailLength();
  }

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

interface Seal extends HasTail, HasWhiskers {
}

   /* What about an abstract class that implements an interface? In this scenario, the abstract
class is treated in the same way as an interface extending another interface. In other words,
        the abstract class inherits the abstract methods of the interface but is not required to implement them. */

abstract class HarborSeal implements HasTail, HasWhiskers {
}

//class LeopardSeal implements HasTail, HasWhiskers { // DOES NOT COMPILE - must implement all the interface methods within its definition
//}


// an interface can extend another interface, an interface cannot implement another interface