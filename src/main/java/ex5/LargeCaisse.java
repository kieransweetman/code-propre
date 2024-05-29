package ex5;

public class LargeCaisse extends AbstractRegister {

	/**
	 * Implementation of the {@link AbstractRegister}
	 * 
	 * 
	 * @param nom name of register
	 * 
	 */
	public LargeCaisse(String nom) {
		super(nom);
	}

	@Override
	public boolean accept(Item item) {
		return item.getPoids() >= MAX_WEIGHT;
	}

}
