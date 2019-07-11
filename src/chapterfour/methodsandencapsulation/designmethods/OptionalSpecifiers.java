package chapterfour.methodsandencapsulation.designmethods;

public class OptionalSpecifiers {
    public static void main(String[]args){
        /*There are a number of optional specifi ers, but most of them aren’t on the exam. Optional
        specifi ers come from the following list. Unlike with access modifi ers, you can have multiple
        specifi ers in the same method (although not all combinations are legal). When this happens,
                you can specify them in any order. And since it is optional, you can’t have any of them at
        all. This means you can have zero or more specifi ers in a method declaration.
        static Covered later in this chapter. Used for class methods.
        abstract Covered in Chapter 5. Used when not providing a method body.
        final Covered in Chapter 5. Used when a method is not allowed to be overridden by a
        subclass.
        synchronized On the OCP but not the OCA exam.
        native Not on the OCA or OCP exam. Used when interacting with code written in
        another language such as C++.
        strictfp Not on the OCA or OCP exam. Used for making fl oating-point calculations portable.*/

    }

    public void walk1() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk4() {}
   // public modifier void walk5() {} // DOES NOT COMPILE
   // public void final walk6() {} // DOES NOT COMPILE
    final public void walk7() {}
}
