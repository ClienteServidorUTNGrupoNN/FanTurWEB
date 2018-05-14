package grupo4.FanTurWEB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hotel",schema="fantur")
public class Hotel {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String nombre;
	
	@NotNull
	@JoinColumn
	private Contacto contacto;
	
	@OneToOne
	@JoinColumn(name = "UBICACION_FK")
	private Ubicacion ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Alojamiento aloj;
	
	public Hotel() {}

	public Hotel(String nombre, Contacto contacto, Alojamiento aloj, Ubicacion ubicacion) {
		super();
		this.nombre = nombre;
		this.contacto = contacto;
		this.aloj = aloj;
		this.ubicacion = ubicacion;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Alojamiento getAloj() {
		return aloj;
	}

	public void setAloj(Alojamiento aloj) {
		this.aloj = aloj;
	}
	
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
}