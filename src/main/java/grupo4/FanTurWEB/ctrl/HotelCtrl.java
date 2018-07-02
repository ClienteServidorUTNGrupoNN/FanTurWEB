package grupo4.FanTurWEB.ctrl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
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
	private Set<Hotel> hoteles1;
	private Set<Hotel> hoteles2;
	//private List<Hotel> laux1;	
	//private List<Hotel> laux2;
	//private UbicacionCtrl ubicacionCont;
	//private ContactoCtrl contactoCont;
	
	@PostConstruct
	private void init() {
		modelObj =  new Hotel();
		client = ClientBuilder.newClient();
		webTarget = client.target("http://localhost:8080/FanTurWEB/rest/hoteles");
		afterCreate = "indexAdmin.xhtml";
		afterUpdate = "indexAdmin.xhtml";
		afterDelete = "indexAdmin.xhtml";
		//Aca iniciaizo mis dos atributos agregados
		ubicacion = new Ubicacion();
		contacto = new Contacto();
		modelObj.setContacto(contacto);
		modelObj.setUbicacion(ubicacion);
		hoteles1 = new HashSet<Hotel>();
		hoteles1 = this.getAll();
		//laux1 = new ArrayList<Hotel>(hoteles1);
		hoteles2 = new HashSet<Hotel>();
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public Set<Hotel> getHoteles1() {
		return hoteles1;
	}

	public void setHoteles1(Set<Hotel> hoteles1) {
		this.hoteles1 = hoteles1;
	}

	public Set<Hotel> getHoteles2() {
		return hoteles2;
	}

	public void setHoteles2(Set<Hotel> hoteles2) {
		this.hoteles2 = hoteles2;
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
	
	public void buscarHotel() {
		id = String.valueOf(idHotel);
		Response respuesta  = this.get();
		modelObj = respuesta.readEntity(Hotel.class);
		hoteles2.add(modelObj);
		
	}
	
	public void empezarGestion(Hotel hotelucho) {
		modelObj = hotelucho; 
	}
	
	public String modificarHotel() {
		id = String.valueOf(modelObj.getId());		
		return this.update();
	}
	
	public String eliminarHotel() {
		id = String.valueOf(modelObj.getId());
		return this.delete();
	}
}
