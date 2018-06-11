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
public class ServicioDao extends AbstractDao<Servicio, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Servicio,Integer> {

	@Override
	protected Class<Servicio> getClazz() {
		return Servicio.class;
	}

	/* Si anda bien el AbstractDAO, todo esto no hace falta
	 * Ni siquiera el persistence context, lo hereda
	@PersistenceContext(unitName = "pu1")
	EntityManager em;
	
	@Override
	public void create(Servicio servicio) {
		em.persist(servicio);
	}

	@Override
	public void update(Servicio servicio) {
		em.persist(servicio);
	}

	@Override
	public void delete(Servicio servicio) {
		em.remove(servicio);
	}

	@Override
	public Servicio findById(Integer id) {
		return em.find(Servicio.class, id);
	}

	@Override
	public List<Servicio> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Servicio> cq = cb.createQuery(Servicio.class);
		Root<Servicio> c = cq.from(Servicio.class);
		cq.select(c);
		TypedQuery<Servicio> tq = em.createQuery(cq);
		return tq.getResultList();
	}
	*/
	
}
