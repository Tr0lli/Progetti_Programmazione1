import java.util.Set;
import java.util.TreeSet;

public class CicloRiunioni {
	
	private Set<Riunione> ciclo = null;

	public CicloRiunioni() {
		ciclo = new TreeSet<Riunione>();
	}
	
	public void aggiungiRiunione(Riunione riunione) throws RiunioneNonValidaException, ClassCastException {
		if (riunione == null) {
			throw new RiunioneNonValidaException();
		} else {
			ciclo.add(riunione);
		}
	}
	
	public int getNumeroRiunioni() {
		return ciclo.size();
	}
	
	public int getNumeroRiunioniVirtuali() throws RiunioneNonValidaException {
		int ris = 0;
		//RiunioneVirtuale riunioneProva = new RiunioneVirtuale(2022, 6, 27, 3);
		for (Riunione r : ciclo) {
			if (r instanceof RiunioneVirtuale) {
				ris++;
			}
		}
		return ris;
	}
	
	public int calcolaImpegnoComplessivo() {
		int ris = 0;
		for (Riunione riunione : ciclo) {
			ris += riunione.getImpegnoOrarioComplessivo();
		}
		return ris;
	}

	@Override
	public String toString() {
		return "CicloRiunioni [ciclo=" + ciclo + "]";
	}
	
	

}
