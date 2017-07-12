package sdz;

import java.util.Scanner;

public class bouche {

	public static void main(String[] args) {
		// On travaille la boucle while
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);

		while (reponse == 'O') {
			System.out.println("Quel est votre prenom ?");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom);
			System.out.println("Voulez-vous reessayer ? O/N");
			reponse = sc.nextLine().charAt(0);
		}
	}

}
