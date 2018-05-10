package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Alojamiento;


@Stateless
public class AlojamientoDao implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Alojamiento,Integer> {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alojamiento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
