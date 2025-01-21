package projet;

/**
 * @author Adam
 *
 */
public class Film {
	public String titre;
	public String date;
	public int numéroEpisode;
	public int coût;
	public int recette;
	public Acteur[] listActeur = {};
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public int getNuméroEpisode() {
		return numéroEpisode;
	}
	public void setNuméroEpisode(int numéroEpisode) {
		this.numéroEpisode = numéroEpisode;
	}
	public int getCoût() {
		return coût;
	}
	public void setCoût(int coût) {
		this.coût = coût;
	}
	public int getRecette() {
		return recette;
	}
	public void setRecette(int recette) {
		this.recette = recette;
	}
	public Film() {
		super();
	}
	public Film(String titre, String date, int numéroEpisode, int coût, int recette) {
		super();
		this.titre = titre;
		this.date = date;
		this.numéroEpisode = numéroEpisode;
		this.coût = coût;
		this.recette = recette;
	}
	public String toString() {
		return "Film [titre=" + titre + ", date=" + date + ", numéroEpisode=" + numéroEpisode
				+ ", coût=" + coût + ", recette=" + recette + "]";
	}
	public int nbActeurs() {
		return this.listActeur.length;
	}
	public int nbPersonnages() {
		int n = 0;
		for (Acteur a : this.listActeur) {
			n += a.nbPersonnages();
		}
		return n;
	}
	public Object[] calculBenefice() {
		boolean isBenef;
		int benef;
		if (this.coût <= this.recette) {
			isBenef = true;
			benef = recette - coût;
		} else {
			isBenef = false;
			benef = coût - recette;
		}
		return new Object[] {isBenef, benef};
	}
	public boolean isBefore(String date) {
		return (Integer.parseInt(this.date) < Integer.parseInt(date));
	}
	
	
}
