package chapterfive.classdesign.introducingclassinheritance;

public class CallingInheritedClassmembers {

   /* Java classes may use any public or protected member of the parent class, including methods, primitives, or object references. If the parent class and child class are part of the same
package, the child class may also use any default members defi ned in the parent class.
    Finally, a child class may never access a private member of the parent class, at least not
    through any direct reference. As you saw in the fi rst example in this chapter, a private
    member age may be accessed indirectly via a public or protected method.
    To reference a member in a parent class, you can just call it directly, as in the following
    example with the output function displaySharkDetails():*/

    /*As discussed in Chapter 4, this() and this are unrelated in Java. Likewise, super() and
super are quite different but may be used in the same methods on the exam. The fi rst,
            super(), is a statement that explicitly calls a parent constructor and may only be used in
    the fi rst line of a constructor of a child class. The second, super, is a keyword used to reference a member defi ned in a parent class and may be used throughout the child class.
    The exam may try to trick you by using both super() and super in a constructor. For
    example, consider the following code:*/

   /* public Rabbit(int age) {
        super();
        super.setAge(10);
    }*/

    /*public Rabbit(int age) {
        super; // DOES NOT COMPILE
        super().setAge(10); // DOES NOT COMPILE
    }*/
}

class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

 class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }
}