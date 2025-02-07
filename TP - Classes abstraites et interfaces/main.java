package projet;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Chien monChien = new Chien("Mio");
		Oiseau monOiseau = new Oiseau("Pou");
		Canard monCanard = new Canard("Ryu");
		Poisson monPoisson = new Poisson("Zoa");
		
		System.out.println("Ex 1 :");
		
		System.out.println(monChien.getNom());
		System.out.println(monOiseau.getNom());
		monChien.seDeplacer();
		monOiseau.seDeplacer();
		
		System.out.println("---------------------------");
		
		System.out.println("Ex 3 :");
		
		System.out.println("Liste Animal :");
		
		ArrayList<Animal> liste1 = new ArrayList<Animal>();
		liste1.add(monChien);
		liste1.add(monOiseau);
		liste1.add(monCanard);
		liste1.add(monPoisson);
		
		for (Animal a : liste1) {
			a.seDeplacer();
		}
		
		System.out.println("Liste Volant :");
		
		ArrayList<Volant> listeVol = new ArrayList<Volant>();
		listeVol.add(monOiseau);
		listeVol.add(monCanard);
		
		for (Volant a : listeVol) {
			a.voler();
		}
		
		System.out.println("Liste Nageant :");
		
		ArrayList<Nageant> listeNag = new ArrayList<Nageant>();
		listeNag.add(monCanard);
		listeNag.add(monPoisson);
		
		for (Nageant a : listeNag) {
			a.nager();
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Ex 4 :");
		
		for (Volant a : listeVol) {
			a.planer();
		}
		
	}

}
