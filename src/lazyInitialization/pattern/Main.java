package lazyInitialization.pattern;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FabricaCarro fabricaCarro = new FabricaCarro();		
		Scanner entrada = new Scanner(System.in);
		int bandera = 0;
		
		System.out.println("Ingrese la opción que requiere:");
		
		while (bandera != -1) {			
			System.out.println("\n1. Consultar lista de lotes\n2. Mostrar cantidad carros\n3. Otra");
			bandera = entrada.nextInt();
			
			if(bandera == 1) {
				List<Carro> listaCarros = fabricaCarro.obtenerListaCarros();
				for (Carro carro : listaCarros) {
					System.out.println("Lote carro: ["+carro.lote+"]");
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