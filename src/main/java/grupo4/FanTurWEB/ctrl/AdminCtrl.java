package grupo4.FanTurWEB.ctrl;

import java.io.Serializable;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import grupo4.FanTurWEB.controladores.LoginCont;
import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Ubicacion;
import grupo4.FanTurWEB.model.User;
import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;

@Named()
@ViewScoped
public class AdminCtrl extends Ctrl<Admin> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = Logger.getLogger(AdminCtrl.class);
	
	@EJB
	private AdminDao adminEJB;
	
	@PostConstruct
	private void init() {
		modelObj =  new Admin();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/admin");
		afterCreate = "indexAdmin.xhtml";
		afterUpdate = "indexAdmin.xhtml";
		afterDelete =  "indexAdmin.xhtml";
		//agrego esta lista para poder mostrar en la tabla, cualqier cosa, a la bosta
		administradores2 = new HashSet<Admin>();
		administradores = new HashSet<Admin>();
		administradores = this.getAll();
		modelObj.setRol("ADMINISTRATOR");
	}	
	
	//Esto hago para poder gestionar los admin con la vista que cree aca
	
	private int idAdm; 
	private Set<Admin> administradores2;
	private Set<Admin> administradores;
	
	public int getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(int idAdm) {
		this.idAdm = idAdm;
	}
	
	public void empezarGestion(Admin adm) {
		modelObj = adm;
	}
	
	public void buscarAdmin() {		
		id = String.valueOf(idAdm);
		Response response = this.get();
		modelObj = response.readEntity(Admin.class);
		administradores2.add(modelObj);
	}
	
	public String modificar() {
		id= String.valueOf(modelObj.getId());
		return this.update();		
	}
	
	public String eliminarAdmin() {
		id = String.valueOf(modelObj.getId());
		return this.delete();
	}

	public Set<Admin> getAdministradores2() {
		return administradores2;
	}

	public void setAdministradores2(Set<Admin> administradores2) {
		this.administradores2 = administradores2;
	}

	public Set<Admin> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(Set<Admin> administradores) {
		this.administradores = administradores;
	}
	
	
//	public String crear() {
//		Admin adminEnSesion = loginBean.obtenerAdminSesion();
//		modelObj.setRegistradoPor(adminEnSesion);
//		String redireccion = this.create();
//		return redireccion;
//		
//	}
	
	
	
	
	
	
	//DESPUES DE HORAS DE PROBAR, LO QUE DA ERROR ES QUE CUANDO UN ADMIN REGISTRO A OTRO ADMIN, NO PUEDE VOLVER A HACERLO PORQUE 
	//PARECE QUE EL JSON QUE GENERA ES INFINITO Y DEVUELVE STACK OVERFLOW.. 
	public String crear() {
		logger.info("Se llama a crear()");
		
		//ESTO DA ERROR DE STACK OVERFLOW
		
		String nombre = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal().getName();
		
		
		List<Admin> listaAdminEnSesion = adminEJB.findByUser(nombre);
		
		Admin adminEnSesion = listaAdminEnSesion.get(0);
		
		 
		//ESTO SI ES LO QUE DA BUCLE INFINITO.. POSTA..
		modelObj.setRegistradoPor(adminEnSesion);
		
		invocation = webTarget.request().buildPost(Entity.entity(modelObj, MediaType.APPLICATION_JSON));
		response = invocation.invoke();
		
		logger.info("lo que devuelve getUserPrincipal().getName(): " + nombre);
		
		//ESTO PARECE QUE ES LO QUE DA EL BUCLE INFINITO.. LPM
		//logger.info("Administrador seteado a registradoPor: " + adminEnSesion);
		
		return afterCreate;
	}
	
	
}
