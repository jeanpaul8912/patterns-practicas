package factory.pattern;

public class Factory implements IFactory {

	@Override
	public IEntity createInstance(String typeEntity) {
		
		switch (typeEntity) {
		case "entityConcret": {
			return new EntityConcret();
		}
		case "entityProduct": {
			return new EntityProduct();
		}
		default:
			throw new IllegalArgumentException("Is not posible create instance for: " + typeEntity+" in factory");
		}
	}	
}