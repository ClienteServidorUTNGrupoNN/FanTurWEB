package grupo4.FanTurWEB.controladores;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import grupo4.FanTurWEB.model.Admin;

import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;

@Named("usuarioCont")
@ViewScoped
public class AdminCont implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@EJB
	private AdminDao adminEJB;
	private int id_admin;
	private Admin administrador;
	
	@PostConstruct
	public void init() {	
		administrador = new Admin();
		id_admin = 0;
		}

	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public Admin getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Admin administrador) {
		this.administrador = administrador;
	}
	
	public String registrar() {
		try {
			adminEJB.create(administrador);
			return "succes";
		}catch(Exception e){
			throw e;
		}
	}
	
	public String eliminar() {
		try {
			
			administrador = adminEJB.findById(id_admin);			
			adminEJB.delete(administrador);
			return "succes";
			
	}
		catch(Exception e) {
			throw e;
		}
		}
}
