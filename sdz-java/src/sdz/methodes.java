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

		// utilisation de la m�thode substring
		System.out.println("La chaine '" + chaine + "' du caract�re 0 au caract�re 3 vaut '" + chaine.substring(0, 3)
				+ "'");

		// utilisation des m�thodes indexOf et lastIndexOf
		System.out.println("Le caract�re '!' se situe � la position " + chaine.indexOf("!")
				+ " pour sa premi�re occurence dans la cha�ne '" + chaine + "'");
		System.out.println("Le caract�re '!' se situe � la position " + chaine.lastIndexOf("!")
				+ " pour sa derni�re occurence dans la cha�ne '" + chaine + "'");

		// utilisation des m�thodes math�matiques
		double X = 0.0;
		X = Math.random();
		System.out.println("X est un nombre al�atoire allant de 0 � 1 : " + X);

		double sin = Math.sin(120);
		System.out.println("Le sinus de 120� vaut : " + sin);
		double cos = Math.cos(120);
		System.out.println("Le cosinus de 120� vaut : " + cos);
		double tan = Math.tan(120);
		System.out.println("La tangent de 120� vaut : " + tan);
		double abs = Math.abs(-45);
		System.out.println("La valeur absolue de -45 est : " + abs);
		double exp = Math.pow(10, 2);
		System.out.println("La valeur de 10 puissance 2 est : " + exp);

		// utilisation de la m�thode arrondi
		System.out.println("Le cosinus de 120� vaut : " + arrondi(cos,3) + " arrondi � 3 chiffre apr�s la virgule");
		
		// utilisation de la m�thode parcourirTableau
		String tab[] = {"a","b","c","d","e","f"};
		System.out.println(parcourirTableau (tab));
		
		// utilisation de la m�thode parcourirTableau surcharg�e pour les int
		int tab2[] = {1,2,3,4,5,6};
		System.out.println(parcourirTableau (tab2));
		
		String[][] tab3 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};
		System.out.println(parcourirTableau (tab3));
		
	}

	// m�thode arrondi
	static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
	// m�thode parcourir tableau
	static String parcourirTableau (String[] tabBis) {
		String retour = "";
		for (String str : tabBis) {
			retour = retour + str + "\n";
		}
		return retour;
	}
	
	// surcharge de la m�thode parcourir tableau pour les int
	static String parcourirTableau (int[] tabBis) {
		String retour = "";
		for (int str : tabBis) {
			retour = retour + str + "\n";
		}
		return retour;
	}
	
	// surcharge de la m�thode parcourir tableau de String � deux dimensions
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
