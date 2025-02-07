package projet;

public class Oiseau extends Animal implements Volant {
	
	public Oiseau(String nom) {
		super(nom);
		this.nom = nom;
	}
	
	public void seDeplacer() {
		System.out.println("Je vole");
	}
	
	public void voler() {
		System.out.println("Je vole");
	}

}
