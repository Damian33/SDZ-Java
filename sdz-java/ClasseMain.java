package sdz;

public class ClasseMain {

	public static void main(String[] args) {
		// construction d'un objet de type Ville
		Ville ville = new Ville();
		// construction d'un objet de type Ville avec paramètres
		Ville ville2 = new Ville("Marseille", 123456789, "France");
		System.out.println(ville.getNomPays());
		ville2.setNomPays("FRANCEEEEEEEE");
		System.out.println(ville2.getNomPays());

		// affichage de la catégorie
		System.out.println(ville2.getCategorie());

		// appel méthode decrisToi
		ville2.decrisToi();

		// appel méthode comparaison
		System.out.println(ville.comparer(ville2));

		// valeur variable de classe appelée avec le nom de la classe
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis());

	}

}
