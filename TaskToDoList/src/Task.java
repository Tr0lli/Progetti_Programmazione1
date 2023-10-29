
public class Task {
	
	private String titolo;
	private int data;
	private boolean eseguito;
	private int durata;
	
	public Task (String titolo, int data, int durata) {
		setTitolo(titolo);	
		setData(data);
		setDurata(durata);
		eseguito = false;
	}
	
	public Task(String titolo, int durata) {
		this(titolo, DataUtil.getDataDiOggi(), durata);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		if (titolo != null && titolo != "") {
			this.titolo = titolo;
		} else {
			this.titolo = "Da specificare";
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		if (data >= DataUtil.getDataDiOggi() ) {
			this.data = data;
		} else {
			this.data = DataUtil.getDataDiOggi();
		}
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		if (durata > 0 && durata < 9) {
			this.durata = durata;
		} else {
			this.durata = 1;
		}
	}
	
	public boolean isEseguito() {
		return eseguito;
	}
	
	public void eseguito() {
		eseguito = true;
	}

	@Override
	public String toString() {
		return "Task [titolo=" + titolo + ", data=" + data + ", eseguito=" + eseguito + ", durata=" + durata + "]";
	}
	
	public boolean equals(Task task) {
		if (task != null ) {
			if (task.titolo.equalsIgnoreCase(titolo) && task.data == data && task.durata == durata) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}
