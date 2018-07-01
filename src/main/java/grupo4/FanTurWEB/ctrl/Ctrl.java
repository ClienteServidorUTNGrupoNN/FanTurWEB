package grupo4.FanTurWEB.ctrl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public abstract class Ctrl<Model> {

	protected Client client;
	protected WebTarget webTarget;
	protected Invocation invocation;
	protected Response response;
	protected Model modelObj;
	protected String id;
	protected String afterCreate;
	protected String afterUpdate;
	protected String afterDelete;
	// afterChabon
	
	public Model getModelObj() {
		return modelObj;
	}
	
	public void setModelObj(Model modelObj) {
		this.modelObj = modelObj;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String get() {
		invocation = webTarget.path(id).request().buildGet();
		response = invocation.invoke();
		return "este";
	}
	
	public String getAll() {
		invocation = webTarget.request().buildGet();
		response = invocation.invoke();
		return "todos";
	}
	
	public String create() {
		invocation = webTarget.request().buildPost(Entity.entity(modelObj, MediaType.APPLICATION_JSON));
		response = invocation.invoke();
		return afterCreate;
	}
	
	public String update() {
		invocation = webTarget.request().buildPut(Entity.entity(modelObj, MediaType.APPLICATION_JSON));
		response = invocation.invoke();
		return afterUpdate;
	}
	
	public String delete() {
		invocation = webTarget.path(id).request().buildDelete();
		response = invocation.invoke();
		return afterDelete;
	}
}
