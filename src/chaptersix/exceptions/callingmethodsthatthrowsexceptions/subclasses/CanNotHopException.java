package chaptersix.exceptions.callingmethodsthatthrowsexceptions.subclasses;

public class CanNotHopException extends Exception {

    class Hopper {
        public void hop() /*second attemp*/  throws CanNotHopException{ }
    }

    class Bunny extends Hopper {
       // public void hop() throws CanNotHopException { } // DOES NOT COMPILE

      // Java knows hop() isn’t allowed to throw any checked exceptions because the superclass
      //  Hopper doesn’t declare any.

        public void hop(){
        }

        /*A subclass not declaring an exception is similar to a method declaring it throws an
        exception that it never actually throws. This is perfectly legal.*/


    }


}
