package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void unRegisterObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifica() {
		for(Observer o : observers) {
			o.update();
		}
	}
}
