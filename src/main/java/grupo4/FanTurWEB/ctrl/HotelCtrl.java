package grupo4.FanTurWEB.ctrl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import grupo4.FanTurWEB.model.Contacto;
import grupo4.FanTurWEB.model.Hotel;
import grupo4.FanTurWEB.model.Ubicacion;


@Named
@ViewScoped
public class HotelCtrl extends Ctrl<Hotel> implements Serializable{

	private static final long serialVersionUID = 1L;
	//Atributos que agrego para que anden en mi vista, si no sirve sacarlas
	private int idHotel;
	private Ubicacion ubicacion;
	private Contacto contacto;
	
	@PostConstruct
	private void init() {
		modelObj =  new Hotel();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/hoteles");
		//Aca iniciaizo mis dos atributos agregados
		ubicacion = new Ubicacion();
		contacto = new Contacto();
		modelObj.setContacto(contacto);
		modelObj.setUbicacion(ubicacion);
		modelList = new ArrayList<Hotel>(this.getAll());
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	public void empezarGestion(Hotel hotelucho) {
		modelObj = hotelucho; 
	}

	@Override
	public String getId(Hotel hotel) {
		return String.valueOf(hotel.getId());
	}

	@Override
	protected Class<Hotel> getClase() {
		return Hotel.class;
	}
	
	public Hotel getByNombre(String nombre) {
		invocation = webTarget.path(nombre).request().buildGet();
		response = invocation.invoke();
		Hotel hotel = response.readEntity(Hotel.class);		
		return hotel;
			
	}
	
	public void editar(String nombreHotel) {
		modelObj = this.getByNombre(nombreHotel);
	}
	
	
}