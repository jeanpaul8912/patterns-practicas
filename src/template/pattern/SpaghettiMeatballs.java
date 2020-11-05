package template.pattern;

public class SpaghettiMeatballs extends PastaDish {

	@Override
	protected void addPasta() {
		System.out.println("SpaghettiMeatballs -  Add Spaghetti");
	}

	@Override
	protected void addSauce() {
		System.out.println("SpaghettiMeatballs -  Add Tomato Sauce");
	}

	@Override
	protected void addProtein() {
		System.out.println("SpaghettiMeatballs -  Add Meatballs");
	}

	@Override
	protected void addGarnish() {
		System.out.println("SpaghettiMeatballs -  Add Parmesan Cheese");
	}
}