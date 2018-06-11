package grupo4.FanTurWEB.model.dao;

//import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Alojamiento;


@Stateless
public class AlojamientoDao extends AbstractDao<Alojamiento, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Alojamiento,Integer> {

	/* Si anda bien el AbstractDAO, todo esto no hace falta
	 * Ni siquiera el persistence context, lo hereda
	 * 
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Alojamiento a) {
		em.persist(a);
	}
	
	@Override
	public void delete(Alojamiento a) {
		em.remove(a);
	}

	@Override
	public void update(Alojamiento a) {
		em.persist(a);
	}
	
	@Override
	public Alojamiento findById(Integer id) {
		return em.find(Alojamiento.class, id);
	}

	@Override
	public List<Alojamiento> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Alojamiento> cq = cb.createQuery(Alojamiento.class);
		Root<Alojamiento> a = cq.from(Alojamiento.class);
		cq.select(a);
		TypedQuery<Alojamiento> tq = em.createQuery(cq);
		
		return tq.getResultList();
	}
	*/	
	
	@Override
	protected Class<Alojamiento> getClazz() {
		return Alojamiento.class;
	}
}
