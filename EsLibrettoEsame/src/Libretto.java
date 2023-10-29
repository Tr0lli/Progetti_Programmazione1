import java.util.HashSet;
import java.util.Set;

public class Libretto {
	
	private Set<Esame> esami;

	public Libretto() {
		esami = new HashSet<>();
	}
	
	public boolean aggiungiEsame(Esame esame) throws EsameNonValidoException {
		if (esame == null) {
			throw new EsameNonValidoException();
		} 
		return esami.add(esame);
	}
	
	public double calcolaMedia() {
		int numCFU = 0;
		double ris = 0.0;
		for (Esame e : esami) {
			numCFU += e.getCFU();
			ris += e.voto()*e.getCFU();
		}
		return ris/numCFU;
	}
	
	public int numeroEsamiSoloOrale() throws EsameNonValidoException {
		int ris = 0;
		for (Esame e : esami) {
			Esame EsameOrale = new EsameOrale(8, "abc", 27);
			if (e.getClass() == EsameOrale.getClass()) {
				ris++;
			}
		}
		return ris;
	}

	@Override
	public String toString() {
		return "Libretto [esami=" + esami + "]";
	}
	
	
	
}
