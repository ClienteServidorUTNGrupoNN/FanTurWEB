package grupo4.FanTurWEB.ctrl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import grupo4.FanTurWEB.model.Admin;


public abstract class Ctrl<Model> {

	protected Client client;
	protected WebTarget webTarget;
	protected Invocation invocation;
	protected Response response;
	protected Model modelObj;
	protected List<Model> modelList;
	protected int id;
	// afterChabon
	
	public Model getModelObj() {
		return modelObj;
	}
	
	public void setModelObj(Model modelObj) {
		this.modelObj = modelObj;
	}
	
	public abstract String getId(Model object);
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public List<Model> getmodelList() {
		return modelList;
	}

	public void setmodelList(List<Model> modelList) {
		this.modelList = modelList;
	}

	protected abstract Class<Model> getClase();
	
	public void get() {
		invocation = webTarget.path(String.valueOf(id)).request().buildGet();
		response = invocation.invoke();
		modelObj = response.readEntity(this.getClase());
		
	}
	
	public List<Model> getAll() {
		invocation = webTarget.request().buildGet();
		response = invocation.invoke();
		return response.readEntity(new GenericType<List<Model>>() {});
	}
	
	public void create() {
		invocation = webTarget.request().buildPost(Entity.entity(modelObj, MediaType.APPLICATION_JSON));
		response = invocation.invoke();
	}
	
	public void update(Model object) {
		invocation = webTarget.path(String.valueOf(this.getId(object))).request().buildPut(Entity.json(modelObj));
		response = invocation.invoke();
	}
	
	public void delete(int id) {
		//invocation = webTarget.path(String.valueOf(this.getId(object))).request().buildDelete();
		invocation = webTarget.path(String.valueOf(id)).request().buildDelete();
		response = invocation.invoke();
	}
}
