public class Main {
    public static void main(String[] args) {
        // Create instances of Aquatic, Penguin, and Terrestrial
        Aquatic aquaticAnimal = new Aquatic();
        Penguin penguin = new Penguin();
        Terrestrial terrestrialAnimal = new Terrestrial();

        // Test Aquatic eating meat
        System.out.println("Aquatic Test:");
        aquaticAnimal.eatMeat(Food.MEAT);
        aquaticAnimal.eatMeat(Food.PLANT);

        // Test Penguin eating meat and plants
        System.out.println("\nPenguin Test:");
        penguin.eatMeat(Food.MEAT);
        penguin.eatPlant(Food.PLANT);

        // Test Terrestrial eating both meat and plants
        System.out.println("\nTerrestrial Test:");
        terrestrialAnimal.eatMeat(Food.MEAT);
        terrestrialAnimal.eatPlant(Food.PLANT);
        terrestrialAnimal.eatPlantAndMeat(Food.BOTH);
    }
}
