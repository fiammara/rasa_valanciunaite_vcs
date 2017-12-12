
public class Vaistas extends Prekes {
	private double SavoKaina;
	public Vaistas(String pavadinimas,  double NetoKaina, double SavoKaina) {
		super(pavadinimas, NetoKaina);
		this.SavoKaina=SavoKaina;
		
	}
	public double getKaina() {
		SavoKaina=(getNetoKaina()*0.09)+getNetoKaina();
		return SavoKaina;
		
	}

}
