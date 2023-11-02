package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Dolphin extends Aquatic {
    private float swimmingSpeed ;


    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"swimming speed"+this.swimmingSpeed;
    }


    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
