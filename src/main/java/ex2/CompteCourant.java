package ex2;

/**
 * Représente un compte de dépôt courant
 * 
 * @author Kieran sweetman
 *
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructor
     * 
     * @param solde     balance
     * @param decouvert overdraft limit
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        }
    }

}