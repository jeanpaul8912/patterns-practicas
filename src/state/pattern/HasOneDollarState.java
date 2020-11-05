package state.pattern;

public class HasOneDollarState implements State {

	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("already have one dollar");
		
		vendingMachine.doReturnMoney();
		vendingMachine.setState(vendingMachine.getIdleState());
	}

	@Override
	public void ejectMoney(VendingMachine vendingMachine) {
		System.out.println("Returning money");
		
		vendingMachine.doReturnMoney();
		vendingMachine.setState(vendingMachine.getIdleState());
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		System.out.println("releasing product");
		
		if(vendingMachine.getCount() > 1) {
			vendingMachine.doReleaseProduct();
			vendingMachine.setState(vendingMachine.getIdleState());
		} else {
			vendingMachine.doReleaseProduct();
			vendingMachine.setState(vendingMachine.getOutOfStockState());
		}
		
		vendingMachine.setState(vendingMachine.getOutOfStockState());
	}

}