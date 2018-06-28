package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

//import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Evento;


@Stateless
public class EventoDao extends AbstractDao<Evento, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.EventoDao {

	@Override
	protected Class<Evento> getClazz() {
		return Evento.class;
	}
	
	@Override
	public void update(Integer id, Evento nuevo) {
		Evento actual = this.findById(id);
		actual.setDescripcion(nuevo.getDescripcion());
		actual.setFecha(nuevo.getFecha());
		actual.setLugar(nuevo.getLugar());
		actual.setNroEnt(nuevo.getNroEnt());
		actual.setPrecio(nuevo.getPrecio());
		em.persist(actual);
	}
	
}
