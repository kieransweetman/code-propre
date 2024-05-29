package ex3;

/**
 * Zone d'un zoo qui n'accueille que des poissons
 */
public class Aquarium extends Zone {

	@Override
	public double getPoidsMoyenConsoNourriture() {
		return 0.2;
	}

	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.POISSON);
	}
}