import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Libreria {

	public List<Libro> alLibri;
	public Set<Libro> tsLibri;
	public Set<Libro> hsLibri;
	public Map<Libro, Integer> hmLibri;
	public Map<Libro, List<Libro>> hmLibri1;
	public Map<Libro, Map<Integer, Integer>> hmLibri2;
	
	public Libreria() {
		alLibri = new ArrayList<>();
		tsLibri = new TreeSet<>();
		hsLibri = new HashSet<>();
		hmLibri = new HashMap<>();
		hmLibri1 = new HashMap<>();
		hmLibri2 = new HashMap<>();
	}

	public boolean arrayAggiungiLibro(Libro l) {
		if (l == null) {
			return false;
		}
		return alLibri.add(l);
	}

	public boolean tsAggiungiLibro(Libro l) {
		if (l == null) {
			return false;
		}
		return tsLibri.add(l);
	}

	public boolean hsAggiungiLibro(Libro l) {
		if (l == null) {
			return false;
		}
		return hsLibri.add(l);
	}
	
	public void elencaLibri() {
		for (Libro libro: alLibri) {
			System.out.println(libro.toString());
		}
		System.out.println();
		for (Libro libro: tsLibri) {
			System.out.println(libro.toString());
		}
		System.out.println();
		for (Libro libro: hsLibri) {
			System.out.println(libro.toString());
		}
	}

	public void hmAggiungiLibro(Libro libro) {
		if (libro == null) {
			return;
		}
		if (hmLibri.containsKey(libro)) {
			hmLibri.put(libro, hmLibri.get(libro) + 1);
		} else {
			hmLibri.put(libro, 1);
		}
		
	}

	public boolean arrayRimuoviCopieLibro(Libro libro) {
		if (libro == null) {
			return false;
		}
		if (alLibri.contains(libro)) {
			while (alLibri.contains(libro)) {
			alLibri.remove(libro);
			}
			return true;
		}
		return false;
		
	}

	public boolean tsRimuoviLibro(Libro libro) {
		if (tsLibri.contains(libro)) {
			tsLibri.remove(libro);
			return true;
		}
		return false;
	}
	
	public boolean hsRimuoviLibro(Libro libro) {
		if (hsLibri.contains(libro)) {
			hsLibri.remove(libro);
			return true;
		}
		return false;
	}

	public boolean arrayRimuoviLibro(Libro libro) {
		if (alLibri.contains(libro)) {
			alLibri.remove(libro);
			return true;
		}
		return false;
	}

	public void hmAggiungiLibro1(Libro serie, Libro libro) {
		if (hmLibri1.containsKey(serie)) {
			hmLibri1.get(serie).add(libro);
		} else {
			List<Libro> libri = new ArrayList<>();
			libri.add(libro);
			hmLibri1.put(libro, libri);
		}
	}

	public void hmAggiungiLibro2(Libro libro) {
		if (hmLibri2.containsKey(libro)) {
			Map<Integer, Integer> numeroCopie = hmLibri2.get(libro);
			numeroCopie.put(libro.getNumero(), numeroCopie.get(libro.getNumero() + 1));  
		} else {
			Map<Integer, Integer> numeroCopie = new HashMap<>();
			numeroCopie.put(libro.getNumero(), 1); 
			hmLibri2.put(libro, numeroCopie);
		}
		
	}
	
	
}
