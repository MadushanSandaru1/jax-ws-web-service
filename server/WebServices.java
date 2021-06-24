package server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebServices {
	@WebMethod
	public String message(String name) {
		return "Hello "+name;
	}
}