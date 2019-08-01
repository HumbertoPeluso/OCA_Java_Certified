package chapterfive.classdesign.introducingclassinheritance;

public class OverridingVsHidingMethods {

    /*At runtime the child version of an overridden method is always executed for an instance
    regardless of whether the method call is defi ned in a parent or child class method. In this
    manner, the parent method is never used unless an explicit call to the parent method is
    referenced, using the syntax ParentClassName.method(). Alternatively, at runtime the parent version of a hidden method is always executed if the call to the method is defi ned in the
    parent class.
*/
}

class Marsupial {
    public static boolean isBiped() { //  returns false
        return false;
    }
    public void getMarsupialDescription() { // executes a method of isBiped(), which hides the parent method’s version and returns true
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

class Kangaroo extends Marsupial {
    public static boolean isBiped() { // returns true
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
    /*Marsupial walks on two legs: false
      Kangaroo hops on two legs: true*/

// Contrast this fi rst example with the following example, which uses an overridden version of isBiped() instead of a hidden version

class Marsupial2 {
    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

class Kangaroo2 extends Marsupial2 {
    public boolean isBiped() { //  is overridden, not hidden, in the child class
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}

    /*Marsupial walks on two legs: true
      Kangaroo hops on two legs: true*/