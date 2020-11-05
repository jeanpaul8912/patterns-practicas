package adapter.pattern;

public class CoffeTouchscreenMachine {
	
	private CoffeeMachineInterface coffeeMachineInterface;
	
	public CoffeTouchscreenMachine(CoffeeMachineInterface coffeeMachineInterface) {
		this.coffeeMachineInterface = coffeeMachineInterface;
	}
	
	public void chooseFirstSelection() {
		coffeeMachineInterface.chooseFirstSelection();
	}
	
	public void chooseSecondSelection() {
		coffeeMachineInterface.chooseSecondSelection();
	}
}