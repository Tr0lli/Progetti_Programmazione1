
public class MainTestScaffale {

	public static void main(String[] args) {
		Libro l1 = new Libro("Geronimo", "Stilton", 12);
		Scaffale s1 = new Scaffale();
		s1.aggiungiLibro(l1);
		s1.aggiungiLibro("Geronimo", "Stilton", 12);
		s1.toString();
		//s1.aggiungiLibro(new Libro("Cacca", "Pupù", 7));
		//l1.toString();
		s1.toString();
		Libro[] lib = s1.prelevaLibriDi("Geronimo");
		s1.toString();
		for (int i=0; i<lib.length; i++) {
			System.out.println(lib[i]);
			s1.aggiungiLibro(lib[i]);
		}
	}

}
