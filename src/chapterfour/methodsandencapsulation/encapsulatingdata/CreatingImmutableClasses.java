package chapterfour.methodsandencapsulation.encapsulatingdata;

public class CreatingImmutableClasses {

    /*Encapsulating data is helpful because it prevents callers from making uncontrolled changes
    to your class. Another common technique is making classes immutable so they cannot be
    changed at all.*/

    /*Immutable classes are helpful because you know they will always be the same. You can
    pass them around your application with a guarantee that the caller didn’t change anything*/
}

class ImmutableSwan {
    private int numberEggs;

    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    //Immutable class doesn't have setter method

    //be careful with the type StringBuilder
}
