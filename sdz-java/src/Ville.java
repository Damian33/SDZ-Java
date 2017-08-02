package sdz;

public class Ville {

	String nomVille;
	String nomPays;
	int nbreHabitants;

	// Constructeur par d�faut
	public Ville() {
		System.out.println("Cr�ation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}
	
	// constructeur avec param�tres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�atin d'une ville avec param�tres");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
	}
}
