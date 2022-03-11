package abs.factory.pattern;

import javax.swing.JOptionPane;
import abs.factory.pattern.interfaces.Vehiculo;
import abs.factory.pattern.interfaces.VehiculoDeTransporte;

public class FabricaBuseta implements VehiculoDeTransporte {

	@Override
	public Vehiculo crearVehiculo() {
		Buseta miBus = new Buseta();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta");
		return miBus;
	}
}
