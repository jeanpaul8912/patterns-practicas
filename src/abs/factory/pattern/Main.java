package abs.factory.pattern;

public class Main {

	public static void main(String[] args) {
		/*
		 * Si bien el ejemplo es claro, ocurre que estoy haciendo una generalización que no deberia hacerse, es decir color y shape no
		 * son del mismo tipo porde no puedo crear una abstraccion, se recomienda crear abstracciones de tipo iguales
		 * Como consecuencia en la clase de fabrica abstract el tipo de retorno no funciona , es decir, que el color no puede retornarce
		 * como un shape y tampoco al contrario
		 */
		IColor color = FactoryProducer.createInstanceColor("Red");
		color.fill();
		
		IShape shape = FactoryProducer.createInstanceShape("Circle");
		shape.draw();
	}
}