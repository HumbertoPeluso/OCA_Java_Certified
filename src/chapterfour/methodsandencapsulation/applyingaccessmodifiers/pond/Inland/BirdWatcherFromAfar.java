package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.Inland;

import chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.shore.Bird; // different package than Bird

// PROTECTED ACCESS
public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
      //  bird.floatInWater();  // DOES NOT COMPILE
      //  System.out.println(bird.text); // DOES NOT COMPILE
    }

}
