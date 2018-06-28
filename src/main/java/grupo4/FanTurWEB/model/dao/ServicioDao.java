package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Servicio;

@Stateless
public class ServicioDao extends AbstractDao<Servicio, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.ServicioDao {

	@Override
	protected Class<Servicio> getClazz() {
		return Servicio.class;
	}

	@Override
	public void update(Integer id, Servicio nuevo) {
		Servicio actual = this.findById(id);
		actual.setDetalle(nuevo.getDetalle());
		em.persist(actual);
	}
	
}
