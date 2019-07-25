package chapterfour.methodsandencapsulation.encapsulatingdata;

public class CreatingImmutableClasses {
    /*Encapsulation means we set up the class so only methods
            in the class with the variables can refer to the instance variables.*/
}

class Swan {
    private int numberEggs; // private

    public int getNumberEggs() {  // getter
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {  // setter
        if(numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
    }
}
