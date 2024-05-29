package ex5;

public class MediumCaisse extends AbstractRegister {

	/**
	 * Implementation of the {@link AbstractRegister}
	 * 
	 * 
	 * @param nom name of register
	 * 
	 */
	public MediumCaisse(String nom) {
		super(nom);
	}

	@Override
	public boolean accept(Item item) {
		return MIN_WEIGHT <= item.getPoids() && item.getPoids() <= MAX_WEIGHT;
	}

}
