package mvc.pattern;

import java.util.Observable;

public class Model extends Observable  {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
		setChanged();
		notifyObservers();
	}
}