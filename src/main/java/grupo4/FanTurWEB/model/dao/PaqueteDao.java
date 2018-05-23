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
public class PaqueteDao implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Paquete,Integer> {

	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Paquete p) {
		em.persist(p);
	}
	
	@Override
	public void update(Paquete p) {
		em.persist(p);
	}
	
	@Override
	public void delete(Paquete p){
		em.remove(p);
	}
	
	@Override
	public Paquete findById(Integer id) {
		return em.find(Paquete.class, id);
	}

	@Override
	public List<Paquete> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Paquete> cq = cb.createQuery(Paquete.class);
		Root<Paquete> a = cq.from(Paquete.class);
		cq.select(a);
		TypedQuery<Paquete> tq = em.createQuery(cq);
		
		return tq.getResultList();
	}
	
}
