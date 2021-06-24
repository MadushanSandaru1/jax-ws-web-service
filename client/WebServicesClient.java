package client;

public class WebServicesClient {

	public static void main(String[] args) {
		WebServicesService client = new WebServicesService();
		WebServices WebServices = client.getWebServicesPort();
		String hash = WebServices.message("admin");
		System.out.println(hash);
	}

}