package template.pattern;

public class PenneAlfredo extends PastaDish {

	@Override
	protected void addPasta() {
		System.out.println("PenneAlfredo -  Add Penne");
	}

	@Override
	protected void addSauce() {
		System.out.println("PenneAlfredo -  Add Alfredo Sauce");
	}

	@Override
	protected void addProtein() {
		System.out.println("PenneAlfredo -  Add Chicken");
	}

	@Override
	protected void addGarnish() {
		System.out.println("PenneAlfredo -  Add Parsley");
	}
}