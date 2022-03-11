package lazyInitialization.pattern;

import java.util.List;

public interface IFabricaCarro {
	
	Integer obtenerCantidadCarros();	
	
	List<ICarro> obtenerListaCarros();
}