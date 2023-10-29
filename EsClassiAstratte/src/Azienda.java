
public class Azienda {
	private Dipendente[] dipendenti;
	
	public Azienda(int maxDipendenti) {
		this.dipendenti = new Dipendente[maxDipendenti];
	}
	
	public void aggiungiDipendente(Dipendente d) {
		if (d != null) {
			for(int i=0; i< dipendenti.length; i++) {
				if (dipendenti[i] == null) {
					dipendenti[i] = d;
					break;
				}
			}
		}
	}
	
	public double costoAnnuoDipendenti() {
		 double costo = 0.0;
		 for (int i=0; i < dipendenti.length; i++) {
			 if (dipendenti[i] != null) {
				 costo += dipendenti[i].calcolaRal();
			 }
		 }
		 return costo;
	}
}
