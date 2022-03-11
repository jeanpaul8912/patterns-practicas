package lazyInitialization.pattern;

public interface ICarro {

	String getModelo();

	void setModelo(String modelo);

	String getMarca();

	void setMarca(String marca);

	int getAnioFabricacion();

	void setAnioFabricacion(int anioFabricacion);

	int getCantidadPuertas();

	void setCantidadPuertas(int cantidadPuertas);

	String getColor();

	void setColor(String color);

	String getLote();

	void setLote(String lote);

	void frenar();

	void girar();

	void acelerar();

	String toString();
}