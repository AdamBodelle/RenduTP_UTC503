package projet;

public class Personnage {
	public String nom;
	public String prenom;
	
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
	public Personnage(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String toString() {
		return "Personnage [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
