package factory.pattern;

interface Car {

}

class CarFactory {

	static public Car create(String s) {
		switch (s) {
		default:
		case "us":
		case "american":
			return new Chrysler();		
		case "de":
		case "german": 
			return new Mercedes();
		case "jp":
		case "japanese": 
			return new Mazda();	
		}
	}
}

class Chrysler implements Car {
	public String toString() {
		return "Chrysler";
	}
}

class Mazda implements Car {
	public String toString() {
		return "Mazda";
	}
}

class Mercedes implements Car {
	public String toString() {
		return "Mercedes";
	}
}

public class CarEx {
	public static void main(String args[]) {
		Car car = CarFactory.create("jp");
		System.out.println(car);
	}
}