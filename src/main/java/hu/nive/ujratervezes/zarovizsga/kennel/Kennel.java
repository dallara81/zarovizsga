package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.List;
import java.util.ArrayList;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;

    }

    public void addDog(Dog dog) {
        dogs.add(dog);

    }

    public void feedAll() {
        for (Dog dog : dogs) {
            dog.feed();

        }
    }

    public Dog findByName(String name) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;

            }
        }

        throw new IllegalArgumentException("I can't find this dog name: " + name);
    }

    public void playWith(String name, int hours) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                dog.play(hours);
                return;

            }
        }

        throw new IllegalArgumentException("I can't find this dog name: " + name);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogNames = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getHappiness() > minHappiness) {
                happyDogNames.add(dog.getName());

            }
        }

        return happyDogNames;

    }
}