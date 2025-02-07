package projet;

public abstract class Animal {
	
	public String nom;
	
	public Animal(String nom) {
		this.nom = nom;
	}
	
	abstract void seDeplacer();

	public String getNom() {
		return nom;
	}
	
}
