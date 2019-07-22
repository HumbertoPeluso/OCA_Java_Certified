package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck;

// Default (Package Private) Access

public class MotherDuck {

    String noise = "quack";

    void quack(){
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {   // default access is ok
        quack();
    }

}
