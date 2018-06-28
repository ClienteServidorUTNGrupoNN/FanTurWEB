package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import grupo4.FanTurWEB.model.Pasaje;


@Stateless
public class PasajeDao extends AbstractDao<Pasaje, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.PasajeDao {

	@Override
	protected Class<Pasaje> getClazz() {
		return Pasaje.class;
	}

	@Override
	public void update(Integer id, Pasaje nuevo) {
		Pasaje actual = this.findById(id);
		actual.setAsiento(nuevo.getAsiento());
		actual.setDestino(nuevo.getDestino());
		actual.setIda(nuevo.getIda());
		actual.setIdaLlegada(nuevo.getIdaLlegada());
		actual.setVuelta(nuevo.getVuelta());
		actual.setVueltaLlegada(nuevo.getVueltaLlegada());
		actual.setOrigen(nuevo.getOrigen());
		actual.setPaquete(nuevo.getPaquete());
		actual.setPrecio(nuevo.getPrecio());
		actual.setServicio(nuevo.getServicio());
		actual.setVehiculo(nuevo.getVehiculo());
		em.persist(actual);
	}
	
}
