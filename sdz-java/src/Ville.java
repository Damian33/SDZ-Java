package sdz;

public class Ville {

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;

	// Constructeur par d�faut
	public Ville() {
		System.out.println("Cr�ation d'une ville !");
		setNomVille("Inconnu");
		setNomPays("Inconnu");
		setNbreHabitants(0);
	}
	
	// constructeur avec param�tres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�atin d'une ville avec param�tres !");
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
