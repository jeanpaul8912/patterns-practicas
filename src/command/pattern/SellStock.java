package command.pattern;

public class SellStock implements OrderCommand {

	private Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	public void execute() {
		stock.sell();
	}
}