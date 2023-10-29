import java.util.ArrayList;
import java.util.List;

public class VoloMultiTratta extends Volo {

	private List<VoloDiretto> tratte = new ArrayList<VoloDiretto>();
	
	public VoloMultiTratta(List<VoloDiretto> tratte) throws VoloNonValidoException {
		super(estraiAreoportoPartenza(tratte), estraiAreoportoDestinazione(tratte));
		//this.tratte = new ArrayList<VoloDiretto>();
		for (int i = 0; i < tratte.size()-1; i++) {
			
			if (tratte.get(i).getAeroportoArrivo().equals(tratte.get(i+1).getAeroportoPartenza())) {
			} else {
				throw new VoloNonValidoException();
			}
		}
		this.tratte.addAll(tratte); //add(v);  //new VoloDiretto(v.getPartenza, v.getArrivo, v.getDurataInMinuti()); 
		
	}
	
	private static String estraiAreoportoPartenza(List<VoloDiretto>  tratte) throws VoloNonValidoException {
		if (tratte == null || tratte.size() < 2) {
			throw new VoloNonValidoException();
		}	
		return tratte.get(0).getAeroportoPartenza(); 
	}     
	
	private static String estraiAreoportoDestinazione(List<VoloDiretto>  tratte) throws VoloNonValidoException {
		if (tratte == null || tratte.size() < 2) {
			throw new VoloNonValidoException();
		}
		return tratte.get(tratte.size()-1).getAeroportoArrivo();
	}
	
	@Override
	public int getNumeroTratte() {
		return tratte.size();
	}

	@Override
	public int getDurataInMinuti() {
		int ris = 0;
		for (VoloDiretto v : tratte) {
			ris = ris + v.getDurataInMinuti();
		}
		return ris;
	}
	
	

}
