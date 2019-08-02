package chapterfive.classdesign.understandingpolymorphism;

public class PolymorphicParameters {

    /*One of the most useful applications of polymorphism is the ability to pass instances of
    a subclass or interface to a method.*/
}

class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile "+reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());
    }
}

        /*Feeding: Alligator
        Feeding: Crocodile
        Feeding: Reptile*/