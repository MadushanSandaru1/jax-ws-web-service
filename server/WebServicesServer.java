package server;

import javax.xml.ws.Endpoint;

public class WebServicesServer {

	public static void main(String[] args) {
		String bindingURI = "http://localhost:9898/WebServices";
		WebServices webServices = new WebServices();
		Endpoint.publish(bindingURI, webServices);
		System.out.println("Server started at: " + bindingURI);
	}

}