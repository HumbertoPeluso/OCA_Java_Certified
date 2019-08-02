package chapterfive.classdesign.introducingclassinheritance;

public class InheritingVariables {

    /*As you saw with method overriding, there were a lot of rules when two methods have the
    same signature and are defi ned in both the parent and child classes. Luckily, the rules for
    variables with the same name in the parent and child classes are a lot simpler, because Java
    doesn’t allow variables to be overridden but instead hidden.*/

   /* Hiding Variables
    When you hide a variable, you defi ne a variable with the same name as a variable in a parent class. This creates two copies of the variable within an instance of the child class: one
    instance defi ned for the parent reference and another defi ned for the child reference.*/
}

class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}

class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails(); // the parent method outputs the parent value of the tailLength variable
        mouse.getMouseDetails(); // the child method outputs both the child and parent version of the tailLength variables, using the super keyword to access the parent variable’s value.
    }
}

/*
[parentTail=4]
[tail=8,parentTail=4]*/
