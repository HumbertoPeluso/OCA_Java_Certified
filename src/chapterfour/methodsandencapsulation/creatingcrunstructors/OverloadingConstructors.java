package chapterfour.methodsandencapsulation.creatingcrunstructors;

public class OverloadingConstructors {
    /*You can have multiple constructors
    in the same class as long as they have different method signatures.*/

}

class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) { // first constructor
        this(weight, "brown"); // Constructor with "this" is the first statement
        this.weight = weight;
        color = "brown";
        //  Hamster(weight, color);  DOES NOT COMPILE - Constructors need new
        new Hamster(weight, "brown"); // Compiles but does not do what we want
        //  this(weight, "brown"); // DOES NOT COMPILE - "this" must be the first statement
    }

    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}

    /* Overloaded constructors often call each other. One common technique is to have each
        constructor add one parameter until getting to the constructor that does all the work.
        This approach is called constructor chaining. In this example, all three constructors are
        chained.*/

class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}
