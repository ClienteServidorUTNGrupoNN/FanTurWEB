package grupo4.FanTurWEB.ws;

import javax.ws.rs.Path;

import grupo4.FanTurWEB.model.Admin;

@Path("admin")
public class AdminWS extends RESTfulAPI<Admin>{

	@Override
	protected String getModelId(Admin admin) {
		return String.valueOf(admin.getId());
	}

}
