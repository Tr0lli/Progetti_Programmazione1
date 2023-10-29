import java.util.HashSet;
import java.util.Set;

public class Grafico {
	private Set<Punto> punti;
	
	
	public Grafico(Punto primoPunto) {
		punti = new HashSet<>();
		if (primoPunto != null) {
			punti.add(primoPunto);
		}
		
	}
	
	public void aggiungiPunto(Punto punto) throws GraficoException {
		if (punto != null) {
			for (Punto p : punti) {
				if (p.equals(punto)) {
					throw new GraficoException();
				}
			}
			punti.add(punto);
		}
	}
	
	public void trasforma(TrasformazioneGeometrica trasformazione) {
		if (trasformazione != null) {
			punti = trasformazione.trasforma(punti);
		}
	}
	
	public void visualizza() {
		System.out.println(punti);
	}

	public int getNumeroPunti() {
		return punti.size();
	}
	
	
	
}
