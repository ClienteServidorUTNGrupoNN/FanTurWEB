package grupo4.FanTurWEB.controladores;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

import grupo4.FanTurWEB.model.Admin;

import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;

@Named("usuarioCont")
@ViewScoped
public class AdminCont implements Serializable {
	
	private Client cliente;
	private WebTarget target; 
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private AdminDao adminEJB;
	private String id_admin;
	private Admin administrador;
	private Invocation invocation;
	private Response response;
	
	@PostConstruct
	public void init() {	
		administrador = new Admin();
		cliente = ClientBuilder.newClient();
		target = cliente.target("http://localhost:8080/FanTurWEB/rest/admin");
		}


	public Invocation getInvocation() {
		return invocation;
	}

	public void setInvocation(Invocation invocation) {
		this.invocation = invocation;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
	public String getId_admin() {
		return id_admin;
	}

	public void setId_admin(String id_admin) {
		this.id_admin = id_admin;
	}

	public Admin getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Admin administrador) {
		this.administrador = administrador;
	}
	
	//Registrar Administrador
	public String registrar() {
			invocation = target.request().buildPost(Entity.entity(administrador, MediaType.APPLICATION_JSON));
			response = invocation.invoke();	
			return "succes";
	}
	
	//Eliminar administrador
	public String eliminar() {
			invocation = target.path(id_admin).request().buildDelete();
			response = invocation.invoke();		
			return "succes";
	}
	
		

}
