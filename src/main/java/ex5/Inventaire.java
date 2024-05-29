package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<AbstractRegister> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new SmallCaisse("Petits objets"));
		caisses.add(new MediumCaisse("Moyens objets"));
		caisses.add(new LargeCaisse("Grands objets"));
	}

	/**
	 * Add an item to the stock.
	 * 
	 * @param item item à ajouter
	 */
	public void addItem(Item item) {

		for (AbstractRegister caisse : caisses) {
			if (caisse.accept(item)) {
				caisse.getItems().add(item);
			}
		}
	}

	/**
	 * get number of items in the inventory
	 * 
	 * @return int
	 */
	public int taille() {

		int somme = 0;
		for (AbstractRegister caisse : caisses) {
			somme += caisse.getSize();
		}
		return somme;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("Inventaire: ").append(taille()).append(" objet(s).");
		for (AbstractRegister c : caisses) {
			builder.append("\n\t").append(c);
		}
		return builder.toString();
	}
}
