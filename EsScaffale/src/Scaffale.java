import java.util.Arrays;

public class Scaffale {
	private Libro[] libri;
	
	public Scaffale(int dimensione) {
		libri = new Libro[dimensione];
	}
	
	public Scaffale() {
		this(10);
		//libri = new Libro[10];
	}
	
	public boolean aggiungiLibro(Libro libro) {
		if (libro != null) {
			for  (int i = 0; i<libri.length; i++) {
				if (libri[i] == null) {
					libri[i] = libro;
					return true;
				}
			}
		}return false;
	}
	
	public boolean aggiungiLibro(String autore, String titolo, int numeroPagine) {
		return aggiungiLibro(new Libro(autore, titolo, numeroPagine));
	}
	
	private Libro rimuovi(int posizione) {
		if (posizione > 0 && posizione < libri.length) {
			Libro tmp = libri[posizione];
			libri[posizione] = null;
			return tmp;
		}
		return null;
	}
	
	public Libro prelevaLibro(Libro libro) {
		if (libro != null) {
			for (int i = 0; i<libri.length; i++) {
				if (libri[i].equals(libro)) {
					return rimuovi(i);
				}
			}
		}
		return null;
	}
	
	public Libro prelevaLibro(String autore, String titolo) {
		for (int i = 0; i<libri.length; i++) {
			if (libri[i] != null) {
				if (libri[i].getAutore().equals(autore) && titolo.equals(libri[i].getTitolo())) {
					return rimuovi(i);
				}
			}
			
		}
		return null;
	}
	
	public Libro prelevaLibro(int posizione) {
		return rimuovi(posizione);
	}
	
	public int numeroLibri() {
		int contatore = 0;
		for (int i=0; i<libri.length; i++) {
			if (libri[i] != null) {
				contatore++;
			}
		}
		return contatore;
	}

	public Libro[] prelevaLibriDi(String autore) {
		int contatore = 0;
		for (int i=0; i<libri.length; i++) {
			if (libri[i] != null) {
				if (autore.equals(libri[i].getAutore())) {
					contatore++;
				}
			}
		}
		if (contatore != 0) {
			Libro[] libriAutore = new Libro[contatore];
			for (int i=0; i<libri.length; i++) {
				if (libri[i] != null) {
					if (autore.equals(libri[i].getAutore())) {
						libriAutore[i] = libri[i];
					}
				}
			}
			return libriAutore;
		}
		
		return null;
	}

	@Override
	public String toString() {
		return "Scaffale [libri=" + Arrays.toString(libri) + ", numeroLibri()=" + numeroLibri() + "]";
	}

	
}
