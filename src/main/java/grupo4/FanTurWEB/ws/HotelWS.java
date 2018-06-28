package grupo4.FanTurWEB.ws;

import javax.ws.rs.Path;

import grupo4.FanTurWEB.model.Hotel;

@Path("hoteles")
public class HotelWS extends RESTfulAPI<Hotel> {

	@Override
	protected String getModelId(Hotel hotel) {
		return String.valueOf(hotel.getId());
	}

}
