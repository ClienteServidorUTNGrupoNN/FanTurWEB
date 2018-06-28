package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import grupo4.FanTurWEB.model.Ubicacion;

@Stateless
//public class UbicacionDao extends AbstractDao<Ubicacion, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.Dao<Ubicacion, Integer> {
public class UbicacionDao extends AbstractDao<Ubicacion, Integer> implements grupo4.FanTurWEB.model.dao.interfaces.UbicacionDao {
	
	@Override
	protected Class<Ubicacion> getClazz() {
		return Ubicacion.class;
	}

	@Override
	public void update(Integer id, Ubicacion nueva) {
		Ubicacion actual = this.findById(id);
		actual.setCalle(nueva.getCalle());
		actual.setAltura(nueva.getAltura());
		actual.setLocalidad(nueva.getLocalidad());
		actual.setProvincia(nueva.getProvincia());
		actual.setPais(nueva.getPais());
		em.persist(actual);
	}

}
