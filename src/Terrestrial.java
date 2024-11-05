public class Terrestrial implements Omnivore<Food> {

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animal can't eat plants only.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial animal is eating plants.");
        } else {
            System.out.println("Terrestrial animal can't eat meat only.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("Terrestrial animal needs both plant and meat.");
        }
    }
}
