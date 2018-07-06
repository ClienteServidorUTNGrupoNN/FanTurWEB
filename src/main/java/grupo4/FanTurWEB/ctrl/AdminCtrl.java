package grupo4.FanTurWEB.ctrl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;

@Named
@ViewScoped
public class AdminCtrl extends Ctrl<Admin> implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(AdminCtrl.class);

	@EJB
	private AdminDao adminEJB;

	@PostConstruct
	private void init() {
		modelObj = new Admin();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/admin");
		modelList = this.getAll();
		id = 1;
	}

	@Override
	protected Class<Admin> getClase() {
		return Admin.class;
	}

	@Override
	public String getId(Admin admin) {
		return String.valueOf(admin.getId());
	}

	// public String crear() {
	// logger.info("Se llama a crear()");
	//
	// //ESTO DA ERROR DE STACK OVERFLOW
	//
	// String nombre =
	// FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal().getName();
	//
	// logger.info("lo que devuelve getUserPrincipal().getName(): " + nombre);
	//
	// List<Admin> listaAdminEnSesion = adminEJB.findByUser(nombre);
	//
	// Admin adminEnSesion = listaAdminEnSesion.get(0);
	//
	// logger.info("Se va a setear en el campo registradoPor: " + adminEnSesion);
	//
	//
	// //ESTO SI ES LO QUE DA BUCLE INFINITO.. POSTA..
	// modelObj.setRegistradoPor(adminEnSesion);
	//
	// modelObj.setRol("ADMINISTRATOR");
	//
	// logger.info("Se seteó el admin en sesión..");
	//
	// invocation = webTarget.request().buildPost(Entity.entity(modelObj,
	// MediaType.APPLICATION_JSON));
	// response = invocation.invoke();
	//
	//
	//
	// return "/admin/indexAdmin.xhtml";
	//
	// }

	// Tuto's stuff
	public Admin getByUser(String user) {
		invocation = webTarget.path(user).request().buildGet();
		response = invocation.invoke();
		modelObj = response.readEntity(Admin.class);
		return modelObj;
	
	}
	
	// Tuto's stuff
	public String crear() {
//		String nombre = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal().getName();
//		Admin adminEnSesion = this.getByUser(nombre);
//		modelObj.setRegistradoPor(adminEnSesion);
		id = 1;
//		modelObj.setRegistradoPor(this.get());
		
		Admin temp = this.get();
		logger.info("lo que devuelve this.get(): " + temp);
		
		modelObj.setRol("ADMINISTRATOR");
		create();
		return "/admin/indexAdmin.xhtml";
	}

}
