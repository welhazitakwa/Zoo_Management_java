package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Penguin extends Aquatic {
    private float swimmingDepth ;


    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                ", habitat='" + habitat + '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
