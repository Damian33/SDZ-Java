package sdz;

public class methodes {

	public static void main(String[] args) {
		// transformation d'une chaine en majuscule ou en minuscule
		String chaine = "QUE L'AVENTURE COMMENCE !!";
		String chaineMajus = chaine.toLowerCase();
		String chaineMinus = chaine.toUpperCase();
		System.out.println("'" + chaine + "' transform�e en minuscule '" + chaineMajus + "'");
		System.out.println("'" + chaineMajus + "' transform�e en majuscule '" + chaineMinus + "'");

		// calcul de la taille d'une chaine de caract�re
		System.out.println("La chaine de caract�re '" + chaine + "' contient " + chaine.length() + " caract�res ");

		// comparaison de chaine de caract�re
		String chaine1 = "coucou", chaine2 = "toutou";
		if (!chaine1.equals(chaine2)) {
			System.out.println("La chaine '" + chaine1 + "' est diff�rente � la chaine '" + chaine2 + "'");
		} else {
			System.out.println("La chaine '" + chaine1 + "' est identique � la chaine '" + chaine2 + "'");
		}

		// extraction d'un caract�re d'une chaine
		int posCarac = 0;
		int posCaracPlus1 = posCarac + 1;
		System.out.println("Le caract�re en position " + posCaracPlus1 + " de la chaine '" + chaine + "' est : '"
				+ chaine.charAt(posCarac) + "'");
	}
}
