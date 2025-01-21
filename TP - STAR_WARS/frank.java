package projet;
import java.util.Arrays;
import java.util.Scanner;

public class frank {

	public static void main(String[] args) {
		Film film1 = new Film("Star Wars", "1977", 4, 5000, 50000);
		
		
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Titre:");
		String titre = scanIn.nextLine();
		System.out.println("Date:");
		String date = scanIn.nextLine();
		System.out.println("Episode:");
		int épisode = Integer.parseInt(scanIn.nextLine());
		System.out.println("Coût:");
		int coût = Integer.parseInt(scanIn.nextLine());
		System.out.println("Recette:");
		int recette = Integer.parseInt(scanIn.nextLine());
		
		Film film2 = new Film(titre, date, épisode, coût, recette);
		
		Personnage perso1 = new Personnage("WHITE", "Frank");
		Personnage perso2 = new Personnage("POUF", "Cuicui");
		
		Acteur acteur1 = new Acteur("GONDINAND", "Eric");
		
		acteur1.duetPersonnage = Arrays.copyOf(acteur1.duetPersonnage, acteur1.duetPersonnage.length + 1);
		acteur1.duetPersonnage[acteur1.duetPersonnage.length - 1] = perso1; 
		
		acteur1.duetPersonnage = Arrays.copyOf(acteur1.duetPersonnage, acteur1.duetPersonnage.length + 1);
		acteur1.duetPersonnage[acteur1.duetPersonnage.length - 1] = perso2;
		
		film1.listActeur = Arrays.copyOf(film1.listActeur, film1.listActeur.length + 1);
		film1.listActeur[film1.listActeur.length - 1] = acteur1;
		
		Object[] list = {film1, film2, perso1};
		
		
		for (Object e : list) {
			System.out.println(e.toString());
		}
	}

}
