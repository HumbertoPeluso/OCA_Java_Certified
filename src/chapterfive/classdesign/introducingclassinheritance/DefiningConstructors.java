package chapterfive.classdesign.introducingclassinheritance;

public class DefiningConstructors {
    /*every class has at least one constructor. In the case that
    no constructor is declared, the compiler will automatically insert a default no-argument
    constructor. In the case of extending a class, though, things are a bit more interesting.
    In Java, the fi rst statement of every constructor is either a call to another constructor
    within the class, using this(), or a call to a constructor in the direct parent class, using
    Introducing Class Inheritance 239
    c05.indd 1½ 4/2014 Page 239
            super(). If a parent constructor takes arguments, the super constructor would also take
    arguments. For simplicity in this section, we refer to the super() command as any parent constructor, even those that take an argument. Notice the user of both super() and
super(age)*/

    public class Animal {
        private int age;
        public Animal(int age) {
            super();
            this.age = age;
        }
    }

    public class Zebra extends Animal {
        public Zebra(int age) {
            super(age);
        }
        public Zebra() {
            this(4);
        }
    }

    /*the super() command may only
    be used as the fi rst statement of the constructor. For example, the following two class defi -
    nitions will not compile*/

    public class Zoo {
        public Zoo() {
            System.out.println("Zoo created");
          //  super(); // DOES NOT COMPILE
        }
    }

    public class Zoo2 {
        public Zoo2() {
            super();
            System.out.println("Zoo created");
          //  super(); // DOES NOT COMPILE
        }
    }

    /*If the parent class has more than one constructor, the child class may use any valid
            parent constructor in its defi nition*/

    public class Animal2 {
        private int age;
        private String name;

        public Animal2(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public Animal2(int age) {
            super();
            this.age = age;
            this.name = null;
        }
    }

    public class Gorilla extends Animal2 {
        public Gorilla(int age) {
            super(age,"Gorilla");
        }
        public Gorilla() {
            super(5);
        }
    }

}
