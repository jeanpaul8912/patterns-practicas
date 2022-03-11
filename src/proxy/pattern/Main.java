package proxy.pattern;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		IHttpClienteRest httpClienteRest = new HttpClienteRestProxy();
		
		System.out.println("Primer llamado: "+new Date());
		httpClienteRest.send();
		System.out.println("Segundo llamado: "+new Date());
		httpClienteRest.send();//cache
		System.out.println("Tercer llamado: "+new Date());
		httpClienteRest.send();//cache
	}
}