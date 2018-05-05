package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Ubicacion;

@Stateless
public class UbicacionDao implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Ubicacion, Integer> {

	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Ubicacion ubicacion) {
		em.persist(ubicacion);
	}

	@Override
	public void update(Ubicacion ubicacion) {
		em.persist(ubicacion);
	}

	@Override
	public void delete(Ubicacion ubicacion) {
		em.remove(ubicacion);
	}

	@Override
	public Ubicacion findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubicacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
