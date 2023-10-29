
public class ToDoList {
	private Task[] ToDo;
	
	public ToDoList(int nMax) {
		if (nMax <= 0) {
			ToDo = new Task[5];
		} else {
			ToDo = new Task[nMax];
		}
	}
	
	public int getDurataTaskGiorno(int data) {
		int ris = 0;
		for (int i=0; i<ToDo.length; i++) {
			if (ToDo[i] != null) {
				ris = ris + ToDo[i].getDurata();
			}
		}
		return ris;
	}
	
	public int getPosizioneTask(Task task) {
		if (task != null) {
			for (int i=0; i<ToDo.length; i++) {
				if (ToDo[i] != null) {
					if (ToDo[i].equals(task) ) {
						return i;
					}
				}
			}
		}
		return -1;
	}
	
	public boolean aggiungiTask(Task task) {
		if (task != null) {
			if (getDurataTaskGiorno(task.getData())+task.getDurata() <= 8 ) {
				if (getPosizioneTask(task) == -1) {
					for (int i=0; i<ToDo.length; i++) {
						if (ToDo[i] == null) {
							ToDo[i] = task;
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public boolean aggiungiTask(String titolo, int durata) {
		return aggiungiTask(new Task(titolo, durata));
	}
	
	public boolean rimuoviTask(Task task) {
		if (task != null) {
			int posizione = getPosizioneTask(task);
			if (posizione != -1) {
				ToDo[posizione] = null;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
