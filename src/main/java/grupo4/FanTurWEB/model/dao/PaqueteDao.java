package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Paquete;

@Stateless
public class PaqueteDao implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Paquete,Integer> {

	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Paquete p) {
		em.persist(p);
	}
	
	@Override
	public void update(Paquete p) {
		em.persist(p);
	}
	
	@Override
	public void delete(Paquete p){
		em.remove(p);
	}
	
	@Override
	public Paquete findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paquete> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
