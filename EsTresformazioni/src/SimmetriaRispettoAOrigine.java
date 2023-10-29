
public class SimmetriaRispettoAOrigine extends TrasformazioneGeometrica {
	protected Punto trasforma(Punto originale) {
		Punto nuovoPunto = new Punto(originale.getEtichetta(), -originale.getX(), -originale.getY());
		return nuovoPunto;
	}
}
