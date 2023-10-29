
public class Auto {
	private String targa;
	private int km;
	
	public Auto(String targa, int kmPercorsi) {
		if (targa != null && kmPercorsi >= 0) {
			this.targa = targa;
			this.km = kmPercorsi;
		}
	}
	
	public Auto(String targa) {
		this(targa, 0);
	}
	
	public boolean aggiornaKm(int kmAggiuntivi) {
		if (kmAggiuntivi >= 0) {
			km += kmAggiuntivi;
			return true;
		}
		return false;
	}

	public String getTarga() {
		return targa;
	}

	public int getKmPercorsi() {
		return km;
	}
	
	public boolean equals(Auto altra) {
		if (altra != null) {
			if (altra.targa.equals(targa)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "Auto [targa=" + targa + ", km=" + km + "]";
	}

}
