package observer.pattern;

public class Main {

	public static void main(String[] args) {
		Blog blog = new Blog();
		Subscriber subscriber = new Subscriber();
		SubscriberSpanish subscriberSpanish = new SubscriberSpanish();
		blog.registerObserver(subscriber);
		blog.registerObserver(subscriberSpanish);
		
		blog.notifica();
	}

}