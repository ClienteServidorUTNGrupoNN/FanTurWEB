package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Evento findById(Integer ne) {
		// TODO Auto-generated method stub
		return null;
	}


}
