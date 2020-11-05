package factory.pattern;

public class EntityConcret implements IEntity {

	@Override
	public String comportamientoSimilarParaVariosObjetos() {
		return "Entidad concreta creada con fabrica";
	}	
}