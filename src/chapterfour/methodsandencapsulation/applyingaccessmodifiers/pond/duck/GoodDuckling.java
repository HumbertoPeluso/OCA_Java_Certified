package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck;

// Default (Package Private) Access

public class GoodDuckling {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack();  // default access
        System.out.println(duck.noise); // default access
    }

}
