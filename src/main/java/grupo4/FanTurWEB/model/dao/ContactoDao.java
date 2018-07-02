package grupo4.FanTurWEB.model.dao;

import javax.ejb.Stateless;
import grupo4.FanTurWEB.model.Contacto;

@Stateless
public class ContactoDao extends AbstractDao<Contacto, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Contacto,Integer> {

	@Override
	protected Class<Contacto> getClazz() {
		return Contacto.class;
	}
	
	@Override
	public void update(Integer id, Contacto contacto) {
		Contacto actual = this.findById(id);
		actual.setTelefono(contacto.getTelefono());
		actual.setEmail(contacto.getEmail());
		actual.setWebsite(contacto.getWebsite());
		this.update(actual);
	}

}
