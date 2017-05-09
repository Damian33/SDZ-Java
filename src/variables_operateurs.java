package sdz_java;

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
		double nombre = 2.0f; // 8 octets
		System.out.println("float : "+pi);
		System.out.println("double : "+nombre);
	}

}
