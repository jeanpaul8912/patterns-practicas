package template.pattern;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Make Pasta SpaghettiMeatballs...");
		SpaghettiMeatballs spaghettiMeatballs = new SpaghettiMeatballs();
		spaghettiMeatballs.makeRecipe();
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Make Pasta PenneAlfredo...");
		PenneAlfredo penneAlfredo = new PenneAlfredo();
		penneAlfredo.makeRecipe();
	}
}