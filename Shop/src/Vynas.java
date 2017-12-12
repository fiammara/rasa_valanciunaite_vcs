
public class Vynas extends Prekes {
	private double SavoKaina;
	private double litrai;
	private double turis;

	public Vynas(String pavadinimas, double NetoKaina, double SavoKaina, double litrai, double turis) {
		super(pavadinimas, NetoKaina);
		this.SavoKaina = SavoKaina;
		this.litrai = litrai;
		this.turis = turis;
	}

	public double getKaina() {
		if (turis < 8.5) {
			SavoKaina = (getNetoKaina() * 0.21) + getNetoKaina() + (0.28 * litrai);
		} else {
			SavoKaina = (getNetoKaina() * 0.21) + getNetoKaina() + (0.72 * litrai);
		}
		return SavoKaina;

	}

}
