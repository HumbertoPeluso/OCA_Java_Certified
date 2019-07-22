package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.goose;


import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.shore.Bird; // in a different package

//PROTECTED ACCESS
public class Gosling extends Bird { // extends means create subclass

    public void swim() {

        floatInWater(); // calling protected member

        System.out.println(text); // calling protected member
    }

}
