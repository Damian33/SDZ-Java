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
	private static int nbreInstancesBis = 0; // Variable priv�e qui comptera
												// aussi les instances

	// Constructeur par d�faut
	public Ville() {
		System.out.println("Cr�ation d'une ville !");
		setNomVille("Inconnu");
		setNomPays("Inconnu");
		setNbreHabitants(0);
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;

	}

	// constructeur avec param�tres
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�atin d'une ville avec param�tres !");
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

	// Retourne la cat�gorie de la ville
	public char getCategorie() {
		return categorie;
	}

	// m�thode d'instance
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
				+ " habitant(s) => elle est donc de cat�gorie : " + this.categorie;
	}

	// Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNomVille() + " est une ville plus peupl�e que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peupl�e que " + v1.getNomVille();

		return str;
	}

	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}

	public static void setNbreInstancesBis(int nbreInstancesBis) {
		Ville.nbreInstancesBis = nbreInstancesBis;
	}
	
	// On red�finit la m�thode toString de la classe Object (toutes classes h�ritent de la classe Object en Java)
	public String toString() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " => elle est donc de cat�gorie : " + this.categorie;
	}

}
