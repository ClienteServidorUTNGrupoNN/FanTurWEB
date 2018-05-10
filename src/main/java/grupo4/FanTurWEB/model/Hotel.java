package grupo4.FanTurWEB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hotel",schema="fantur")
public class Hotel {
	
	@Id
	@Column(name = "idHotel")
	private int idHotel;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "contacto")
	private String contacto;
	@ManyToOne
	@JoinColumn(name = "alojamientoId")
	private Alojamiento aloj;
	
	public Hotel() {}

	public Hotel(int idHotel, String nombre, String contacto, Alojamiento aloj) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.contacto = contacto;
		this.aloj = aloj;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Alojamiento getAloj() {
		return aloj;
	}

	public void setAloj(Alojamiento aloj) {
		this.aloj = aloj;
	}
	

	

}
