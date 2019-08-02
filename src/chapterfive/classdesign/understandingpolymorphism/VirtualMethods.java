package chapterfive.classdesign.understandingpolymorphism;

public class VirtualMethods {

    /*The most important feature of polymorphism—and one of the primary reasons we have
    class structure at all—is to support virtual methods. A virtual method is a method in which
    the specifi c implementation is not determined until runtime. In fact, all non-fi nal, nonstatic, and non-private Java methods are considered virtual methods, since any of them can
    be overridden at runtime. What makes a virtual method special in Java is that if you call a
    method on an object that overrides a method, you get the overridden method, even if the
    call to the method is on a parent reference or within the parent class.*/
}

class Bird {
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}

class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }
    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
// The bird name is: Peacock

    /*even though the parent class Bird defi nes its own version of getName()
        and doesn’t know anything about the Peacock class during compile-time, at runtime the
        instance uses the overridden version of the method, as defi ned on the instance of the object. */



