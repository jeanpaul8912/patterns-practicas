package decorator.pattern;

public class Main {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.flavour();
		
		System.out.println("Adiciona decorador...");
		CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffee);
		coffeeWithMilk.flavour();
		
		System.out.println("Adiciona decorador...");
		CoffeeWithVanilla coffeeWithVanilla = new CoffeeWithVanilla(coffeeWithMilk);
		coffeeWithVanilla.flavour();
	}
}