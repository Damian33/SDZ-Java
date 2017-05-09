package sdz_java;

public class variables_operateurs {

	public static void main(String[] args) {
		byte temperature = 64;	//1 octet : (2^7)-1 � 2^7
		short vitesseMax = 32000;	//2 octets : (2^15)-1 � 2^15
		int temperatureSoleil = 15600000;	//4 octets : (2^32)-1 � 2^32
		long anneeLumiere = 9460700000000000L;	//8 octets : (2^64)-1 � 2^64
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
		
		//Premi�re m�thode de d�claration
		String phrase;
		phrase = "Titi et Grosminet";
		//Deuxi�me m�thode de d�claration
		String str = new String();
		str = "Une autre cha�ne de caract�res";
		//Troisi�me m�thode de d�claration
		String string = "Une autre cha�ne";
		//Quatri�me m�thode de d�claration
		String chaine = new String("Et une de plus !");
		System.out.println(phrase);
		System.out.println(str);
		System.out.println(string);
		System.out.println(chaine);

	}

}
