package tn.esprit.gestionzoo.entities;

public class Animal {
    private String name;
    private int age;

    // Constructor with validation
    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getter and Setter for name with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide.");
        }
        this.name = name;
    }

    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
    }

    // Override toString() method for meaningful output
    @Override
    public String toString() {
        return "Animal: " + name + ", Age: " + age;
    }
}
