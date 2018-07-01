package grupo4.FanTurWEB.ctrl;

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
import grupo4.FanTurWEB.model.Ubicacion;
import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;

@Named()
@ViewScoped
public class AdminCtrl extends Ctrl<Admin> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	private void init() {
		modelObj =  new Admin();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/admin");
		afterCreate = "";
	}	

}
