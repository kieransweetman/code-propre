package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Représente le concept de zoo
 * 
 * @author kieran sweetman
 *
 */
public class Zoo {

	/** name */
	private String nom;

	/** different zones */
	private List<Zone> zones = new ArrayList<>();

	/**
	 * Constructeur
	 * 
	 * @param nom zoo name
	 */
	public Zoo(String nom) {
		this.nom = nom;
		Collections.addAll(zones, new SavaneAfricaine(), new ZoneCarnivore(), new Aquarium(), new FermeReptile());
	}

	/**
	 * add animal to zoo, based on zone (foot diet & animal type)
	 * 
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		for (Zone zone : zones) {
			if (zone.accept(animal)) {
				zone.addAnimal(animal);
			}
		}
	}

	/**
	 * List animals
	 */
	public void afficherListeAnimaux() {
		zones.forEach(z -> z.afficherListeAnimaux());
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}