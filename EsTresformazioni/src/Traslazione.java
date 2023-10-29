
public class Traslazione extends TrasformazioneGeometrica {
	private int deltaX;
	private int deltaY;
	
	public Traslazione(int deltaX, int deltaY) {
		super();
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
	
	@Override
	protected Punto trasforma(Punto originale) {
		Punto nuovoPunto = new Punto(originale.getEtichetta(), originale.getX() + deltaX, originale.getY() + deltaY);
		return nuovoPunto;
		
	}
}
