package abs.factory.pattern;

import javax.swing.JOptionPane;
import abs.factory.pattern.interfaces.Vehiculo;
import abs.factory.pattern.interfaces.VehiculoDeTransporte;

public class FabricaTaxis implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Taxi miBus = new Taxi();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Taxi");
		return miBus;
	}
}