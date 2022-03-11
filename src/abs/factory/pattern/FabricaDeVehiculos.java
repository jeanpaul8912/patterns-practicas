package abs.factory.pattern;

import abs.factory.pattern.interfaces.Vehiculo;
import abs.factory.pattern.interfaces.VehiculoDeTransporte;

public abstract class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory) {
		/** Aplicamos Polimorfismo */
		Vehiculo objetoVehiculo = factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}
}