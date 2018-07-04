package grupo4.FanTurWEB.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.Table;

@Entity
public class Admin extends User {
	
	@ManyToOne
	private Admin registradoPor;
	
	@OneToMany(mappedBy="registradoPor", fetch=FetchType.EAGER)
	private Set<Admin> listaAdmin;
	
	public Admin() {
		super();
	}

	public Admin(String nombre, String apellido, String user,String password, Admin registradoPor, String rol) {
		super(nombre, apellido, user, password, rol);
		this.registradoPor = registradoPor;
	}
	
	public Admin getRegistradoPor() {
		return registradoPor;
	}
	
	public void setRegistradoPor(Admin registradoPor) {
		this.registradoPor = registradoPor;
	}

	public Set<Admin> getListaAdmin() {
		return listaAdmin;
	}
	
	public void registrarAdmin(Admin newAdmin ) {
		if (this.listaAdmin == null) {
			this.listaAdmin = new HashSet<Admin>();
		}
		newAdmin.registradoPor = this;
		this.listaAdmin.add(newAdmin);	
	}
	
	public void crearPaquete() {
		
	}

	@Override
	public String toString() {
		return "Admin [getRegistradoPor()=" + getRegistradoPor() + ", getListaAdmin()=" + getListaAdmin()
				+ ", toString()=" + super.toString() + "]";
	}
	
}