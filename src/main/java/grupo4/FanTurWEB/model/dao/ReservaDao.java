package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Reserva;


@Stateless
public class ReservaDao implements  grupo4.FanTurWEB.model.dao.interfaces.Dao<Reserva,Integer> {
	
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Reserva r) {
		em.persist(r);
	}
	
	@Override
	public void update(Reserva r) {
		em.persist(r);
	}

	@Override
	public void delete(Reserva r) {
		em.remove(r);
	}
	
	@Override
	public Reserva findById(Integer id) {
		return em.find(Reserva.class, id);
	}

	@Override
	public List<Reserva> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
