package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.swan;

import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck.MotherDuck; // import another package

// Default (Package Private) Access

public class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
      //  duck.quack(); // DOES NOT COMPILE
     //   System.out.println(duck.noise); // DOES NOT COMPILE
    }

}
