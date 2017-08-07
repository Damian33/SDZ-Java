package sdz;

public class Capitale extends Ville {
	private String monument;
	
	public Capitale () {
		super(); // appel le constructeur de la classe mère
		this.nomVille = "InconnuInconnu";
		monument = "aucun";
	}
}
