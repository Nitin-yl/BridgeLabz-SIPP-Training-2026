package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

import java.util.ArrayList;
import java.util.List;

class Animal {

    public void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat Meows");
    }
}

public class UpperBoundedWildcardDemo {

    public static void displayAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        System.out.println("Dogs:");
        displayAnimals(dogs);

        System.out.println("\nCats:");
        displayAnimals(cats);
    }
}