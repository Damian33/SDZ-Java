public class variables_operateurs {

	public static void main(String[] args) {
		byte temperature = 64;	//1 octet : (2^7)-1 à 2^7
		short vitesseMax = 32000;	//2 octets : (2^15)-1 à 2^15
		int temperatureSoleil = 15600000;	//4 octets : (2^32)-1 à 2^32
		long anneeLumiere = 9460700000000000L;	//8 octets : (2^64)-1 à 2^64
		System.out.println("byte : "+temperature);
		System.out.println("short : "+vitesseMax);
		System.out.println("int : "+temperatureSoleil);
		System.out.println("long : "+anneeLumiere);
		
		float pi = 3.141592653f; //4 octets
		float nombre = 2.0f; // 8 octets
		double division = 0.333333333333333333333333333333333333333333334d;
		System.out.println("float : "+pi);
		System.out.println("float : "+nombre);
		System.out.println("double : "+division);
		
		char caractere = 'A';
		boolean question = true;
		System.out.println("char : "+caractere);
		System.out.println("boolean : "+question);
		
		String phrase;
		phrase = "Titi et Grosminet";
		String str = new String();
		str = "Une autre chaîne de caractères";
		String string = "Une autre chaîne";
		String chaine = new String("Et une de plus !");
		System.out.println(phrase);
		System.out.println(str);
		System.out.println(string);
		System.out.println(chaine);		
		
		int modulo = 10/3;
		System.out.println("modulo : "+modulo);
		
		int nbre1 = 0;
		nbre1 = nbre1 + 1;
		
		nbre1 += 1;
		nbre1++;
		++nbre1;
		nbre1 = nbre1 - 1;
		nbre1 -= 1;
		nbre1--;
		--nbre1;
		System.out.println(nbre1);
		
		double nbre2 = 10, nbre3 = 3;
		int resultat = (int)(nbre2 / nbre3); //cast de variables
		System.out.println("Le résultat est = " + resultat);

		int nbre4 = 3, nbre5 = 2;
//		double resultat2 = (double)(nbre4 / nbre5);
		double resultat2 = (double) nbre4 / (double) nbre5;
		System.out.println("Le résultat est = " + resultat2);
		
		//Cast d'un int en String
		int i = 12;
		String j = new String();
		j = String.valueOf(i);
		System.out.println(j);
		
		//Cast d'un String en int
		int k = Integer.valueOf(j).intValue(); //floatValue(), doubleValue()
		System.out.println(k);
		
		//Depuis Java 7
//		double nombre = 1____000____000___000_000d; // cast en d
//		int entier = 32_000;
//		int entier2 = 0xFF; //notation hexa, prefixe 0x
//		int entier3 = 0b1111_1111; //notation binaire, prefixe 0b
//		System.out.println(nombre);
//		System.out.println(entier);
//		System.out.println(entier2);
//		System.out.println(entier3);
		
	}

}
