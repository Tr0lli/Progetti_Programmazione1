
public class Multa {
	private String numeroVerbale;
	private int importo;
	private boolean pagata;
	
	public Multa(String numeroVerbale, int importo) {
		this.numeroVerbale = numeroVerbale;
		this.importo = importo;
		pagata = false;
	}
	
	public boolean isPagata() {
		return pagata;
	}

	public String getNumeroVerbale() {
		return numeroVerbale;
	}

	public int getImporto() {
		return importo;
	}
	
	public void paga() {
		pagata = true;
	}
	
	public boolean equals(Multa altra) {
		if (altra != null && altra.numeroVerbale.equalsIgnoreCase(numeroVerbale)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Multa [numeroVerbale=" + numeroVerbale + ", importo=" + importo + ", pagata=" + pagata + "]";
	}
	
	
	
}
