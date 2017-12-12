
public class Alkoholis extends Prekes {

	private double SavoKaina;
	private double litrai;
	private double turis;
	public Alkoholis(String pavadinimas, double NetoKaina, double SavoKaina, double litrai, double turis) {
		super(pavadinimas, NetoKaina);
		this.SavoKaina=SavoKaina;
		this.litrai=litrai;
		this.turis=turis;
	}
	public double getKaina() {
		
		if(turis<15) {
		SavoKaina=(getNetoKaina()*0.21)+getNetoKaina()+ (0.89*litrai);}
		else {SavoKaina=(getNetoKaina()*0.21)+getNetoKaina()+ (1.26*litrai);}
		return SavoKaina;
		
	}

}
