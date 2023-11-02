package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main (String[] args) throws ZooFullException, InvalidAgeException {
            Animal a1 = new Animal("test1","test2",5,true);
            Animal a2 = new Animal("Carnivore","lion",5,true);
            Animal a3 = new Animal("test1","test2",5,true);
            Animal a4 = new Animal("testtt1","tt",5,true);
            Zoo z1 = new Zoo("test3","4");
            Zoo z2 = new Zoo("myZoo2","Ariana");
           //******************************//
            a1.setName("lion");
            a1.setFamily("Carnivore");
            a1.setAge(5);
            a1.setMammal(true);
            //****************************//
            z1.setName( "myZoo");
            z1.setCity("Ariana");
            // z1.nbrCages = 25 ;
            //***************************//


        z2.displayZoo();
        System.out.println("**********************  Affichage tn.esprit.gestionZoo.entities.Zoo par toString()  *************************");
        System.out.println(z2);
        System.out.println(z2.toString());
        System.out.println("**********************  Affichage tn.esprit.gestionZoo.entities.Animal par toString()  *************************");
        System.out.println(a2);
        System.out.println(a2.toString());


        z2.addAnimal(a2);
        z2.addAnimal(a3);
    //    z2.addAnimal(a3);

        System.out.println(z2.toString());
        System.out.println(z1.toString());
        z2.addAnimal(a1);
        // metode d'istance najemch  naccedilha mghhyyr instance edheka 3lh esmha keka
        // ken jee constructeur par defaut rw tala3 erreur exception b null  khater le tableau  non initialisé par contre fel paramétré initializineh
        z2.listAnimals();
        z2.searchAnimal(a1) ;
        z2.searchAnimal(a3) ;
        z2.searchAnimal(a4);
        System.out.println(z2.isZooFull());
        System.out.println(z1.isZooFull());
        System.out.println(Zoo.comparerZoo(z2,z1));

        //*************************************************Prosit 5***************************************************
        System.out.println("************************ Prosit 5 ***********************");
       // Aquatic aq1= new Aquatic("fam_aquatic", "aquat1", 5, true, "habit_aquatic");
        Terrestrial terr1 = new Terrestrial("fam_terr", "terr1", 5, true, 20);
        Dolphin dol1 = new Dolphin("fam_aquatic", "aquat_dol", 5, true, "habit_dol",10.3f);
        Penguin peng = new Penguin("fam_aquatic", "aquat_peng", 5, true, "habit_peng",10.1f );

        //redef : interclasse
        //surcharge : fi nafs lclasse

       // aq1.swim();
        dol1.swim();
        //**************************************************Prosit 6 ********************************************
        System.out.println("**************************************************Prosit 6 ********************************************");
      //  z2.addAquaticAnimal(aq1);
        z2.addAquaticAnimal(dol1);
        z2.addAquaticAnimal(peng);

        System.out.println(peng.equals(peng));
        System.out.println(peng.equals(dol1));

    }
}
