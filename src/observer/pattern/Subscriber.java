package observer.pattern;

public class Subscriber implements Observer {

	@Override
	public void update() {		
		System.out.println("Blog changed!");
	}

}
