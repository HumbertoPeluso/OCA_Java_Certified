package chapterfive.classdesign.introducingclassinheritance;

public class OverridingAMethod {
   /* What if there is a method defi ned in both the parent and child class? For example, you may
    want to defi ne a new version of an existing method in a child class that makes use of the
            defi nition in the parent class. In this case, you can override a method a method by declaring a new method with the signature and return type as the method in the parent class. As
    you may recall from Chapter 4, the method signature includes the name and list of input
    parameters.*/
}

 class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
      //  return getAverageWeight()+20; // INFINITE LOOP
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
   // 50.00
    // 70.00
}

// 1 -   The method in the child class must have the same signature as the method in the parent class.
// 2 - The method in the child class must be at least as accessible or more accessible than the method in the parent class.
// 3 - The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.

// 4 - If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types.