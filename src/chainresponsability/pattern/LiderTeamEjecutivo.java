package chainresponsability.pattern;

public class LiderTeamEjecutivo implements IAprobador {

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
		if(monto > 10000 && monto <= 50000) {
			System.out.println("Lo manejo yo, el lider");
		} else {
			next.solicitdPrestamo(monto);
		}
	}
}
