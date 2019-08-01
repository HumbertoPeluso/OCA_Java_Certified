package chapterfive.classdesign.introducingclassinheritance;

public class OverloadingVsOverriding {

    /*Overloading a method and overriding a method are similar in that they both involve
    redefi ning a method using the same name. They differ in that an overloaded method will
    use a different signature than an overridden method. This distinction allows overloaded
    methods a great deal more freedom in syntax than an overridden method would have.*/
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }
}

 class Eagle extends Bird {
    public int fly(int height) {  // is overloaded in the subclass Eagle, since the signature changes  from a no-argument constructor to a constructor with one int argument. Because the  method is being overloaded and not overridden, the return type can be changed from  void to int without issue.
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
   /* public int eat(int food) { // DOES NOT COMPILE -  is overridden in the subclass Eagle
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }*/
}