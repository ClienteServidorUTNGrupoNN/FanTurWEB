package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Admin;

@Stateless
public class AdminDao implements grupo4.FanTurWEB.model.dao.interfaces.AdminDao {

	@PersistenceContext(name = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Admin admin) {
		em.persist(admin);
	}

	@Override
	public void update(Admin admin) {
		em.persist(admin);
	}

	@Override
	public void delete(Admin admin) {
		em.remove(admin);
	}

	@Override
	public Admin findById(Integer id) {
		return em.find(Admin.class, id);
	}

	@Override
	public List<Admin> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		Root<Admin> a = cq.from(Admin.class);
		cq.select(a);
		TypedQuery<Admin> tq = em.createQuery(cq);
		
		return tq.getResultList();
	}

	@Override
	public List<Admin> findByNombreApellido(String nombre, String apellido) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		Root<Admin> a = cq.from(Admin.class);
		cq.select(a);
		Predicate condicion = cb.or(
				cb.like(a.get("nombre").as(String.class), nombre),
				cb.like(a.get("apellido").as(String.class), apellido));
		cq.where(condicion);
		TypedQuery<Admin> tq = em.createQuery(cq);	
		return tq.getResultList();
	}

	@Override
	public List<Admin> findByRegistradoPor(Admin admin) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		Root<Admin> a = cq.from(Admin.class);
		cq.select(a).where(cb.equal(a.get("registradoPor"), admin));
		TypedQuery<Admin> tq = em.createQuery(cq);
		return tq.getResultList();
	}

}
