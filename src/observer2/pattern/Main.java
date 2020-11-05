package observer2.pattern;

public class Main {

	public static void main(String args[]) {
		
		Channel channel = new Channel();
		Observer follower = new Follower("Jean Paul Villaquiran");
		Observer follower2 = new Follower2("Juan Pablo");
		channel.registerObserver(follower);
		channel.registerObserver(follower2);
		
		channel.setChannelName("Channel - Architecture!");
		channel.setStatus("Is now in live!");
		
		channel.notifyObservers();
	}
}
