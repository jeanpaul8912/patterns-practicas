package state.pattern;

public class IdleState implements State {

	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("Dolar insertado...");		
		vendingMachine.setState(vendingMachine.getHasOneDollarState());
	}

	@Override
	public void ejectMoney(VendingMachine vendingMachine) {
		System.out.println("No money to return");		
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		System.out.println("payment required");
	}
}