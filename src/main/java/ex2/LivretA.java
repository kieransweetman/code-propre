package ex2;

/**
 * Représente un Livret A
 * 
 * @author Kieran sweetman
 *
 */
public class LivretA extends CompteBancaire {

	/** interest rate on savings account */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * 
	 * @param solde            balance
	 * @param tauxRemuneration interest rate
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * debit amount to balance
	 * 
	 * @param montant amount
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Annuel earnings calculation
	 * 
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}