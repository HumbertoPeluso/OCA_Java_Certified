package chapterfour.methodsandencapsulation.applyingaccessmodifiers.pond.duck;

// Private Access

public class BadDuckling {

    public void makeNoise(){
        FatherDuck duck = new FatherDuck();
      //  duck.quack(); // DOES NOT COMPILE
      //  System.out.println(duck.noise); // DOES NOT COMPILE
    }

}
