package chainresponsability.pattern;

public class Banco implements IAprobador {

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
		EjecutivoDeCuenta ejecutivoDeCuenta = new EjecutivoDeCuenta();
		this.setNext(ejecutivoDeCuenta);
		
		LiderTeamEjecutivo liderTeamEjecutivo = new LiderTeamEjecutivo();
		ejecutivoDeCuenta.setNext(liderTeamEjecutivo);
		
		Gerente gerente = new Gerente();
		liderTeamEjecutivo.setNext(gerente);
		
		Director director = new Director();
		gerente.setNext(director);
		
		next.solicitdPrestamo(monto);
	}
}