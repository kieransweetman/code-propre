package ex5;

public class SmallCaisse extends AbstractRegister {

	/**
	 * Implementation of the {@link AbstractRegister}
	 * 
	 * 
	 * @param nom name of register
	 * 
	 */
	public SmallCaisse(String nom) {
		super(nom);
	}

	@Override
	public boolean accept(Item item) {
		return item.getPoids() >= MIN_WEIGHT;
	}

}
