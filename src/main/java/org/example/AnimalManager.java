package org.example;

public class AnimalManager {
    AnimalDAO animalDAO;

    public AnimalManager(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public void manage(){
        Animal a = new Animal("csincsilla", 2, Animal.GenderType.FEMALE);
        animalDAO.saveAnimal(a);

        Animal b = new Animal("szervál", 3, Animal.GenderType.UNKNOWN);
        animalDAO.saveAnimal(b);

        for (Animal animal: animalDAO.getAnimals()){
            System.out.println(animal);
        }
    }
}
