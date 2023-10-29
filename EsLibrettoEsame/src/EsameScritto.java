
public class EsameScritto extends Esame {
	
	public final int PESO_TEORIA = 40;
	
	private double votoTeoria;
	private double votoPratica;

	public EsameScritto(int CFU, String codice, double votoTeoria, double votoPratica) throws EsameNonValidoException {
		super(CFU, codice);
		this.votoTeoria = votoTeoria;
		this.votoPratica = votoPratica;
		if (voto() <18 || voto() >31) {
			throw new EsameNonValidoException();
		}
	}

	@Override
	public double voto() {
		return (PESO_TEORIA*votoTeoria + (100- PESO_TEORIA)*votoPratica)/100;
	}

}
