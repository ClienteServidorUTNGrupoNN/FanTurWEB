package grupo4.FanTurWEB.model.dao.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

//@Local
public interface Dao<T, id extends Serializable> {

	void create(T obj);
	void update(id id, T obj);
	void delete(T obj);
	T findById(id id);
	List<T> findAll();
	
}
