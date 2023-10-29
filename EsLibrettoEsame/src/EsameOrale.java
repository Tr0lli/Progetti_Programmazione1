
public class EsameOrale extends Esame {
	
	private double voto;

	public EsameOrale(int CFU, String codice, double voto) throws EsameNonValidoException {
		super(CFU, codice);
		if (voto <18 || voto >31) {
			throw new EsameNonValidoException();
		} else
			this.voto = voto;
		
	}

	@Override
	public double voto() {
		return voto;
	}

}
