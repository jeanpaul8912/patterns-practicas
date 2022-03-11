package lazyInitialization.pattern;

public class Automovil extends Carro {
	
	

	public Automovil(String modelo, String marca, int anioFabricacion, int cantidadPuertas, String color, String lote) {
		super(modelo, marca, anioFabricacion, cantidadPuertas, color, lote);
	}

	public void baul() {}
}
