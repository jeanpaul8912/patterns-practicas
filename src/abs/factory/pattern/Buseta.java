package abs.factory.pattern;

import javax.swing.JOptionPane;
import abs.factory.pattern.interfaces.Vehiculo;

public class Buseta implements Vehiculo {

	private int codigo;

	public int generarCodigo() {
		int codigoBuseta = (int) (Math.random() * 9999);
		return codigoBuseta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null, "El Codigo de la Buseta es:" + getCodigo());
	}
}