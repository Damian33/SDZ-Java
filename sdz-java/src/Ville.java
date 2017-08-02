package sdz;

public class Ville {

	String nomVille;
	String nomPays;
	int nbreHabitants;

	// Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}
	
	// constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Créatin d'une ville avec paramètres");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
	}
}
