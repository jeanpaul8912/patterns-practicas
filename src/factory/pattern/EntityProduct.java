package factory.pattern;

public class EntityProduct implements IEntity {

	@Override
	public String comportamientoSimilarParaVariosObjetos() {
		return "Entidad Producto creada con fabrica";
	}
}