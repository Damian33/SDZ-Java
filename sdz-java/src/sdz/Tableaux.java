package sdz;

import java.util.Scanner;

public class Tableaux {
	public static void main(String[] args) {
		// initialisation de tableaux
		int tableauEntier[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		double tableauDouble[] = { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 };
		char tableauCaractere[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		String tableauChaine[] = { "chaine1", "chaine2", "chaine3", "chaine4" };
		Scanner sc = new Scanner(System.in);
		char caracCherche = ' ';
		boolean caracTrouve = false;
		String texteAffiche = "";
		char caracContinue = ' ';

		// declaration de tableaux vides
		int tableauEntier2[] = new int[6];
		int[] tableauEntier3 = new int[6];

		// declaration d'un tableau a deux dimensions
		int premiersNombres[][] = { { 0, 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } };

		// premier indice d'un tableau commence par 0
		System.out.println(tableauCaractere[0]);

		// parcours d'un tableau
		for (int i = 0; i < tableauCaractere.length; i++) {
			System.out.println("A l'emplacement " + i + " du tableau nous avons " + tableauCaractere[i]);
		}

		// recherche dans un tableau
		do {

			System.out.println("Quel caractère voulez-vous chercher dans le tableau ?");
			caracCherche = sc.nextLine().charAt(0);

			for (int i = 0; i < tableauCaractere.length; i++) {
				if (tableauCaractere[i] == caracCherche) {
					caracTrouve = true;
				}
			}

			texteAffiche = (caracTrouve) ? "Le caractère '" + caracCherche + "' a été trouvé dans le tableau" : "Le caractère '" + caracCherche + "' n'a pas été trouvé dans le tableau";
			System.out.println(texteAffiche);
			do {
				System.out.println("Souhaitez-vous chercher un autre caractère ? (O/N)");
				caracContinue = sc.nextLine().charAt(0);
			} while (caracContinue != 'O' && caracContinue != 'N');

		} while (caracContinue == 'O');

		sc.close();

		// parcours d'un tableau à deux dimensions
		int pairsImpairs[][] = { { 0, 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 } }, k = 0, l = 0;

		while (k < 2) {
			l = 0;
			while (l < 5) {
				System.out.print(pairsImpairs[k][l]);
				l++;
			}
			k++;
			System.out.println();
		}

		// parcours d'un tableau à deux dimensions plus simple
		String tabStr[][] = { { "toto", "tata", "titi", "tutu", "tete" }, { "1", "2", "3", "4", "5" } };
		k = 0;
		l = 0;

		for (String ssTabStr[] : tabStr) {
			l = 0;
			for (String str : ssTabStr) {
				System.out.println("La valeur du tableau tabStr[" + k + "]" + "[" + l + "]" + " : " + str);
				l++;
			}
			k++;
		}
	}
}
