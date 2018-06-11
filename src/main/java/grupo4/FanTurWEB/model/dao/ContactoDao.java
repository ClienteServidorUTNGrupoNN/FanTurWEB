package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Contacto;

@Stateless
public class ContactoDao extends AbstractDao<Contacto, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Contacto,Integer> {

	@Override
	protected Class<Contacto> getClazz() {
		return Contacto.class;
	}
	
	
	/* Si anda bien el AbstractDAO, todo esto no hace falta
	 * Ni siquiera el persistence context, lo hereda
	 * 	
	@PersistenceContext(unitName = "pu1")
	EntityManager em;

	@Override
	public void create(Contacto contacto) {
		em.persist(contacto);
	}

	@Override
	public void update(Contacto contacto) {
		em.persist(contacto);
	}

	@Override
	public void delete( Contacto contacto) {
		em.remove(contacto);
	}

	@Override
	public Contacto findById(Integer id) {
		return em.find(Contacto.class, id);
	}

	@Override
	public List<Contacto> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Contacto> cq = cb.createQuery(Contacto.class);
		Root<Contacto> c = cq.from(Contacto.class);
		cq.select(c);
		TypedQuery<Contacto> tq = em.createQuery(cq);
		return tq.getResultList();
	}
	*/

}
