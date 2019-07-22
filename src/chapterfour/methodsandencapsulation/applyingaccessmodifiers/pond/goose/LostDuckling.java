package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.goose;

import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck.DuckTeacher;

public class LostDuckling {

    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); //Allowed
        System.out.println("Thanks" + teacher.name); // allowed
    }

}
