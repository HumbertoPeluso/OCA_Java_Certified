package chapterone.javabuildingblocks.destroyingobjects;

/*Garbage collection refers to the process of automatically freeing memory on the heap by
        deleting objects that are no longer reachable in your program.*/
public class DestroyingObjects {

    public static void main(String[] args) {
        String one, two; // still dont point to any class
        one = new String("a"); // variable one points to newClass('a')
        two = new String("b"); //variable two points to newClass('b')
        one = two; // variable one points to where variable two is ponting (newClass('b'); no pointing to newClass('a') anymore
        String three = one; //variable three is pointig to where variable one is pointing (newClass('b')
        one = null; //one now is pointing to anywhere

        //newClass('a') is eligible to garbage collector because no one is pointing to it
    }
}
