package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.goose;

import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.shore.Bird;

// PROTECTED ACCESS
public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
      //  other.floatInWater(); // DOES NOT COMPILE - different package of bird and Bird is not a subclass of Bird
      //  System.out.println(other.text); // DOES NOT COMPILE
    }

}
