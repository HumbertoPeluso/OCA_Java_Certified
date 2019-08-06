package chapterfive.classdesign.implementinginterfaces;

public class AbstractMethodsAndMultipleInheritance {

    /*Since Java allows for multiple inheritance via interfaces, you might be wondering what
    will happen if you defi ne a class that inherits from two interfaces that contain the same
    abstract method:*/
}

interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();

    public void eatMeat();
}

/*
In this scenario, the signatures for the two interface methods eatPlants() are compatible, so you can defi ne a class
that fulfills both interfaces simultaneously*/
class Bear implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

   /* If two abstract interface methods have identical behaviors—or in this case the same method
        signature— creating a class that implements one of the two methods automatically implements the second
        method. In this manner, the interface methods are considered duplicates
        since they have the same signature.
*/

   /*Unfortunately, if the method name and input parameters are the same but the return
           types are different between the two methods, the class or interface attempting to inherit
        both interfaces will not compile*/

 interface Herbivore2 {
    public int eatPlants();
}

interface Omnivore2 {
    public void eatPlants();
}

// class Bear2 implements Herbivore2, Omnivore2 {

  /*  public int eatPlants() { // DOES NOT COMPILE - two methods and same signature (except return type)
        System.out.println("Eating plants: 10");
        return 10;
    }*/
    /*public void eatPlants() { // DOES NOT COMPILE - two methods and same signature (except return type)
        System.out.println("Eating plants");
    }*/
//}