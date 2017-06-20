package valemobi.usuario.controller;

import java.util.ArrayList;
import java.util.List;

import valemobi.usuario.dao.CustomerDAO;
import valemobi.usuario.model.CustomerVO;

public class CustomerController {

	private static CustomerController instance;

	// Singleton
	public static CustomerController getInstance() {
		if (instance == null) {
			instance = new CustomerController();
		}

		return instance;
	}
	
	public void salvar(CustomerVO customer){
		CustomerDAO dao = new CustomerDAO();
		dao.beginTransaction();
		dao.save(customer);
		dao.commitAndCloseTransaction();
	}

	public void realizarMedia() {
		CustomerDAO dao = new CustomerDAO();

		List<CustomerVO> customers = new ArrayList<CustomerVO>();
		try {
			dao.beginTransaction();
			customers = (ArrayList<CustomerVO>) dao.consultarCustomers();
			dao.closeTransaction();

			Double soma = 0.0;
			for (CustomerVO customerVO : customers) {
				soma = soma + customerVO.getVlTotal();
			}
			
			System.out.println("======================================");
			System.out.println("Média: " + soma / customers.size());
			System.out.println("======================================");
			
			System.out.println("Customers ordernados do maior para o menor");
			for (CustomerVO customerVO : customers) {
				System.out.println(customerVO);
			}
			System.out.println("======================================");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}
}
