import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RegistroVoli {
	private Map<String, Volo> voli;
	
	public RegistroVoli() {
		voli = new HashMap<>();
	}
	
	public Volo getVolo(String codice) {
		return voli.get(codice);
		
	}

	public void aggiungiVolo(String codice, Volo volo) throws CodiceVoloNonValidoException, VoloNonValidoException {
		if (codice != null && codice.length() == 5) {
			if (volo == null) {
				throw new VoloNonValidoException();
			} 
			voli.put(codice, volo);
		} else {
			throw new CodiceVoloNonValidoException();
		}
	}
	
	public void aggiungiVolo(String codice, String aeroportoPartenza, String aeroportoArrivo, int durata ) throws CodiceVoloNonValidoException, VoloNonValidoException {
		this.aggiungiVolo(codice, new VoloDiretto(aeroportoPartenza, aeroportoArrivo, durata));
	}
	
	public String[] getListaCodiciDeiVoli() {
		Set<String> chiavi = voli.keySet();
		String[] aChiavi = new String[voli.size()];
		for (String s : chiavi) {
			int i = 0;
			aChiavi[i] = s;
			i++;
		}
		return aChiavi;
		
	}
	
	public void dumpSuFile(String nomeFile) throws IOException {
		PrintWriter pout = null;
		try {
			FileOutputStream fout = new FileOutputStream(nomeFile);
			pout = new PrintWriter(fout);
			
			//funziona anche con foreach
			Iterator<Entry<String, Volo>> it = voli.entrySet().iterator(); 
			while (it.hasNext()) { 
				Entry<String, Volo> e = it.next();
				String str = e.getKey() + " " + e.getValue();
				pout.println(str);
			}
		} finally {
			if (pout != null)
				pout.close();
		}
	}
}
