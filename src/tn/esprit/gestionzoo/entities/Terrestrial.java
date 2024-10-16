package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }
}
