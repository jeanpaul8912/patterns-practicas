package lazyInitialization.pattern;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<ICarro> listaCarros;
		IFabricaCarro fabricaCarro = new FabricaCarro();		
		Scanner entrada = new Scanner(System.in);
		int bandera = 0;
			
		System.out.println("Cargando...");	
		//La siguiente linea es para simular la latencia
		//listaCarros = fabricaCarro.obtenerListaCarros();			
		
		System.out.println("Ingrese la opción que requiere:");
		
		while (bandera != -1) {			
			System.out.println("\n1. Consultar lista de lotes\n2. Mostrar cantidad carros\n4. Crear carro\n3. Otra");
			bandera = entrada.nextInt();
			
			if(bandera == 1) {
				listaCarros = fabricaCarro.obtenerListaCarros();
				for (ICarro carro : listaCarros) {
					System.out.println("Lote carro: ["+carro.toString()+"]");
				}
			} else if (bandera == 2) {
				int cantidadCarros = fabricaCarro.obtenerCantidadCarros();
				System.out.println("\nCantidad total de carros: "+cantidadCarros);
			} else {
				bandera = -1;
			}
		}	
		
		System.out.println("Fin!");
		entrada.close();
	}
}