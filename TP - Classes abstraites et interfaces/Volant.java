package projet;

public interface Volant {
	
	public void voler();
	
	default public void planer() {
		System.out.println("Je plane dans le ciel");
	}

}
