package state.pattern;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(0);
		vendingMachine.setMoney(1000);
		vendingMachine.insertDollar();
		
		VendingMachine vendingMachine1 = new VendingMachine(2);
		vendingMachine1.setCount(1);
		System.out.println("Current Status: "+vendingMachine1.getCurrentState());
		vendingMachine1.insertDollar();
		System.out.println("Current Status: "+vendingMachine1.getCurrentState());
		vendingMachine1.dispense();
		System.out.println("Current Status: "+vendingMachine1.getCurrentState());
		
		VendingMachine vendingMachine2 = new VendingMachine(2);
		vendingMachine2.setCount(1);
		System.out.println("Current Status: "+vendingMachine2.getCurrentState());
		vendingMachine2.insertDollar();
		System.out.println("Current Status: "+vendingMachine2.getCurrentState());
		vendingMachine2.ejectMoney();
		System.out.println("Current Status: "+vendingMachine2.getCurrentState());
	}

}
