package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import grupo4.FanTurWEB.model.Pasaje;


@Stateless
public class PasajeDao implements grupo4.FanTurWEB.model.dao.interfaces.PasajeDao {

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
	
	

	
	@Override
	public Pasaje encontrarPasaje(int np) {
		return em.find(Pasaje.class, np);
	}
	

	public Pasaje findById(Integer id) {
		return em.find(Pasaje.class, id);
	}
	

	public List<Pasaje> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
