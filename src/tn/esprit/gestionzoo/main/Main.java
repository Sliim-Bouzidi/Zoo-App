package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;

public class Main {
    public static void main(String[] args) {
        // Creating a zoo with a name and capacity of 3 animals
        Zoo zoo = new Zoo( 3);

        // Creating animals with name and age
        Animal lion = new Animal("Lion", 5);
        Animal tiger = new Animal("Tiger", 3);
        Animal elephant = new Animal("Elephant", 10);

        // Adding animals to the zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);

        // Displaying the animals in the zoo
        zoo.showAnimals();

        // Searching for Lion in the zoo
        System.out.println("\nRecherche de Lion dans le zoo:");
        int indexLion = zoo.searchAnimal(lion);
        System.out.println("Indice de Lion: " + indexLion);

        // Searching for another Lion with the same name (but potentially different instance)
        Animal anotherLion = new Animal("Lion", 4);
        System.out.println("\nRecherche d'un autre Lion dans le zoo:");
        int indexAnotherLion = zoo.searchAnimal(anotherLion);
        System.out.println("Indice de l'autre Lion: " + indexAnotherLion);

        // Searching for Tiger
        System.out.println("\nRecherche d'un tigre dans le zoo:");
        int indexTiger = zoo.searchAnimal(tiger);
        System.out.println("Indice de Tiger: " + indexTiger);

        // Searching for Elephant
        System.out.println("\nRecherche d'un Elephant dans le zoo:");
        int indexElephant = zoo.searchAnimal(elephant);
        System.out.println("Indice de Elephant: " + indexElephant);
    }
}
