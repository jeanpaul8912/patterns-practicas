package chainresponsability.pattern;

public interface IAprobador {

	public void setNext(IAprobador aprobador);
	
	public IAprobador getNext();
	
	public void solicitdPrestamo(int monto);
}