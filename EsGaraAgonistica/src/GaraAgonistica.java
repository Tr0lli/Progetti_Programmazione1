
public class GaraAgonistica extends Gara implements CompetizioneAgonistica {

	private int maxTempo;
	private Runner vincitore;
	
	public GaraAgonistica(int maxTempo) {
		vincitore = null;
		this.maxTempo = maxTempo;
	}

	@Override
	public boolean vincoloIscrizioneSoddisfatto(Runner runner) {
		if (runner != null) {
			if (runner.getMigliorTempo() < maxTempo) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setVincitore(Runner runner) throws RunnerNotValidException {
		if (partecipanti.contains(runner)) {
			vincitore = runner;
		} else 
			throw new RunnerNotValidException();
		
	}

	@Override
	public Runner getVincitore() {
		return vincitore;
	}

}
