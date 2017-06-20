package valemobi.usuario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name="tb_customer_account")
@NamedQueries(
		value = {
				@NamedQuery(name="CustomerVO.consultarCustomers", query="SELECT c FROM CustomerVO c WHERE c.vlTotal > 560 AND c.idCustomer BETWEEN 1 AND 2700 ORDER BY c.vlTotal DESC"),
		}
)
public class CustomerVO implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String CONSULTAR_CUSTOMERS = "CustomerVO.consultarCustomers";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id_customer")
	private Integer idCustomer;
	
	@Column(name="cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name="nm_customer")
	private String nmCustomer;
	
	@Column(name="is_active")
	private Boolean active;
	
	@Column(name="vl_total")
	private Double vlTotal;
	
	public CustomerVO(){}

	public CustomerVO(Integer idCustomer, String cpfCnpj, String nmCustomer, Boolean active, Double vlTotal) {
		super();
		this.idCustomer = idCustomer;
		this.cpfCnpj = cpfCnpj;
		this.nmCustomer = nmCustomer;
		this.active = active;
		this.vlTotal = vlTotal;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNmCustomer() {
		return nmCustomer;
	}

	public void setNmCustomer(String nmCustomer) {
		this.nmCustomer = nmCustomer;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}

	@Override
	public String toString() {
		return "CustomerVO [idCustomer=" + idCustomer + ", cpfCnpj=" + cpfCnpj + ", nmCustomer=" + nmCustomer
				+ ", active=" + active + ", vlTotal=" + vlTotal + "]";
	}
	
}