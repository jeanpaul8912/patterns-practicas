package abs.factory.pattern;

public abstract class AbstractFactory {
	
	public static IShape createInstanceShape(String typeEntity) {
		
		switch (typeEntity) {
		case "Rectangule": return new Rectangule();
		case "Circle": return new Circle();
		default:
			throw new IllegalArgumentException("Unexpected value: " + typeEntity);
		}
	}
	
	public static IColor createInstanceColor(String typeEntity) {
		
		switch (typeEntity) {
		case "Red": return new Red();
		case "Yellow": return new Yellow();
		default:
			throw new IllegalArgumentException("Unexpected value: " + typeEntity);
		}
	}
}