import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class MieiTest {

	Libreria libreria=new Libreria();
	
	@Before
	public void testCreazione() {
		System.out.println("Inizializzo");
		
		Libro l1= new Libro("Il nome della rosa", "Umbero Eco", 1980);
		Libro l2= new Libro("1984", "G. Orwell", 1949);
		Libro l3= new Libro("Angeli e demoni", "Dan Brown", 2000);
		
		libreria.arrayAggiungiLibro(l1);
		libreria.arrayAggiungiLibro(l2);
		libreria.arrayAggiungiLibro(l3);
		
		// posso inserire un libro uguale 2 volte ? qui si'
		assertTrue(libreria.arrayAggiungiLibro(l3));
		
		// per fare questo, devo aggiungere la compare al Libro
		libreria.tsAggiungiLibro(l1);
		libreria.tsAggiungiLibro(l2);
		libreria.tsAggiungiLibro(l3);
		// posso inserire un libro uguale 2 volte ? qui no
		assertFalse(libreria.tsAggiungiLibro(l3));
		
		// per fare questo, devo aggiungere la compare al Libro
		libreria.hsAggiungiLibro(l1);
		libreria.hsAggiungiLibro(l2);
		libreria.hsAggiungiLibro(l3);
		
		// in array trovo 1 4 libri nell'ordine in cui li ho inseriti,
		// in TreeseT non trovo i doppioni e li trovo in ordine di titolo
		// in hashSet non trovo i doppioni ma sono in ordine sconosciuto, in base all'hash
		
		//System.out.println("Stampa libri dopo inizializzazione \n");
		libreria.elencaLibri();
		
	}
	
	@Test
	public void stampa() {
		System.out.println("Test stampa");
		
		// in array trovo 1 4 libri nell'ordine in cui li ho inseriti,
		// in TreeseT non trovo i doppioni e li trovo in ordine di titolo
		libreria.elencaLibri();
	}
	
	@Test
	public void testeliminazione() {
		System.out.println("Test eliminazione: elenco libri prima di eliminazione \n");
		libreria.elencaLibri();
		
		System.out.println("Test eliminazione: elenco libri dopo eliminazioni \n");
		
		//assertTrue(libreria.arrayRimuoviLibro(new Libro("Angeli e demoni", "Dan Brown", 2000)));
		//assertTrue(libreria.arrayRimuoviLibro(new Libro("Angeli e demoni", "Dan Brown", 2000)));
		assertTrue(libreria.arrayRimuoviCopieLibro(new Libro("Angeli e demoni", "Dan Brown", 2000)));
		
		assertTrue(libreria.tsRimuoviLibro(new Libro("Angeli e demoni", "Dan Brown", 2000)));
		assertFalse(libreria.tsRimuoviLibro(new Libro("Angeli e demoni", "Dan Brown", 2000)));
		
		assertFalse(libreria.arrayRimuoviLibro(null));
		
		libreria.elencaLibri();
	}
	
	@Test
	public void CreaMappa() {
		System.out.println("Test Crea mappa \n");
		
		libreria.hmAggiungiLibro(new Libro("Il signore degli anelli", "Tolkien", 1920));
		libreria.hmAggiungiLibro(new Libro("Il signore degli anelli", "Tolkien", 1920,1));
		libreria.hmAggiungiLibro(new Libro("Il signore degli anelli", "Tolkien", 1920,2));
		
		assertEquals(libreria.hmLibri.get(new Libro("Il signore degli anelli", "Tolkien", 1920)),3,0);
		System.out.println("hm:" + libreria.hmLibri.toString() +"\n");
		
		Libro serie=new Libro("Il signore degli anelli", "Tolkien", 1920);
		libreria.hmAggiungiLibro1(serie,new Libro("Compagnia anello", "Tolkien", 1920));
		libreria.hmAggiungiLibro1(serie, new Libro("Le 2 torri", "Tolkien", 1920));
		libreria.hmAggiungiLibro1(serie, new Libro("Ritorno Re", "Tolkien", 1920));
		
		System.out.println("hm1:" + libreria.hmLibri1.toString()+"\n");
		
		libreria.hmAggiungiLibro2(new Libro("Il signore degli anelli", "Tolkien", 1920));
		libreria.hmAggiungiLibro2(new Libro("Il signore degli anelli", "Tolkien", 1920,1));
		libreria.hmAggiungiLibro2(new Libro("Il signore degli anelli", "Tolkien", 1920,1));
		
/*		HashMap<Integer,Integer> app=libreria.hmLibri2.get(new Libro("Il signore degli anelli", "Tolkien", 1920));
		assertEquals(app.get(1) ,2,0);
		assertEquals(app.get(0) ,1,0);
		// la et restituisce null se non trova nulla!
		assertEquals(app.get(2) ,null);
		
		System.out.println(libreria.hmLibri2.toString());
		
*/		
	}

}
