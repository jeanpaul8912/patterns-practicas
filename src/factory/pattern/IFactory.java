package factory.pattern;

public interface IFactory {

	public IEntity createInstance(String typeEntity);
}