
public class Runner {
	
	private int eta;
	private int migliorTempo;
	private String idRunner;

	public Runner(int eta, int migliorTempo, String idRunner) throws RunnerNotValidException {
		if (eta <10 || eta >100 || migliorTempo <= 0 || idRunner == null || idRunner == "") {
			throw new RunnerNotValidException();
		}
		this.eta = eta;
		this.migliorTempo = migliorTempo;
		this.idRunner = idRunner;
	}

	public int getEta() {
		return eta;
	}

	public int getMigliorTempo() {
		return migliorTempo;
	}

	public String getIdRunner() {
		return idRunner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRunner == null) ? 0 : idRunner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Runner other = (Runner) obj;
		if (idRunner == null) {
			if (other.idRunner != null)
				return false;
		} else if (!idRunner.equals(other.idRunner))
			return false;
		return true;
	}
	
	

}
