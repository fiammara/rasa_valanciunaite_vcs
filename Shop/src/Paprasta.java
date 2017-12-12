
public class Paprasta extends Prekes {

	private double SavoKaina;
		public Paprasta(String pavadinimas,  double NetoKaina, double SavoKaina) {
			super(pavadinimas, NetoKaina);
			this.SavoKaina=SavoKaina;
	}
		public double getKaina() {
			SavoKaina=(getNetoKaina()*0.21)+getNetoKaina();
			return SavoKaina;
			
		}

}
