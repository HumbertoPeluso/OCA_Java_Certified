package chapterfive.classdesign.understandingpolymorphism;

public class PolymorphismAndMethodsOverriding {

    /*The fi rst rule is that an overridden method must be at least as accessible as the method it
    is overriding*/

}

class Animal {
    public String getName() {
        return "Animal";
    }
}

class Gorilla extends Animal {
  /*  protected String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }*/
}

class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
    }
}

/*
 this example creates an ambiguity problem in the ZooKeeper class. The
        reference animal.getName() is allowed because the method is public in the Animal class,
        but due to polymorphism, the Gorilla object itself has been overridden with a less accessible version, not available to the ZooKeeper class. This creates a contradiction in that the
        compiler should not allow access to this method, but because it is being referenced as an
        instance of Animal, it is allowed.*/
