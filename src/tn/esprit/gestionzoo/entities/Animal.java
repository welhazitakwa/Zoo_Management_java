package tn.esprit.gestionzoo.entities;

public class Animal {
    protected Animal [] animals ;
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal (){  }

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        this.name = name;
        if (age >= 0 ) {
            this.age = age;
        } else {
            throw new InvalidAgeException("vous devez saisir un age positif");}
        this.isMammal = isMammal;
    }
    public void setAnimals(Animal[] animals) {
      this.animals = animals;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age >= 0 ) {
            this.age = age;
        } else {
            throw new InvalidAgeException("vous devez saisir un age positif");
            }
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isMammal() {
        return isMammal;
    }

    @Override
    public String toString (){
        return "tn.esprit.gestionZoo.entities.Animal : family :"+this.family+ " name= "+ this.name + "age = "+ this.age + " isMammal : "+ this.isMammal;
    }


}
