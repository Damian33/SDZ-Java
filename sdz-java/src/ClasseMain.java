package sdz;

public class ClasseMain {

	public static void main(String[] args) {
		// construction d'un objet de type Ville
		Ville ville = new Ville();
		// construction d'un objet de type Ville avec paramètres
		Ville ville2 = new Ville("Marseille",123456789,"France");
		System.out.println(ville.getNomPays());
		ville2.setNomPays("FRANCEEEEEEEE");
		System.out.println(ville2.getNomPays());
	}

}
