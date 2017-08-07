package sdz;

public class conditions {

	public static void main(String[] args) {
		// On travaille de if... else if... else
		int i = 50;
		if (i < 0)
			System.out.println("Ce nombre est négatif !");
		else if (i > 0)
			System.out.println("Ce nombre est positif !");
		else
			System.out.println("Ce nombre est nul !");

		if (i < 100 && i > 50)
			System.out.println("Ce nombre est bien dans l'interval 50 à 100.");
		else
			System.out.println("Ce nombre n'est pas dans l'interval 50 à 100.");

		// On travaille de switch
		int note = 10; // On imagine que la note maximale est 20
		switch (note) {
		case 0:
			System.out.println("Ouch !");
			break;
		case 10:
			System.out.println("Vous avez juste la moyenne.");
			break;
		case 20:
			System.out.println("Parfait !");
			break;
		default:
			System.out.println("Il faut davantage travailler.");
		}

		String chaine = "Bonjour";
		switch (chaine) {
		case "Bonjour":
			System.out.println("Bonjour monsieur !");
			break;
		case "Bonsoir":
			System.out.println("Bonsoir monsieur !");
			break;
		default:
			System.out.println("Bonjoir ! :p");
		}

		// On travaille les structures ternaires
		int x = 10, y = 20;
		int max = (x < y) ? y : x; // Maintenant, max vaut 20
		System.out.println("Le max est : " + max);
		
		max = (x < y) ? ((y < 10) ? y % 10 : y * 2) : x ; //Max vaut 40
	}

}
