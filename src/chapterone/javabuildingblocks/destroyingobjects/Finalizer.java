package chapterone.javabuildingblocks.destroyingobjects;

import java.util.ArrayList;
import java.util.List;

/*Java allows objects to implement a method called finalize() that might get called. This
        method gets called if the garbage collector tries to collect the object. If the garbage collector
        doesn’t run, the method doesn’t get called. If the garbage collector fails to collect the object
        and tries to run it again later, the method doesn’t get called a second time.*/
public class Finalizer {
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }

}

class Finalizer2 {
    private static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this); // Don't do this
    }
}
