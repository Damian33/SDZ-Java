package sdz;

public class methodes {

	public static void main(String[] args) {
		// transformation d'une chaine en majuscule ou en minuscule
		String chaine = "QUE L'AVENTURE COMMENCE !!";
		String chaineMajus = chaine.toLowerCase();
		String chaineMinus = chaine.toUpperCase();
		System.out.println("'" + chaine + "' transformée en minuscule '" + chaineMajus + "'");
		System.out.println("'" + chaineMajus + "' transformée en majuscule '" + chaineMinus + "'");

		// calcul de la taille d'une chaine de caractère
		System.out.println("La chaine de caractère '" + chaine + "' contient " + chaine.length() + " caractères ");

		// comparaison de chaine de caractère
		String chaine1 = "coucou", chaine2 = "toutou";
		if (!chaine1.equals(chaine2)) {
			System.out.println("La chaine '" + chaine1 + "' est différente à la chaine '" + chaine2 + "'");
		} else {
			System.out.println("La chaine '" + chaine1 + "' est identique à la chaine '" + chaine2 + "'");
		}

		// extraction d'un caractère d'une chaine
		int posCarac = 0;
		int posCaracPlus1 = posCarac + 1;
		System.out.println("Le caractère en position " + posCaracPlus1 + " de la chaine '" + chaine + "' est : '"
				+ chaine.charAt(posCarac) + "'");
	}
}
