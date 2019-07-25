package chapterfour.methodsandencapsulation.creatingcrunstructors;

public class CreatingConstructors {



}

class Bunny {
    // Simple constructor
    public Bunny() {
        System.out.println("constructor");
    }
}

class Bunny2 {
  //  public bunny(){} - DOES NOT COMPILE - it's not a constructor so return type is required

    public void Bunny2(){} // It has return type so its a simple method.
}

// a common way to write a contructor

class Bunny3 {
    private String color;

    public Bunny3(String color){
        this.color = color;
    }
}

//Now let's look at some examples that aren't common but that you might see on the exam
class Bunny4{
    private String color;
    private int height;
    private int length;

    public Bunny4(int length, int theHeight){

        length = this.length; // backwards – no good!
        height = theHeight; // fine because a different name
        this.color = "white"; // fine, but redundant
    }
    public static void main(String[]args){
        Bunny4 b = new Bunny4(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);

    }
}