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
import grupo4.FanTurWEB.model.Hotel;

@Stateless
public class HotelDao implements grupo4.FanTurWEB.model.dao.interfaces.HotelDao {
	
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Hotel h) {
	em.persist(h);
	}
	
	@Override
	public void delete(Hotel h) {
	em.remove(h);
	}
	
	@Override
	public void update(Hotel h) {
		em.persist(h);
	}
	
	@Override
	public Hotel findById(Integer id) {
		em.find(Hotel.class, id);
		return null;
	}
	
	@Override
	public List<Hotel> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Hotel> cq = cb.createQuery(Hotel.class);
		Root<Hotel> a = cq.from(Hotel.class);
		cq.select(a);
		TypedQuery<Hotel> tq = em.createQuery(cq);
		
		return tq.getResultList();
	}
}
