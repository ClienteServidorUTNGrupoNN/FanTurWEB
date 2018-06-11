package grupo4.FanTurWEB.model.dao.interfaces;

import javax.ejb.Local;

import grupo4.FanTurWEB.model.Pasaje;

@Local
public interface PasajeDao {

	void create(Pasaje p);
	void update(Pasaje p);
	
}
