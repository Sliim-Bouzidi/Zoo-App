public class Penguin implements Carnivore<Food>, Herbivore<Food> {

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Penguin is eating fish (meat).");
        } else {
            System.out.println("Penguin can't eat plants only.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Penguin is eating plants.");
        } else {
            System.out.println("Penguin can't eat meat only.");
        }
    }
}
