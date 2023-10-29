
public class Libro {
	private String autore;
	private String titolo;
	private int numeroPagine;
	
	public Libro(String autore, String titolo, int numeroPagine) {
		this.autore = autore;
		this.titolo = titolo;
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public boolean equals(Libro altro) {
		if (this == altro)
			return true;
		if (altro == null)
			return false;
		
		if (autore.equalsIgnoreCase(altro.autore) && titolo.equalsIgnoreCase(altro.titolo)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + ", numeroPagine=" + numeroPagine + "]";
	}


	
	
	

	
	
}
