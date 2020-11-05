package composite.pattern;

public class Song implements IComponent {
	
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void play() {
		System.out.println("playlist playback..."+" song name: "+songName+" artisti: "+artist+" speed: "+speed);		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;		
	}

	@Override
	public String getName() {
		return songName;
	}
	
	// Your code goes here!
	public String getArtist() {
		return artist;
	}
	
}