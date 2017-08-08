package sdz;

public class Heritage {

	public static void main(String[] args) {
		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi());

		Capitale capParams = new Capitale("Paris", 1000, "France", "Tour Eiffel");
		System.out.println(capParams.decrisToi());

		// Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];

		// Définition d'un tableau de noms de villes et un autre de nombres
		// d'habitants
		String[] tab = { "Marseille", "lille", "caen", "lyon", "paris", "nantes" };
		int[] tab2 = { 123456, 78456, 654987, 75832165, 1594, 213 };

		// Les trois premiers éléments du tableau seront des villes,
		// et le reste, des capitales
		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				Ville V = new Ville(tab[i], tab2[i], "france");
				tableau[i] = V;
			}
			else {
				Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
				tableau[i] = C;
			}
		}

		// La méthode decrisToi() est polymorphe, elle peut être appelé depuis une objet issu des classes Capitale et Ville
		for (Ville V : tableau) {
			System.out.println(V.decrisToi() + "\n");
		}
		
		// On utilise la méthode toString issu de la classe Object (redéfinit dans les classes Ville et Capitale)
		for (Ville V : tableau) {
			System.out.println(V.toString() + "\n");
		}
	}
}
