package chapterfive.classdesign.introducingclassinheritance;

public class UnderstandingCompilerEnhancements {

    /*Up to now, we defi ned numerous classes that did not explicitly call the parent constructor via the super() keyword, so why did the code compile? The answer is that the Java
    compiler automatically inserts a call to the no-argument constructor super() if the fi rst
    statement is not a call to the parent constructor. For example, the following three class
    and constructor defi nitions are equivalent, because the compiler will automatically convert
                    them all to the last example:*/

    public class Donkey {
    }
    public class Donkey1 {
        public Donkey1() {
        }
    }
    public class Donkey2 {
        public Donkey2() {
            super();
        }
    }

   /* Make sure you understand the differences between these three Donkey class defi nitions
            and why Java will automatically convert them all to the last defi nition. Keep the process the
    Java compile performs in mind as we discuss the next few examples.
    What happens if the parent class doesn’t have a no-argument constructor? Recall that
    the no-argument constructor is not required and only inserted if there is no constructor
    defi ned in the class. In this case, the Java compiler will not help and you must create at least
    one constructor in your child class that explicitly calls a parent constructor via the super()
    command. For example, the following code will not compile:*/

    public class Mammal {
        public Mammal(int age) {
        }
    }
  //  public class Elephant extends Mammal { // DOES NOT COMPILE
 //   }

    public class Elephant extends Mammal {
        public Elephant() {
            super(10);
        }
    }


}
