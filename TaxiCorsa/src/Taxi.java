
public class Taxi {
	private int totaleCorseEffettuate;
	private Corsa corsaInSvolgimento;
	private Corsa[] corseEffettuate;
	
	public Taxi() {
		corseEffettuate = new Corsa[5];
		corsaInSvolgimento = null;
		totaleCorseEffettuate = 0;
	}
	
	public boolean nuovaCorsa(String destinazione) {
		if (isLibero() && destinazione != "" && destinazione != null) {
			if (getTotaleCorseEffettuate() < 5) {
				corsaInSvolgimento = new Corsa(destinazione);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isLibero() {
		if (corsaInSvolgimento == null) {
			return true;
		}
		return false;
	}
	
	public int getTotaleCorseEffettuate() {
		int contatore = 0;
		for(int i=0; i<corseEffettuate.length; i++) {
			if (corseEffettuate[i] != null) {
				contatore += 1;
			} 
		}
		return contatore;
	}
	
	public void terminaCorsa(int kmPercorsi) {
		int tot = getTotaleCorseEffettuate();
		if (!isLibero()) {
			corseEffettuate[tot] = corsaInSvolgimento;
			corseEffettuate[tot].aggiungiKm(kmPercorsi);
			corsaInSvolgimento = null;
			totaleCorseEffettuate++;
		}
	}
	
	public Corsa  trovaCorsaConCostoMaggiore(String destinazione) {
		if (getTotaleCorseEffettuate() > 0) {
			boolean trovata = false;
		    int contatore = 0;
			for (int i=0; i<getTotaleCorseEffettuate(); i++) {
				if (corseEffettuate[i].getDestinazione().equals(destinazione)) {
					if ( corseEffettuate[contatore].calcolaTariffa() <= corseEffettuate[i].calcolaTariffa()) {
						contatore = i;
						trovata = true;
					}
				}
			}
			if (trovata) {
				return corseEffettuate[contatore];

			}
		}
		
		return null;
	}
	
	
	
	
	
}
