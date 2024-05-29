package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * A Zoo model
 */
public abstract class Zone {

    /** Animal list */
    private List<Animal> animaux;

    /**
     * constructor
     * 
     */
    public Zone() {
        this.animaux = new ArrayList<>();
    }

    /**
     * Zone is based on diet, and animal type. Defined in implemented class that
     * extends Zone
     * 
     * @param animal animal
     * @return boolean
     */
    public abstract boolean accept(Animal animal);

    /**
     * add animal to list
     * 
     * @param animal animal
     */
    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * list animals in zone
     */
    public void afficherListeAnimaux() {
        System.out.println(this.getClass().getSimpleName() + ":");
        animaux.forEach(a -> System.out.println(a.toString()));
        System.out.println();
    }

    /**
     * calculate food consumed per day for the animals
     */
    public double calculerKgsNourritureParJour() {
        return animaux.size() * getPoidsMoyenConsoNourriture();
    }

    /**
     * get 1 day average of food consumed for the animal. Implemented by class that
     * extends 'Zone'
     */
    public abstract double getPoidsMoyenConsoNourriture();

    /**
     * Getter for animaux
     * 
     * @return the animaux
     */
    public List<Animal> getAnimaux() {
        return animaux;
    }

    /**
     * Setter for animaux
     * 
     * @param animaux the animaux to set
     */
    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

}