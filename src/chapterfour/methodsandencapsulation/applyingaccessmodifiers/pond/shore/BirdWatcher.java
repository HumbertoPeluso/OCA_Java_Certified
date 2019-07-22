package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.shore; // same package as Bird

//Protected ACCESS
public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();  // calling protected member
        System.out.println(bird.text); // calling protected member
    }

}
