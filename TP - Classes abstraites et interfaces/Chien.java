package projet;

public class Chien extends Animal {
	
	public Chien(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public void seDeplacer() {
		System.out.println("Je cours");
	
	}
	
}
