package grupo4.FanTurWEB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Habitacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String tipo;
	@ManyToOne
	@JoinColumn(name="HOTEL_FK")
	private Hotel hotel;
	
	public Habitacion(String tipo, Hotel hotel) {
		this.tipo = tipo;
		this.hotel = hotel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
