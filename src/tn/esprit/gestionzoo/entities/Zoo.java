package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected Aquatic[] aquaticAnimals = new Aquatic[10];
    //tn.esprit.gestionZoo.entities.Animal [] animals = new tn.esprit.gestionZoo.entities.Animal[25] si je veux instancier un tableau de 25 animal mais c'est pas une bonne pratique fel declaration
    protected String name;
    private String city;
    // doit etre NBR_CAGES
    public static final int nbrCages = 3
            ;
    public int cmp = 0;
    public static int cmp_aquatic = 0;

    public Animal[] getAnimals() {
        return animals;
    }

    public Zoo() {
        animals = new Animal[25];
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages]; //cest une instanciation de tableau
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("vous devez saisir un nom non vide ");
        }
        this.city = city;
        //  this.nbrCages = nbrCages;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("vous devez saisir un nom non vide ");
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Le nom est: " + this.name + " city est : " + this.city + " nombre des cages : " + this.nbrCages);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cmp; i++) {
            // wahadha cht3ayt l toString wahadha automatiquement
            s += animals[i];
        }
        return "tn.esprit.gestionZoo.entities.Zoo : name=" + this.name + ", city=" + this.city + "le nombre des cages : " + this.nbrCages + "//////////////////liste des animaux :" + s;

    }

  /*  public boolean addAnimal(Animal animal) {
        //search pour interdir la redondance
        //IF (! isZooFull && )
        if (!isZooFull() && searchAnimal(animal) == -1) {
            animals[cmp] = animal;
            cmp++;
            return true;
        } else {
            return false;
        }

    }*/
  public void addAnimal(Animal animal) throws ZooFullException {
          if ( isZooFull() && searchAnimal(animal) != -1) {
              throw new ZooFullException("The zoo is full");
          } else {
              animals[cmp] = animal;
              cmp++;
              System.out.println("le nombre d'animales est : "+cmp);
          }
         }

    public void listAnimals() {
        System.out.println("Animaux présents dans le zoo :");

        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
         /*   else {
                System.out.println("Case vide");
            }*/
        }

    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < cmp; i++) {
            // if (animals[i] != null && animals[i].name.equals(animal.name)) {
            if (animals[i] != null && animals[i].equals(animal)) {
                // corr : if (animals[i].name ==name) //pour tester l'egalité des objets on utilise equals (prédefinie) kima equals
                System.out.println(i);
                return i; // tn.esprit.gestionZoo.entities.Animal trouvé, retourne l'indice
            }                                                    }
        return -1; // tn.esprit.gestionZoo.entities.Animal non trouvé
         }

    boolean removeAnimal(Animal a) {
        int pos = searchAnimal(a);
      /*  if(pos != -1 ) {
            //first way décalage
            for (int i=pos; i<cmp-1;i++){
                animals[i] == animals[i+1] ;
            }
            cmp--
            return true ;
        }
        return false ;
    }*/
        if (pos != -1) {
            animals[pos] = animals[cmp - 1];
            cmp--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        // return cmp == nbrCages
        if (cmp < nbrCages) {
            System.out.println("n'est pas pleine");
            System.out.println(cmp);
            return true;
        } else {
            System.out.println("Pleine");
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.cmp > z2.cmp) {
            System.out.println("le plus d'animaux sont dans :" + "looowwlll  :" + z1.cmp + "    //tthhheeennyyyy" + z2.cmp);

            return z1;
        } else {
            System.out.println("le plus d'animaux sont dans :");
            return z2;
        }
    }


    public void addAquaticAnimal(Aquatic aquatic) {

        if (cmp_aquatic < 10) {
            aquaticAnimals[cmp_aquatic] = aquatic;
            cmp_aquatic++;
            System.out.println("ajoutéé");
        }
    }

    public float maxPenguinSwimmingDepth(){
        return 2;
    }
    public void displayNumberOfAquaticsByType(){
        
    }
}
