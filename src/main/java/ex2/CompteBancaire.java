package ex2;

/**
 * Représente un compte bancaire
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** account balance */
	protected double solde;

	/** account overdraft */
	protected double decouvert;

	/**
	 * Constructor
	 * 
	 * @param solde     account balance
	 * @param decouvert overdraft limit
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Add amount to balance
	 * 
	 * @param montant amount to add
	 */
	public final void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * debit account balance
	 * 
	 * @param montant amount to debit
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}