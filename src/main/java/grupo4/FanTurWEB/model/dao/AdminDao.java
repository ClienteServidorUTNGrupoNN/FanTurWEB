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
import grupo4.FanTurWEB.model.Admin_;


@Stateless
public class AdminDao extends AbstractDao<Admin, Integer>
	implements grupo4.FanTurWEB.model.dao.interfaces.AdminDao {


	@Override
	public List<Admin> findByNombreApellido(String nombre, String apellido) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		Root<Admin> a = cq.from(Admin.class);
		cq.select(a);
		Predicate condicion = cb.or(
				cb.like(a.get(Admin_.nombre), nombre),
				cb.like(a.get(Admin_.apellido), apellido));
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

	@Override
	protected Class<Admin> getClazz() {
		// TODO Auto-generated method stub
		return Admin.class;
	}

}
