package lazyInitialization.pattern;

public class Camion extends Carro {

	public Camion() {
		super();
	}

	public Camion(String modelo, String marca, int anioFabricacion, int cantidadPuertas, String color, String lote) {
		super(modelo, marca, anioFabricacion, cantidadPuertas, color, lote);
	}
	
	public void dobleTroque() {
		
	}
}