package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
