package chapterfive.classdesign.understandingpolymorphism;

public class CastingObjects {
    //  polymorphism: the property of an object to take on many different forms

    // 1 - Casting an object from a subclass to a superclass doesn’t require an explicit cast.
    // 2 - Casting an object from a superclass to a subclass requires an explicit cast.
    // 3 - The compiler will not allow casts to unrelated types.
    // 4 - Even when the code compiles without issue, an exception may be thrown at runtime if
          //the object being cast is not actually an instance of that class.
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}
        /*10
        false
        true*/