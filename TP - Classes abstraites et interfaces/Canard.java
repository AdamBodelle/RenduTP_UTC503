package projet;

public class Canard extends Animal implements Volant, Nageant {
	
	public Canard(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public void seDeplacer() {
		System.out.println("Je nage et je vole");
	}
	
	public void nager() {
		System.out.println("Je nage");
	}
	
	public void voler() {
		System.out.println("Je vole");
	}

}
