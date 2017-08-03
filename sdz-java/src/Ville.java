package sdz;

public class Ville {

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;

	// Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		setNomVille("Inconnu");
		setNomPays("Inconnu");
		setNbreHabitants(0);
	}
	
	// constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Créatin d'une ville avec paramètres !");
		setNomVille(pNom);
		setNomPays(pPays);
		setNbreHabitants(pNbre);
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
}
