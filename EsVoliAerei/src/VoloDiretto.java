
public class VoloDiretto extends Volo {
	
	private int durataInMinuti;
	
	public VoloDiretto(String aeroportoPartenza, String aeroportoArrivo, int durataInMinuti) throws VoloNonValidoException {
		super(aeroportoPartenza, aeroportoArrivo);
		if (durataInMinuti > 0) {
			this.durataInMinuti = durataInMinuti;
		} else {
			throw new VoloNonValidoException();
		}
	}

	@Override
	public int getNumeroTratte() {
		return 1;
	}

	@Override
	public int getDurataInMinuti() {
		return durataInMinuti;
	}

}
