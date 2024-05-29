package ex3;

/**
 * Zone d'un zoo qui n'accueille que des mammifères carnivores
 */
public class ZoneCarnivore extends Zone {

	@Override
	public double getPoidsMoyenConsoNourriture() {
		return 10.0;
	}

	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.MAMMIFERE)
				&& animal.getComportement().equals(Comportement.CARNIVORE);
	}
}