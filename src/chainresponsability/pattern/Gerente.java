package chainresponsability.pattern;

public class Gerente implements IAprobador {

	private IAprobador next;
	
	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}

	@Override
	public IAprobador getNext() {
		return next;
	}

	@Override
	public void solicitdPrestamo(int monto) {
		if(monto > 50000 && monto <= 100000) {
			System.out.println("Lo manejo yo, el gerente");
		} else {
			next.solicitdPrestamo(monto);
		}
	}
}
