import java.util.ArrayList;
import java.util.List;

public abstract class Gara {

	protected List<Runner> partecipanti;
	
	public Gara() {
		partecipanti = new ArrayList<>();
	}
	
	public abstract boolean vincoloIscrizioneSoddisfatto(Runner runner);

	public void iscrivi(Runner runner) throws RunnerNotValidException {
		if (runner == null)
			throw new RunnerNotValidException();
		if (partecipanti.contains(runner) || !vincoloIscrizioneSoddisfatto(runner)) {
			throw new RunnerNotValidException();
		} else
			partecipanti.add(runner);
	}
	
	public int iscrivi(ArrayList<Runner> runners) {
		int ris = 0;
		for (Runner r : runners) {
			try{
				iscrivi(r);
			}catch(RunnerNotValidException e) {
				++ris;
			}
		}
		return ris;
	}
	
	public int getNumIscritti() {
		return partecipanti.size();
	}
	
	public ArrayList<Runner> getIscrittiClasseEta(int eta){
		ArrayList<Runner> ris = new ArrayList<>();
		for (Runner r : ris) {
			if (r.getEta() > eta) {
				ris.add(r);
			}
		}
		return ris;
	}
	
	
	
}
