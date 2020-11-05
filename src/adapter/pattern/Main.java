package adapter.pattern;

public class Main {

	public static void main(String[] args) {
		OldCoffeMachine oldCoffeMachine = new OldCoffeMachine();
		CoffeeTouchscreenAdapter coffeeMachineAdapter = new CoffeeTouchscreenAdapter(oldCoffeMachine);
		CoffeTouchscreenMachine coffeTouchscreenMachine = new CoffeTouchscreenMachine(coffeeMachineAdapter);
		coffeTouchscreenMachine.chooseFirstSelection();
		//or
		coffeeMachineAdapter.chooseSecondSelection();
	}
}