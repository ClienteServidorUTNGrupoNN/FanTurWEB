package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Cliente;

@Stateless
public class ClienteDao implements grupo4.FanTurWEB.model.dao.interfaces.ClienteDao {

	@PersistenceContext(name = "pu1")
	EntityManager em;
	
	@Override
	public void create(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public void update(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		em.remove(cliente);
	}

	@Override
	public Cliente findById(Integer id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> c = cq.from(Cliente.class);
		cq.select(c).where(cb.equal(c.get("id").as(Integer.class), id));
		TypedQuery<Cliente> tq = em.createQuery(cq);
		return tq.getSingleResult();
	}

	@Override
	public List<Cliente> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> c = cq.from(Cliente.class);
		cq.select(c);
		TypedQuery<Cliente> tq = em.createQuery(cq);
		return tq.getResultList();
	}

	@Override
	public List<Cliente> findByNombreApellido(String nombre, String apellido) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> c = cq.from(Cliente.class);
		cq.select(c).where(cb.or(
				cb.like(c.get("nombre").as(String.class), nombre),
				cb.like(c.get("apellido").as(String.class), apellido)
				));
		TypedQuery<Cliente> tq = em.createQuery(cq);
		return tq.getResultList();
	}


}
