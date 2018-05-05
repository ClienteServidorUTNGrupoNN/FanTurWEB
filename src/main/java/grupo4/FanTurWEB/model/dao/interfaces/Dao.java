package grupo4.FanTurWEB.model.dao.interfaces;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, id extends Serializable> {

	void create(T obj);
	void update(T obj);
	void delete(T obj);
	T findById(id id);
	List<T> findAll();
	
}
