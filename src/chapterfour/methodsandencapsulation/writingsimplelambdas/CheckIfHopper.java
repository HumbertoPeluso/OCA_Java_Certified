package chapterfour.methodsandencapsulation.writingsimplelambdas;

public class CheckIfHopper implements CheckTrait, CheckTraitZeroParameters {

    public boolean test(Animal a) {
        return a.canHop();
    }

    public boolean test() {
        return false;
    }

    public boolean test(String str) {
        return false;
    }
}
