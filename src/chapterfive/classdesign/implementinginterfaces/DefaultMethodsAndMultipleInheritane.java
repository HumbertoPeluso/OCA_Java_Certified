package chapterfive.classdesign.implementinginterfaces;

public class DefaultMethodsAndMultipleInheritane {

}

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

/*class Cat implements Walk, Run { // DOES NOT COMPILE
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }*/
//}

   /* Since Walk and Run are considered siblings in terms of how they are used in the Cat
class, it is not clear whether the code should output 5 or 10*/

   /* if the subclass overrides the duplicate default methods, the code will compile without
        issue—the ambiguity about which version of the method to call has been removed. */

class Cat implements Walk, Run {
    public int getSpeed() { //  two duplicate default methods forces the class to implement a new version of the method
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}