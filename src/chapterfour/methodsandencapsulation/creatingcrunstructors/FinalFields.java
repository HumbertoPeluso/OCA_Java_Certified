package chapterfour.methodsandencapsulation.creatingcrunstructors;

public class FinalFields {

    /*As you saw earlier in the chapter, final instance variables must be assigned a value exactly
    once. We saw this happen in the line of the declaration and in an instance initializer. There
    is one more location this assignment can be done: in the constructor.*/

}

class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";

    public MouseHouse(int length, int width, int height) {
        volume = length * width * height; //The constructor is part of the initialization process, so it is allowed to assign final
    }
}
