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

		// utilisation de la méthode substring
		System.out.println("La chaine '" + chaine + "' du caractère 0 au caractère 3 vaut '" + chaine.substring(0, 3)
				+ "'");

		// utilisation des méthodes indexOf et lastIndexOf
		System.out.println("Le caractère '!' se situe à la position " + chaine.indexOf("!")
				+ " pour sa première occurence dans la chaîne '" + chaine + "'");
		System.out.println("Le caractère '!' se situe à la position " + chaine.lastIndexOf("!")
				+ " pour sa dernière occurence dans la chaîne '" + chaine + "'");

		// utilisation des méthodes mathématiques
		double X = 0.0;
		X = Math.random();
		System.out.println("X est un nombre aléatoire allant de 0 à 1 : " + X);

		double sin = Math.sin(120);
		System.out.println("Le sinus de 120° vaut : " + sin);
		double cos = Math.cos(120);
		System.out.println("Le cosinus de 120° vaut : " + cos);
		double tan = Math.tan(120);
		System.out.println("La tangent de 120° vaut : " + tan);
		double abs = Math.abs(-45);
		System.out.println("La valeur absolue de -45 est : " + abs);
		double exp = Math.pow(10, 2);
		System.out.println("La valeur de 10 puissance 2 est : " + exp);

		// utilisation de la méthode arrondi
		System.out.println("Le cosinus de 120° vaut : " + arrondi(cos,3) + " arrondi à 3 chiffre après la virgule");
		
		// utilisation de la méthode parcourirTableau
		String tab[] = {"a","b","c","d","e","f"};
		System.out.println(parcourirTableau (tab));
		
		// utilisation de la méthode parcourirTableau surchargée pour les int
		int tab2[] = {1,2,3,4,5,6};
		System.out.println(parcourirTableau (tab2));
		
		String[][] tab3 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};
		System.out.println(parcourirTableau (tab3));
		
	}

	// méthode arrondi
	static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
	// méthode parcourir tableau
	static String parcourirTableau (String[] tabBis) {
		String retour = "";
		for (String str : tabBis) {
			retour = retour + str + "\n";
		}
		return retour;
	}
	
	// surcharge de la méthode parcourir tableau pour les int
	static String parcourirTableau (int[] tabBis) {
		String retour = "";
		for (int str : tabBis) {
			retour = retour + str + "\n";
		}
		return retour;
	}
	
	// surcharge de la méthode parcourir tableau de String à deux dimensions
	static String parcourirTableau (String[][] tabBis) {
		String retour = "";
		for (String sousStr[] : tabBis) {
			for (String str : sousStr) {
				retour = retour + str + "\n";
			}
		}
		return retour;
	}
	
}
