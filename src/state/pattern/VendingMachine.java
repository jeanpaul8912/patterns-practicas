package state.pattern;

public class VendingMachine {

	private State idleState;
	private State hasOneDollarState;
	private State outOfStockState;
	
	private State currentState;
	private int count;
	private double money;
	
	public VendingMachine(int count) {
		idleState = new IdleState();
		hasOneDollarState = new HasOneDollarState();
		outOfStockState = new OutOfStockState();
				
		if(count > 0) {
			currentState = idleState;
			this.count = count;
		} else {
			currentState = outOfStockState;
			this.count = 0;
			System.out.println("State: outOfStockState");
		}
	}
	
	public void setState(State state) {
		this.currentState = state;
	}

	public State getIdleState() {
		return idleState;
	}

	public State getHasOneDollarState() {
		return hasOneDollarState;
	}

	public State getOutOfStockState() {
		return outOfStockState;
	}
	
	public void insertDollar() {
		currentState.insertDollar(this);
	}
	
	public void ejectMoney() {
		currentState.ejectMoney(this);
	}
	
	public void dispense() {
		currentState.dispense(this);
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void setMoney(double money) {
		this.money = money;
		System.out.println("Money avalaible: $"+this.money);
	}
	
	public void doReturnMoney() {
		money = 0;
		System.out.println("Money avalaible: $"+money);
	}
	
	public void doReleaseProduct() {
		System.out.println("Producto Entregado...");
	}
	
	public State getCurrentState() {
		return currentState;
	}
}