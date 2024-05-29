package ex3;

/**
 * Concept d'animal
 * 
 * @author DIGINAMIC
 *
 */
public class Animal {

    /** Name (Lion, Gazelle, etc.) */
    private String nom;

    /** Categorie (Mammal, fish, etc..) */
    private Categorie categorie;

    /** diet (herbivore, carnivore, omnivore) */
    private Comportement comportement;

    /**
     * constructor
     * 
     * @param nom          animal name
     * @param categorie    animal category
     * @param comportement diet
     */
    public Animal(String nom, Categorie categorie, Comportement comportement) {
        super();
        this.nom = nom;
        this.categorie = categorie;
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", catégorie=" + categorie.getNom() + ", comportement=" + comportement;
    }

    /**
     * Getter for name
     * 
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter for category
     * 
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * Getter for diet
     * 
     * @return the comportement
     */
    public Comportement getComportement() {
        return comportement;
    }
}