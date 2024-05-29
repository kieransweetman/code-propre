package ex1;

import java.util.Date;

/**
 * Enterprise class model
 * 
 * @author kieran sweetman
 * 
 */
public class entreprise {

	/**
	 * Siret number
	 */
	public int siret;

	/**
	 * Enterprise name
	 */
	public String nom;

	/**
	 * Enterprise adresse
	 */
	public String adresse;

	/**
	 * Enterprise founding date
	 */
	public Date dateCreation;

	/**
	 * immutable max capital
	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Show enterprise's status
	 * 
	 * @returns void
	 */
	public void afficherStatut() {

	}

	/**
	 * Getter
	 * 
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 * 
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Setter
	 * 
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
