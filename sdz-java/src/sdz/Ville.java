package sdz;

public class Ville {

	// variable d'instance
	protected String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;

	// Variable de classe
	public static int nbreInstances = 0; // Variables publiques qui comptent les
											// instances
	private static int nbreInstancesBis = 0; // Variable privée qui comptera
												// aussi les instances

	// Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		setNomVille("Inconnu");
		setNomPays("Inconnu");
		setNbreHabitants(0);
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;

	}

	// constructeur avec paramètres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Créatin d'une ville avec paramètres !");
		setNomVille(pNom);
		setNomPays(pPays);
		setNbreHabitants(pNbre);
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
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

	// Retourne la catégorie de la ville
	public char getCategorie() {
		return categorie;
	}

	// méthode d'instance
	private void setCategorie() {
		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];

	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de catégorie : " + this.categorie;
	}

	// Retourne une chaîne de caractères selon le résultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNomVille() + " est une ville plus peuplée que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNomVille();

		return str;
	}

	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}

	public static void setNbreInstancesBis(int nbreInstancesBis) {
		Ville.nbreInstancesBis = nbreInstancesBis;
	}
	
	// On redéfinit la méthode toString de la classe Object (toutes classes héritent de la classe Object en Java)
	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " => elle est donc de catégorie : " + this.categorie;
	}

}
