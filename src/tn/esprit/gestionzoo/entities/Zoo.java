package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final Animal[] animals;
    private int count;

    public Zoo(int size) {
        animals = new Animal[size];
        count = 0;
    }

    // Method to check if the zoo is full
    public boolean isZooFull() {
        return count >= animals.length;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[count] = animal;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public void showAnimals() {
        if (count == 0) {
            System.out.println("Le zoo est vide.");
        } else {
            System.out.println("Animaux dans le zoo:");
            for (int i = 0; i < count; i++) {
                System.out.println(i + ": " + animals[i].getName());
            }
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
}
