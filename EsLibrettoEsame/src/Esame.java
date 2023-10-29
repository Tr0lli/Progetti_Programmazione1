
public abstract class Esame {
	
	private int CFU;
	private String codice;

	public Esame(int CFU, String codice) throws EsameNonValidoException {
		if (CFU <= 0 || codice == null || codice == "") {
			throw new EsameNonValidoException();
		}
		this.CFU = CFU;
		this.codice = codice;
	}
	
	public abstract double voto();
	
	

	@Override
	public String toString() {
		return "Esame [CFU=" + CFU + ", codice=" + codice + ", voto()=" + voto() + "]";
	}

	public int getCFU() {
		return CFU;
	}

	public String getCodice() {
		return codice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}

	
	
}
