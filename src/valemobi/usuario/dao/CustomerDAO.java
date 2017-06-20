package valemobi.usuario.dao;

import java.util.List;

import valemobi.usuario.dao.abstractdao.GenericDAO;
import valemobi.usuario.model.CustomerVO;

public class CustomerDAO extends GenericDAO<CustomerVO> {

	private static final long serialVersionUID = 1L;

	public CustomerDAO() {
		super(CustomerVO.class);
	}

	public List<CustomerVO> consultarCustomers() {
		return super.findManyResults(CustomerVO.CONSULTAR_CUSTOMERS, null);
	}

}
