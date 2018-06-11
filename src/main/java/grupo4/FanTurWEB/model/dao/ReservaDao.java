package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Reserva;


@Stateless
public class ReservaDao extends AbstractDao<Reserva, Integer>implements  grupo4.FanTurWEB.model.dao.interfaces.Dao<Reserva,Integer> {

	@Override
	protected Class<Reserva> getClazz() {
		return Reserva.class;
	}
	
	/* Si anda bien el AbstractDAO, todo esto no hace falta
	 * Ni siquiera el persistence context, lo hereda
	 * 
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
	*/
}
