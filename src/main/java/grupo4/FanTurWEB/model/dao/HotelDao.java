package grupo4.FanTurWEB.model.dao;

import javax.ejb.Stateless;
import grupo4.FanTurWEB.model.Hotel;

@Stateless
public class HotelDao extends AbstractDao<Hotel, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.HotelDao {

	@Override
	protected Class<Hotel> getClazz() {
		return Hotel.class;
	}
	
	@Override
	public void update(Integer id, Hotel nuevo) {
		Hotel actual = this.findById(id);
		actual.setAloj(nuevo.getAloj());
		actual.setContacto(nuevo.getContacto());
		actual.setNombre(nuevo.getNombre());
		actual.setUbicacion(nuevo.getUbicacion());
		this.update(actual);
	}
	
}
