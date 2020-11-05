package decorator.pattern;

public abstract class Decorator implements IComponent {
	
	private final IComponent component;
	
	public Decorator(IComponent component) {
		this.component = component;
	}
	
	public void flavour() {
		this.component.flavour();
	}
}