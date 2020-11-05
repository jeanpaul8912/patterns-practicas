package adapter.pattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeMachine oldVendingMachine; 
	
	public CoffeeTouchscreenAdapter(OldCoffeMachine oldCoffeMachine) {
		oldVendingMachine = oldCoffeMachine;
	}

	@Override
	public void chooseFirstSelection() {
		oldVendingMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldVendingMachine.selectB();
	}
}