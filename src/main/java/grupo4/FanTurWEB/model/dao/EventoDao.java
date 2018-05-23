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
public class EventoDao implements grupo4.FanTurWEB.model.dao.interfaces.EventoDao {
	
	@PersistenceContext(unitName= "pu1")
	private EntityManager em;
	
	@Override
	public void create(Evento e) {
		
		em.persist(e);
	}
	
	@Override
	public void delete(Evento e) {
		em.remove(e);
	}
	
	@Override
	public void update(Evento e) {
		em.persist(e);
	}
	
	@Override
	public Evento encontrarEvento(int ne) {
		
		return em.find(Evento.class, ne);
		
	}
	
	@Override
	public List<Evento> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
		Root<Evento> a = cq.from(Evento.class);
		cq.select(a);
		TypedQuery<Evento> tq = em.createQuery(cq);
		
		return tq.getResultList();
	}
	
	@Override
	public Evento findById(Integer id) {
		em.find(Evento.class, id);
		return null;
	}


}
