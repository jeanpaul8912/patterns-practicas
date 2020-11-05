package command.pattern;

public class CommandPatternDemo {
	public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      OrderCommand buyStockOrder = new BuyStock(abcStock);
	      OrderCommand sellStockOrder = new SellStock(abcStock);

	      BrokerInvoker broker = new BrokerInvoker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }	
}