package template.pattern;

public abstract class PastaDish {

	public final void makeRecipe() {
		
		boilWater();
		addPasta();
		cookPasta();
		drainAndPlate();
		
		addSauce();
		addProtein();
		addGarnish();
	}
	
	private void boilWater() {
		System.out.println("Boil Water...");
	}
	
	private void cookPasta() {
		System.out.println("Cook Pasta...");
	}
	
	private void drainAndPlate() {
		System.out.println("Drain and Plate...");
	}
	
	protected abstract void addPasta();
	
	protected abstract void addSauce();
	
	protected abstract void addProtein();
	
	protected abstract void addGarnish();
}