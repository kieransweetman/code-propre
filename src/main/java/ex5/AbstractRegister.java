package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract register. Supply a name
 * 
 * @author kieran sweetman
 */
public abstract class AbstractRegister {

    /**
     * register name
     */
    private String nom;
    /**
     * current items in register
     */
    private List<Item> items;

    /**
     * min weight for all registers = 5
     */
    public static int MIN_WEIGHT = 5;
    /**
     * max weight for all registers = 20
     */
    public static int MAX_WEIGHT = 20;

    /**
     * Constructeur
     * 
     * @param nom register name
     */
    public AbstractRegister(String nom) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Abstract method to add item to implemented Register. Logic defined in
     * concrete class.
     * 
     * @param item item to add
     * @return boolean: whether the item can be accepted or not.
     */
    public abstract boolean accept(Item item);

    /**
     * Get the number of items in the register
     * 
     * @return int
     */
    public int getSize() {
        return this.getItems().size();
    }

    /**
     * Getter for name
     * 
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Setter for nom
     * 
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for items
     * 
     * @return the items
     */
    public List<Item> getItems() {
        return this.items;
    }

    /**
     * Setter for items
     * 
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
