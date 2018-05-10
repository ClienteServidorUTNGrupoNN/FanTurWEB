package grupo4.FanTurWEB.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="admin",schema="fantur")
public class Admin extends User {
	
	@Column(name = "registradoPor")
	private int registradoPor;
	
	@OneToMany(mappedBy="registradoPor")
	private List<Admin> adminregistradoporMi;
	
	public Admin() {super();}

	public Admin(String nombre,String apellido,String password,int registradoPor, List<Admin> adminregistradoporMi) {
		super(nombre,apellido,password);
		this.registradoPor = registradoPor;
		this.adminregistradoporMi = adminregistradoporMi;
	}

	public int getRegistradoPor() {
		return registradoPor;
	}

	public void setRegistradoPor(int registradoPor) {
		this.registradoPor = registradoPor;
	}

	public List<Admin> getAdminregistradoporMi() {
		return adminregistradoporMi;
	}

	public void setAdminregistradoporMi(List<Admin> adminregistradoporMi) {
		this.adminregistradoporMi = adminregistradoporMi;
	}

	
	
}
