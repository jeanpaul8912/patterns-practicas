package lazyInitialization.pattern;

import java.util.ArrayList;
import java.util.List;

public class FabricaCarro {
	
	List<Carro> listaCarros = null;
	Integer cantidadCarrosACrear = 100;

	public List<Carro> crearCarros() {
		
		List<Carro> listaCarros  = new ArrayList<Carro>(cantidadCarrosACrear);
		
		for(int contador = 1; contador <= cantidadCarrosACrear; contador++) {
			listaCarros.add(new Carro("L."+contador));
		}
		
		return listaCarros;
	}
	
	public Integer obtenerCantidadCarros() {	
		
		if(listaCarros == null) {
			return 0;
		}
		
		return listaCarros.size();
	}
	
	public List<Carro> obtenerListaCarros() {
		
		if(listaCarros == null) {
			listaCarros = crearCarros();
		}
		
		return listaCarros;
	}
}