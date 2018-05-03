package grupo4.model.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.model.Ubicacion;

@Stateless
public class UbicacionDao implements grupo4.model.dao.interfaces.UbicacionDao {

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

}
