package projet;

public class Acteur {
	public String nom;
	public String prenom;
	public Personnage[] duetPersonnage = {};
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Acteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Acteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
	public int nbPersonnages() {
		return this.duetPersonnage.length;
	}
	
}
