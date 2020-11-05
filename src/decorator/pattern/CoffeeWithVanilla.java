package decorator.pattern;

public class CoffeeWithVanilla extends Decorator {

	public CoffeeWithVanilla(IComponent component) {
		super(component);
	}

	public void flavour() {
		super.flavour();
		System.out.println("Flavour Coffee Add Vanilla!");
	}
}