package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;

public class Main {
    public static void main(String[] args) {
        // Creating a zoo with a capacity of 5 animals
        Zoo zoo = new Zoo(5);

        // Creating animals with name and age
        Animal lion = new Terrestrial("Lion", 5, 4); // Lion is a terrestrial animal
        Animal tiger = new Terrestrial("Tiger", 3, 4); // Tiger is a terrestrial animal
        Animal elephant = new Terrestrial("Elephant", 10, 4); // Elephant is a terrestrial animal
        Dolphin dolphin = new Dolphin("Dolphin", 4, "Ocean", 25.5f); // Dolphin is an aquatic animal
        Penguin penguin = new Penguin("Penguin", 2, "Antarctic", 30.0f); // Penguin is an aquatic animal

        // Adding animals to the zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);
        zoo.addAnimal(dolphin);
        zoo.addAnimal(penguin);

        // Displaying the animals in the zoo
        zoo.showAnimals();

        // Searching for Lion in the zoo
        System.out.println("\nRecherche de Lion dans le zoo:");
        int indexLion = zoo.searchAnimal(lion);
        System.out.println("Indice de Lion: " + indexLion);

        // Searching for another Lion with the same name (but potentially different instance)
        Animal anotherLion = new Terrestrial("Lion", 4, 4);
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

        // Demonstrating swimming behavior
        System.out.println("\nDemonstration de la nage:");
        dolphin.swim(); // Calls the swim method for Dolphin
        penguin.swim(); // Calls the swim method for Penguin
    }
}
