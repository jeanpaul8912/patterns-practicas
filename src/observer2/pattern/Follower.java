package observer2.pattern;

public class Follower implements Observer {
	
	private String followerName;
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}

	@Override
	public void update(String status) {
		System.out.println("Channel current live!");
		play();
	}
	
	public void play() {
		System.out.println("Follower: "+followerName);
		System.out.println("Play resource multimedia...");
	}
}