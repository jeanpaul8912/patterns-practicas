package decorator.pattern;

public class CoffeeWithMilk extends Decorator {

	public CoffeeWithMilk(IComponent component) {
		super(component);
	}

	public void flavour() {
		super.flavour();
		System.out.println("Flavour Coffee Add Milk!");
	}
}