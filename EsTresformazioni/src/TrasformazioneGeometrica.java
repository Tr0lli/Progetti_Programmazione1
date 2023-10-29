import java.util.HashSet;
import java.util.Set;

public abstract class TrasformazioneGeometrica {
	
	protected abstract Punto trasforma(Punto originale);
	
	public Set<Punto> trasforma(Set<Punto> originali){
		Set<Punto> daRitornare = new HashSet<>();
		for (Punto punto : originali) {
			daRitornare.add(trasforma(punto)); 
		}
		return daRitornare;
	}
	
}
