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
	
	/*
	@PersistenceContext(unitName= "pu1")
	private EntityManager em;
	
	@Override
	public void create(Evento evento) {
		em.persist(evento);
	}
	
	@Override
	public void update(Evento evento) {
		em.persist(evento);
	}
	
	@Override
	public void delete(Evento evento) {
		em.remove(evento);
	}
	
	@Override
	public Evento findById(int id) {
		return em.find(Evento.class, id);
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
	*/

}
