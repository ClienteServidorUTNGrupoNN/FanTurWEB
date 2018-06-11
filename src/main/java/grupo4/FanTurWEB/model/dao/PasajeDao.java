package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import grupo4.FanTurWEB.model.Pasaje;


@Stateless
public class PasajeDao extends AbstractDao<Pasaje, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.PasajeDao {

	@Override
	protected Class<Pasaje> getClazz() {
		return Pasaje.class;
	}

	/* Si anda bien el AbstractDAO, todo esto no hace falta
	 * Ni siquiera el persistence context, lo hereda
	 * 
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Pasaje p) {
		em.persist(p);
	}
	
	public void delete(Pasaje p) {
		em.remove(p);
	}
	
	@Override
	public void update(Pasaje p) {
		em.persist(p);
	}	

	public Pasaje findById(Integer id) {
		return em.find(Pasaje.class, id);
	}
	

	public List<Pasaje> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
