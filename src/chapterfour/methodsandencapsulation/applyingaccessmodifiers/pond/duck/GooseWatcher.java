package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck;

import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.goose.Goose;

//PROTECTED ACCESS
public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
      //  goose.floatInWater(); // DOES NOT COMPILE - Different package as Bird and does not extends Bird
    }

}
