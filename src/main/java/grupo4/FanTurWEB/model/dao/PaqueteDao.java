package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Paquete;

@Stateless
public class PaqueteDao extends AbstractDao<Paquete, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.PaqueteDao {

	@Override
	protected Class<Paquete> getClazz() {
		return Paquete.class;
	}

	@Override
	public void update(Integer id, Paquete nuevo) {
		Paquete actual = this.findById(id);
		actual.setAlojamiento(nuevo.getAlojamiento());
		actual.setCantidad(nuevo.getCantidad());
		actual.setEventos(nuevo.getEventos());
		actual.setPasajes(nuevo.getPasajes());
		actual.setPrecio(nuevo.getPrecio());
		em.persist(actual);
	}
		
}
