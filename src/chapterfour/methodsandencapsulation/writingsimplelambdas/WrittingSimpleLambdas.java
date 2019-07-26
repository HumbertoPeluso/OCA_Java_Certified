package chapterfour.methodsandencapsulation.writingsimplelambdas;

public class WrittingSimpleLambdas {
   /* Our goal is to print out all the animals in a list according to some criteria. We’ll show you
    how to do this without lambdas to illustrate how lambdas are useful. We start out with the
    Animal class:*/
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}
