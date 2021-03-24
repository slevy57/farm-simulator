package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> animalStatus = new ArrayList<>();
        for (Animal animal : animals) {
            String status = "There is a " + animal.getSize() + " sized " + animal.getClass().getSimpleName().toLowerCase() + " in the farm.";
            animalStatus.add(status);
        }
        return animalStatus;
    }
}





