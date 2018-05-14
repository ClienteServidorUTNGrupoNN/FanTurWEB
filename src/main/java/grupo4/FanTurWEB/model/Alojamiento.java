package grupo4.FanTurWEB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alojamiento",schema="fantur")
public class Alojamiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	// enum
	private String servicio;
	private int noches;
	private double precio;
	
	public Alojamiento() {}

	public Alojamiento(String servicio, int noches, double precio) {
		super();
		this.servicio = servicio;
		this.noches = noches;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int alojamientoId) {
		this.id = alojamientoId;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
