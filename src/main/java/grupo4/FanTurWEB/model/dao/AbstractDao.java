package grupo4.FanTurWEB.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.dao.interfaces.Dao;

public abstract class AbstractDao<T, Pk extends Serializable> implements Dao<T, Pk>  {

	@PersistenceContext(unitName = "pu1")
	protected EntityManager em;

	
	@Override
	public void create(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findById(Pk id) {
		return em.find(getClazz(), id);
	}

	protected abstract Class<T> getClazz();

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
