package observer2.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Observer> listObservers;
	private String channelName;
	private String status;
	
	public Channel() {
		listObservers = new ArrayList<Observer>();
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public void notifyObservers() {
		System.out.println(this.channelName);
		this.listObservers.forEach(q -> q.update(status));
	}

	@Override
	public void registerObserver(Observer observer) {
		this.listObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.listObservers.remove(observer);
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}