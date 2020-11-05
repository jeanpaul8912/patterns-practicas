package command.pattern;

import java.util.ArrayList;
import java.util.List;

public class BrokerInvoker {
	
	private List<OrderCommand> orderList = new ArrayList<OrderCommand>();
	
	public void takeOrder(OrderCommand order) {
		orderList.add(order);
	}
	
	public void placeOrders() {	
		orderList.forEach(q -> q.execute());
	}
}