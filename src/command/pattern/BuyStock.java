package command.pattern;

public class BuyStock implements OrderCommand {

	private Stock stock;
	
	public BuyStock(Stock abcStock) {
		this.stock = abcStock;
	}
	
	@Override
	public void execute() {
		stock.buy();
	}	
}