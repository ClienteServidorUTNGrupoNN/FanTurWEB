package grupo4.FanTurWEB.model.dao.interfaces;

import java.util.List;

import grupo4.FanTurWEB.model.Cliente;

public interface ClienteDao extends grupo4.FanTurWEB.model.dao.interfaces.Dao<Cliente, Integer>{
	
	List<Cliente> findByNombreApellido(String nombre, String apellido);
	
}
