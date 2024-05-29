package ex3;

import static ex3.Categorie.MAMMIFERE;
import static ex3.Categorie.POISSON;
import static ex3.Categorie.REPTILE;
import static ex3.Comportement.CARNIVORE;
import static ex3.Comportement.HERBIVORE;

/**
 * Entry point for zoo app
 * 
 * @author Kieran sweetman
 *
 */
public class ZooApplication {

	/**
	 * Main exectuable
	 * 
	 * @param args unutilized
	 */
	public static void main(String[] args) {

		Zoo zoo = new Zoo("Thoiry");

		// Ajout d'animaux dans le zoo
		zoo.addAnimal(new Animal("Gazelle", MAMMIFERE, HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", MAMMIFERE, HERBIVORE));
		zoo.addAnimal(new Animal("Lion", MAMMIFERE, CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", MAMMIFERE, CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", POISSON, HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", POISSON, HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", REPTILE, CARNIVORE));
		zoo.addAnimal(new Animal("Python", REPTILE, CARNIVORE));

		// Affichage de l'inventaire du zoo
		zoo.afficherListeAnimaux();
	}

}