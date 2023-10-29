
public abstract class Volo {
	private final String aeroportoPartenza;
	private final String aeroportoArrivo;
	
	public Volo(String aeroportoPartenza, String aeroportoArrivo) throws VoloNonValidoException {
		if (Aeroporti.aeroportoValido(aeroportoPartenza) && Aeroporti.aeroportoValido(aeroportoArrivo)) {
			this.aeroportoArrivo = aeroportoArrivo;
			this.aeroportoPartenza = aeroportoPartenza;
		} else {
			throw new VoloNonValidoException();
		}
			
		
			
	}

	public String getAeroportoPartenza() {
		return aeroportoPartenza;
	}

	public String getAeroportoArrivo() {
		return aeroportoArrivo;
	}
	
	public abstract int getNumeroTratte();
	
	public abstract int getDurataInMinuti();

	@Override
	public String toString() {
		return "Volo [aeroportoPartenza=" + aeroportoPartenza + ", aeroportoArrivo=" + aeroportoArrivo
				+ ", getNumeroTratte()=" + getNumeroTratte() + ", getDurataMinuti()=" + getDurataInMinuti() + "]";
	}

	
	
	
}
