package sdz;
import java.util.Scanner;

public class boucles {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String chaine = "";
		String prenom = "";
		char reponse;
		
		System.out.println("Choisis la boucle que tu souhaites testee : ");
		System.out.println("Tapes 'while' pour la boucle while");
		System.out.println("Tapes 'dowhile' pour la boucle do... while");
		System.out.println("Tapes 'for' pour la boucle for");
		chaine = sc.nextLine();
		switch (chaine) {
		case "while":
			
			// On travaille la boucle while
			reponse = 'O';			
			while (reponse == 'O') {
				System.out.println("Quel est votre prenom ?");
				prenom = sc.nextLine();
				System.out.println("Bonjour " + prenom);

				reponse = ' ';
				while (reponse != 'O' && reponse != 'N') {
					System.out.println("Voulez-vous reessayer ? O/N");
					reponse = sc.nextLine().charAt(0);
				}
			}
			System.out.println("Au revoir " + prenom);
			sc.close();
			break;
		
		case "dowhile":
			// On travaille la boucle do... while
			reponse = ' ';
			do {
				System.out.println("Quel est votre prenom ?");
				prenom = sc.nextLine();
				System.out.println("Bonjour " + prenom);
				
				do {
					System.out.println("Voulez-vous reessayer ? O/N");
					reponse = sc.nextLine().charAt(0);
				} while (reponse != 'O' && reponse != 'N');
			} while (reponse == 'O');
			sc.close();
			break;
			
		case "for":
			for(int i = 10; i >= 0; i--)
				  System.out.println("Il reste "+i+" ligne(s) à écrire");
			break;
		default:
			System.out.println("T'as pas choisi while, dowhile ou for !");
		}
		
	}

}
