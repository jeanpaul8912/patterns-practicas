package proxy.pattern;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClienteRest implements IHttpClienteRest {
	
	private String response;

	public void send() {
		
		 HttpClient client = HttpClient.newHttpClient();
	     HttpRequest request = HttpRequest.newBuilder()
	           .uri(URI.create("https://jsonplaceholder.typicode.com/photos"))
	           .GET()
	           .build();
	     
	    HttpResponse<String> respuesta;
	     
		try {
			respuesta = client.send(request, BodyHandlers.ofString());
			this.response = respuesta.body();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getResponse() {
		return this.response;
	}
}