
public abstract class Dipendente {
	private String nome;
	private int matricola;
	private double stipendioMensile;
	
	public Dipendente(String nome, int matricola, double stipendioMensile) {
		this.nome = nome;
		this.matricola = matricola;
		this.stipendioMensile = stipendioMensile;
	}
	
	public abstract double calcolaRal();

	public double getStipendioMensile() {
		return stipendioMensile;
	}
	

}
