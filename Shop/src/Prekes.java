
abstract public class Prekes {
	private String pavadinimas;
	private double NetoKaina;

	public Prekes(String pavadinimas, double NetoKaina) {
		super();
		this.pavadinimas = pavadinimas;
		this.NetoKaina = NetoKaina;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public double getNetoKaina() {
		return NetoKaina;
	}

	public void setNetoKaina(double netoKaina) {
		NetoKaina = netoKaina;
	}
	

	@Override
	public String toString() {
		return "Prekes [pavadinimas=" + pavadinimas + ", NetoKaina=" + NetoKaina + "]";
	}

	
}
