
public abstract class Riunione {
	
	private int anno;
	private int mese;
	private int giorno;
	protected int durata;
	
	public Riunione(int anno, int mese, int giorno, int durata) throws RiunioneNonValidaException {
		if (anno < 2021 || mese < 1 || mese > 12 || giorno < 1 || giorno > 31 || durata < 1) {
			throw new RiunioneNonValidaException();
		}
		this.anno = anno;
		this.mese = mese;
		this.giorno = giorno;
		this.durata = durata;
	}
	
	public abstract int getImpegnoOrarioComplessivo();
	
	public String getData() {
		return giorno +"/"+ mese +"/"+ anno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anno;
		result = prime * result + giorno;
		result = prime * result + mese;
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
		Riunione other = (Riunione) obj;
		if (anno != other.anno)
			return false;
		if (giorno != other.giorno)
			return false;
		if (mese != other.mese)
			return false;
		return true;
	}
	
	public String toString() {
		return "Data:" + getData() + "impegno orario complessivo:" + getImpegnoOrarioComplessivo();
	}

	public int compareTo(Riunione riunione) {
		return getData().compareTo(riunione.getData());
		
	}
	
}
