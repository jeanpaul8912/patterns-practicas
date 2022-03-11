package lazyInitialization.pattern;

public abstract class Carro implements ICarro {
	
	private String modelo;
	private String marca;
	private int anioFabricacion;
	private int cantidadPuertas;
	private String color;
	private String lote;
	
	public Carro() {}
		
	public Carro(String modelo, String marca, int anioFabricacion, int cantidadPuertas, String color, String lote) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.cantidadPuertas = cantidadPuertas;
		this.color = color;
		this.lote = lote;
	}
	
	@Override
	public String getModelo() {
		return modelo;
	}

	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String getMarca() {
		return marca;
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	@Override
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	@Override
	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	@Override
	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}	

	@Override
	public String getLote() {
		return lote;
	}

	@Override
	public void setLote(String lote) {
		this.lote = lote;
	}

	@Override
	public void frenar() {
		System.out.println("Frenando...");		
	}

	@Override
	public void girar() {
		System.out.println("Girando...");		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando...");	
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion
				+ ", cantidadPuertas=" + cantidadPuertas + ", color=" + color + ", lote=" + lote + "]";
	}	 
}