package sdz;

public class Heritage {

	public static void main(String[] args) {
		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi());

		Capitale capParams = new Capitale("Paris", 1000, "France", "Tour Eiffel");
		System.out.println(capParams.decrisToi());

		// DÃ©finition d'un tableau de villes null
		Ville[] tableau = new Ville[6];

		// DÃ©finition d'un tableau de noms de villes et un autre de nombres
		// d'habitants
		String[] tab = { "Marseille", "lille", "caen", "lyon", "paris", "nantes" };
		int[] tab2 = { 123456, 78456, 654987, 75832165, 1594, 213 };

		// Les trois premiers Ã©lÃ©ments du tableau seront des villes,
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

		// La mÃ©thode decrisToi() est polymorphe, elle peut Ãªtre appelÃ© depuis une objet issu des classes Capitale et Ville
		for (Ville V : tableau) {
			System.out.println(V.decrisToi() + "\n");
		}
		
		// On utilise la mÃ©thode toString issu de la classe Object (redÃ©finit dans les classes Ville et Capitale)
		for (Ville V : tableau) {
			System.out.println(V.toString() + "\n");
		}
		
		// La méthode decrisToi n'étant pas accessible pour objet de type Object, on effectue un transtypage
		for (Object V : tableau) {
			System.out.println(((Ville) V).decrisToi() + "\n");
		}
		
		// La méthode hashCode donne un identifiant à un object
		System.out.println(tableau[1].hashCode());
		System.out.println(tableau[2].hashCode());
		
		// La méthode equals permet de comparer des objets
		System.out.println(tableau[1].equals(tableau[2]));
	}
}
