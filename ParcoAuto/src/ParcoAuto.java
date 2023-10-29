
public class ParcoAuto {
	private Auto[] autoAziendali;
	
	public ParcoAuto(int maxAuto) {
		if (maxAuto > 0) {
			autoAziendali = new Auto[maxAuto];
		}
	}
	
	public Auto trovaAuto(Auto auto) {
		if (auto != null) {
			for(int i=0; i<autoAziendali.length; i++) {
				if (autoAziendali[i] != null && autoAziendali[i].equals(auto)) {
					return autoAziendali[i];
				}
			}
		}
		return null;
	}
	
	public boolean inserisciNuovaAuto(String targa) {
		if (targa != null) {
			Auto aNuova = new Auto(targa);
			if (trovaAuto(aNuova) == null) {
				for(int i=0; i<autoAziendali.length; i++) {
					if (autoAziendali[i] == null) {
						autoAziendali[i] = aNuova;
						return true;
					}
				}
			}
		}
		return false;	
	}
	
	public boolean rientroAuto(Auto autoRientrata) {
		if (autoRientrata != null) {
			Auto tmp = trovaAuto(autoRientrata);
			if (tmp != null) {
				return tmp.aggiornaKm(autoRientrata.getKmPercorsi() - tmp.getKmPercorsi());
				
			}
		}
		return false;
	}
	
	public boolean rientroAuto(String targa, int kmAlRientro) {
		return rientroAuto(new Auto(targa, kmAlRientro));
	}
	
	
}
