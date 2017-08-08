package sdz;

public class Capitale extends Ville {
	private String monument;

	public Capitale() {
		super(); // appel le constructeur de la classe mère
		this.nomVille = "InconnuInconnu";
		monument = "aucun";
	}

	public Capitale(String nom, int hab, String pays, String monument) {
		super(nom, hab, pays);
		this.monument = monument;
	}

	public String decrisToi() {
		String str = super.decrisToi() + "\n\t ==>>" + this.monument + " en est un monument";
		System.out.println("Invocation de super.decrisToi()");

		return str;
	}

	/**
	 * @return le nom du monument
	 */
	public String getMonument() {
		return monument;
	}

	// Définit le nom du monument
	public void setMonument(String monument) {
		this.monument = monument;
	}

	public String toString() {
		String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
		return str;
	}
}
