package grupo4.FanTurWEB.model.dao.interfaces;

import grupo4.FanTurWEB.model.Evento;

public interface EventoDao extends grupo4.FanTurWEB.model.dao.interfaces.Dao<Evento,Integer>{
	
	Evento encontrarEvento(int ne);

}
