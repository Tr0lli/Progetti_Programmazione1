
public class Libro implements Comparable<Libro> {

	private String titolo;
	private String autore;
	private int annoPub;
	
	// questo è 0 se è un libro normale, un numero che indica il volume se è una serie
	// ad emsepio di fumetti, enciclopedie etc
	private int numero;
	
	public Libro(String titolo, String autore, int annoPub) {
		this(titolo,autore,annoPub,0);
	}

	// costruttore per serie
	public Libro(String titolo, String autore, int annoPub, int numero) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.annoPub = annoPub;
		this.numero=numero;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPub() {
		return annoPub;
	}

	public void setAnnoPub(int annoPub) {
		this.annoPub = annoPub;
	}

	@Override
	public String toString() {
		return "Libro [Titolo=" + titolo + ", Autore=" + autore + ", annoPub=" + annoPub + ", numero " + numero +"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annoPub;
		result = prime * result + ((autore == null) ? 0 : autore.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
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
		Libro other = (Libro) obj;
		if (annoPub != other.annoPub)
			return false;
		if (autore == null) {
			if (other.autore != null)
				return false;
		} else if (!autore.equals(other.autore))
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Libro o) {
		if (titolo.compareTo(o.titolo) != 0) {
			return titolo.compareTo(o.titolo);
		}
		if (autore.compareTo(o.autore) != 0) {
			return autore.compareTo(o.autore);
		}
		if (annoPub == o.annoPub) {
			return 0;
		} else if (annoPub > o.annoPub) {
			return 1;
		} else {
			return -1;
		}
	}
	
	
	
	
	
}
