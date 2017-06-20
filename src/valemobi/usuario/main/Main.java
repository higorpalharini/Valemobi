package valemobi.usuario.main;

import valemobi.usuario.controller.CustomerController;
import valemobi.usuario.model.CustomerVO;

public class Main {
	public static void main(String[] args) {
		CustomerController controller = CustomerController.getInstance();
		
		// Salvando os Customers.
		CustomerVO customerX = new CustomerVO(null, "420.883.018.28", "Higor Palharini", true, 700.0);
		controller.salvar(customerX);
		CustomerVO customerY = new CustomerVO(null, "123.123.123-12", "Joao da Silva", true, 760.0);
		controller.salvar(customerY);
		
		// Realizando a media e listando os customers.
		controller.realizarMedia();
	}
}
