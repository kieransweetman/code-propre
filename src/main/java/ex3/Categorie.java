package ex3;

/**
 * Représente une catégorie phylogénétique d'animaux
 * 
 * @author DIGINAMIC
 *
 */
public enum Categorie {

    /** Type Mammifère */
    MAMMIFERE("Mammifère"),

    /** Type Oiseau */
    OISEAU("Oiseau"),

    /** Type Poisson */
    POISSON("Poisson"),

    /** Type Reptile */
    REPTILE("Reptile");

    /** nom de la classe d'animaux */
    private String nom;

    /**
     * Constructeur
     * 
     * @param nom
     */
    private Categorie(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut nom
     * 
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

}