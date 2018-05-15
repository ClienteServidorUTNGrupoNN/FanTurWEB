package grupo4.FanTurWEB.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Admin extends User {
	
	@ManyToOne
	private Admin registradoPor;
	
	@OneToMany(mappedBy="registradoPor")
	private List<Admin> listaAdmin;
	
	public Admin() {
		super();
	}

	public Admin(String nombre, String apellido, String password, Admin registradoPor) {
		super(nombre,apellido,password);
		this.registradoPor = registradoPor;
	}

	public Admin getRegistradoPor() {
		return registradoPor;
	}

//	public void setRegistradoPor(Admin registradoPor) {
//		this.registradoPor = registradoPor;
//	}

	public List<Admin> getListaAdmin() {
		return listaAdmin;
	}

	/*
	public void setAdminregistradoporMi(List<Admin> adminregistradoporMi) {
		this.adminregistradoporMi = adminregistradoporMi;
	}
	*/
	
	public void registrarAdmin(Admin newAdmin ) {
		if (this.listaAdmin == null) {
			this.listaAdmin = new LinkedList<Admin>();
		}
		newAdmin.registradoPor = this;
		this.listaAdmin.add(newAdmin);
		
	}
	
	public void crearPaquete() {
		
	}

}