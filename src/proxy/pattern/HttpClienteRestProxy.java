package proxy.pattern;

public class HttpClienteRestProxy implements IHttpClienteRest {
	
	private IHttpClienteRest httpClienteRest;
	private String response;

	@Override
	public void send() {
		
		if (httpClienteRest == null || httpClienteRest.getResponse().isBlank()) {
			this.httpClienteRest = new HttpClienteRest();
			httpClienteRest.send();
		}
		
		this.response = httpClienteRest.getResponse();
	}

	@Override
	public String getResponse() {
		return response;
	}
}