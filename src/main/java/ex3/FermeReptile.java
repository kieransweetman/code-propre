package ex3;

/**
 * Zone d'un zoo qui n'accueille que des reptiles
 */
public class FermeReptile extends Zone {

	@Override
	public double getPoidsMoyenConsoNourriture() {
		return 0.1;
	}

	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.REPTILE);
	}
}