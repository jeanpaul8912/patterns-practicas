package abs.factory.pattern;

import javax.swing.JOptionPane;
import abs.factory.pattern.interfaces.Vehiculo;
import abs.factory.pattern.interfaces.VehiculoDeTransporte;

public class FabricaBuses implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Bus miBus = new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus");
		return miBus;
	}
}