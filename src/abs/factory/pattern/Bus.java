package abs.factory.pattern;

import javax.swing.JOptionPane;
import abs.factory.pattern.interfaces.Vehiculo;

public class Bus implements Vehiculo {
	private int codigo;

	public int generarCodigo() {
		int codigoBus = (int) (Math.random() * 9999);
		return codigoBus;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null, "El Codigo del Bus es : " + getCodigo());
	}
}