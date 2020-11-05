package observer.pattern;

public class SubscriberSpanish implements Observer {

	@Override
	public void update() {
		System.out.println("Blog changed!");
	}

}
