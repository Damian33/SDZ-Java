import java.util.Scanner;

public class tp_celsius_fahrenheit {

	public static void main(String[] args) {
		// Declaration des variables
		int modeConvertisseur = 0;
		char continuer = 'O';
		double temperatureAConvertir;
		double temperatureConvertie;
		Scanner sc = new Scanner(System.in);

		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		System.out.println("-------------------------------------------------");

		do {
			do {
				System.out.println("Choisissez le mode de conversion :");
				System.out.println("1 - Convertisseur Celsius - Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit - Celsius");

				modeConvertisseur = sc.nextInt();
			} while (modeConvertisseur != 1 && modeConvertisseur != 2);

			sc.nextLine(); // on vide la ligne avant d'en lire une autre
			System.out.println("Température à convertir :");
			temperatureAConvertir = sc.nextDouble();
			if (modeConvertisseur == 1) {
				temperatureConvertie = (9 / 5) * temperatureAConvertir + 32;
				System.out.println(arrondi(temperatureAConvertir, 2) + " °C correspond à : "
						+ arrondi(temperatureConvertie, 2) + " °F");
			} else if (modeConvertisseur == 2) {
				temperatureConvertie = (temperatureAConvertir - 32) * (5 / 9);
				System.out.println(arrondi(temperatureAConvertir, 2) + " °F correspond à : "
						+ arrondi(temperatureConvertie, 2) + " °C");
			}
			sc.nextLine(); // on vide la ligne avant d'en lire une autre
			
			do {
				System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
				continuer = sc.nextLine().charAt(0);				
			} while (continuer != 'O' && continuer != 'N');
			
		} while (continuer == 'O');
		System.out.println("Au revoir !");
	}

	public static double arrondi(double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
