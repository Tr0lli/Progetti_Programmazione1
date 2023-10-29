
public class PoliziaMunicipale {
	private String comune;
	private Multa[] multe;
	
	public PoliziaMunicipale(String comune, int multeMax) {
		this.comune = comune;
		multe = new Multa[multeMax];
	}
	
	public PoliziaMunicipale(String comune) {
		this(comune, 1000);
	}
	
	public boolean multaInserita(Multa multa) {
		if (multa != null) {
			for (int i=0; i<multe.length; i++) {
				if (multe[i] != null && multa.equals(multe[i])) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean aggiungiMulta(Multa multa) {
		if (multa != null && !multaInserita(multa)) {
			for (int i=0; i<multe.length; i++) {
				if (multe[i] == null) {
					multe[i] = multa;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean aggiungiMulta(String numeroVerbale, int importo) {
		if (numeroVerbale != null && numeroVerbale != "" && importo>0 && !multaInserita(new Multa(numeroVerbale, importo))) {
			for (int i=0; i<multe.length; i++) {
				if (multe[i] == null) {
					multe[i] = new Multa(numeroVerbale, importo);
					return true;
				}
			}
		}
		return false;
	}
	
	public Multa rimuoviMulta(Multa multa) {
		if (multa != null) {
			for (int i=0; i<multe.length; i++) {
				if (multe[i] != null && multe[i].equals(multa)) {
					Multa tmp = multe[i];
					multe[i] = null;
					return tmp;
				}
			}
		}
		
		return null;
	}
	
	public int fatturato() {
		int totale = 0;
		for(int i=0; i<multe.length; i++) {
			if (multe[i] != null && multe[i].isPagata() == true) {
				totale = totale + multe[i].getImporto();
			}
		}
		return totale;
	}
	
	
	
}
