package lazyInitialization.pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FabricaCarro implements IFabricaCarro {

	private List<ICarro> listaCarros = null;
	private Integer cantidadCarrosACrear = 100;

	private void crearCarros() {
		try {
			listaCarros = new ArrayList<ICarro>(cantidadCarrosACrear);
			Thread.sleep(5000);

			for (int contador = 1; contador <= cantidadCarrosACrear; contador++) {
				ICarro carro;

				if (contador % 2 == 0) {
					carro = new Camion("Wagon", "GMC", 2021, 3, "Blanco", "" + new Date() + contador);
				} else {
					carro = new Automovil("CX5", "mazda", 2021, 5, "Negro", "" + new Date() + contador);
				}

				listaCarros.add(carro);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Integer obtenerCantidadCarros() {

		if (listaCarros == null) {
			return 0;
		}

		return listaCarros.size();
	}

	public List<ICarro> obtenerListaCarros() {

		if (listaCarros == null) {
			crearCarros();
		}

		return listaCarros;
	}
}