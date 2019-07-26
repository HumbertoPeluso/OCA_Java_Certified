package chapterfour.methodsandencapsulation.writingsimplelambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        List<Animal> animals = CreateAnimals();

        print(animals, a -> a.canSwim()); //with lambda

        print(animals, a -> !a.canSwim()); // animals cannot swin

    }

    static List<Animal> CreateAnimals() {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        return animals;
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}

