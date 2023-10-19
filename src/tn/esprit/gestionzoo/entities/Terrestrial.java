package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Terrestrial extends Animal{
    protected int nbrLegs ;


 //   public Terrestrial (){   }
    public Terrestrial(String family, String name, int age, boolean isMammal,  int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs ;

    }

    @Override
    public String toString() {
        return "Terrestrial { " +
                "nbrLegs= " + nbrLegs +
                ", animals= " + Arrays.toString(animals) +
                ", family= " + family + '\'' +
                ", name= " + name + '\'' +
                ", age= " + age +
                ", isMammal= " + isMammal +
                '}';
    }
}
