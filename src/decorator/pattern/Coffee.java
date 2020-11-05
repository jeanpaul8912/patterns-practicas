package decorator.pattern;

public class Coffee implements IComponent {

	@Override
	public void flavour() {
		System.out.println("Flavour Coffee Basic!");
	}
}