package chapterfour.methodsandencapsulation.writingsimplelambdas;

import java.util.ArrayList;
import java.util.List;

import static chapterfour.methodsandencapsulation.writingsimplelambdas.LambdaExample.CreateAnimals;

public class TraditionalSearch {

    public static void main(String[] args) {

        List<Animal> animals = CreateAnimals();

        print(animals, new CheckIfHopper()); // pass class that does check

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }

    }
