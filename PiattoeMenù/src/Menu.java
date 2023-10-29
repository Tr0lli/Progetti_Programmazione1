
public class Menu {
	private Piatto[] portate;
	
	public Menu(int maxPortate) {
		if (maxPortate <= 0 || maxPortate > 5) {
			portate = new Piatto[5];
		} else {
			portate = new Piatto[maxPortate];
		}
	}
	public Menu() {
		this(5);
	}
	
	public int tipoPiattoPresente(int tipo) {
		for (int i=0; i<portate.length; i++) {
			if (portate[i] != null && portate[i].getTipo() == tipo) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean aggiungiPiatto(Piatto piatto) {
		if (piatto != null) {
			for (int i=0; i<portate.length; i++) {
				if (portate[i] != null) {
					if (portate[i].getTipo() == piatto.getTipo()) {
						return false;
					}
				}
			}
			for (int i=0; i<portate.length; i++) {
				if (portate[i] == null) {
					portate[i] = piatto;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean rimuoviPiatto(Piatto piatto) {
		for (int i=0; i<portate.length; i++) {
			if (portate[i] != null && portate[i].equals(piatto) ) {
				portate[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public boolean sostituisciPiatto(Piatto piatto) {
		if (piatto != null) {
			for (int i=0; i<portate.length; i++) {
				if (piatto.getTipo() == portate[i].getTipo()) {
					rimuoviPiatto(portate[i]);
					aggiungiPiatto(piatto);
					return true;
					
				}
			}
		}
		return false;
	}
	
	public int dimensioneMenu() {
		return portate.length;
	}
	
	public int calcolaCosto() {
		int costoTot = 0;
		for (int i=0; i<portate.length; i++) {
			if (portate[i] != null) {
				costoTot += portate[i].getCosto(); 
			}
		}
		return costoTot;
	}
	
}
