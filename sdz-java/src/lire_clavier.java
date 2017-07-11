import java.util.Scanner;

public class lire_clavier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un entier : ");
		int i = sc.nextInt();
		System.out.println("Vous avez saisi : " + i);
		System.out.println("Saisissez une chaîne : ");
		//On vide la ligne avant d'en lire une autre
		sc.nextLine();
		String str = sc.nextLine();      
		System.out.println("Vous avez saisi : " + str);
		sc.close();
		
	}

}
