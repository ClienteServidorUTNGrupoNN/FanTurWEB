package grupo4.FanTurWEB.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import grupo4.FanTurWEB.model.dao.interfaces.Dao;

@Stateless
public abstract class AbstractDao<T, Pk extends Serializable> implements Dao<T, Pk>  {

	@PersistenceContext(unitName = "pu1")
	protected EntityManager em;

	
	@Override
	public void create(T obj) {
		em.persist(obj);
	}

	@Override
	public void update(T obj) {
		em.merge(obj);
	}

	@Override
	public void delete(T obj) {
		obj = em.merge(obj);
		em.remove(obj);
	}

	@Override
	public T findById(Pk id) {
		return em.find(getClazz(), id);
	}

	@Override
	public List<T> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(this.getClazz());
		Root<T> a = cq.from(this.getClazz());
		cq.select(a);
		TypedQuery<T> tq = em.createQuery(cq);
		return tq.getResultList();
	}
	
	// pequeño yeite para que funcione este Generic DAO. Cada DAO lo redefine
	protected abstract Class<T> getClazz();

}
