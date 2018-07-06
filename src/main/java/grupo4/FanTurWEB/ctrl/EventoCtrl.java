package grupo4.FanTurWEB.ctrl;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.client.ClientBuilder;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Evento;
import grupo4.FanTurWEB.model.Ubicacion;

@Named
@ViewScoped
public class EventoCtrl extends Ctrl<Evento> implements Serializable{

	private static final long serialVersionUID = 1L;
	//Agrego esa entidad para poder setearle una ubicacion al evento
	private Ubicacion ubicacion;
	
	

	@PostConstruct
	private void init() {
		modelObj =  new Evento();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/eventos");
		//Inicializo y seteo la ubicacion
		ubicacion = new Ubicacion();
		modelObj.setLugar(ubicacion);
	}	 
	
	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getId(Evento evento) {
		return String.valueOf(evento.getId());
	}

	@Override
	protected Class<Evento> getClase() {
		return Evento.class;
	}
	
}
