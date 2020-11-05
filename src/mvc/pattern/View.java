package mvc.pattern;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
	
	private Controller controller;
	
	public void display(String name) {
		System.out.println("display new name: "+ name);
	}
	
	public void changeName(String newName) {
		controller.changeName(newName);
	}

	@Override
	public void update(Observable o, Object arg) {
		display(((Model) o).getName());		
	}
}