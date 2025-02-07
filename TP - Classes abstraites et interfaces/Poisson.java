package projet;

public class Poisson extends Animal implements Nageant {
	
	public Poisson(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public void seDeplacer() {
		System.out.println("Je nage");
	}
	
	public void nager() {
		System.out.println("Je nage");
	}

}
