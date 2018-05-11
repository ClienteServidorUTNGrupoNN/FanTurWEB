package grupo4.FanTurWEB.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alojamiento",schema="fantur")
public class Alojamiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	// enum
	private String servicio;
	private String nroHab;
	private int noches;
	private double precio;
	@OneToMany(mappedBy = "alojamiento")
	private List<Paquete> paquetes;
	@OneToMany(mappedBy = "aloj")
	private List<Hotel> hoteles;
	
	public Alojamiento() {}

	public Alojamiento(String servicio, String nroHab, int noches, double precio,
			List<Paquete> paquetes, List<Hotel> hoteles) {
		super();
		this.servicio = servicio;
		this.nroHab = nroHab;
		this.noches = noches;
		this.precio = precio;
		this.paquetes = paquetes;
		this.hoteles = hoteles;
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

	public String getNroHab() {
		return nroHab;
	}

	public void setNroHab(String nroHab) {
		this.nroHab = nroHab;
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

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	public List<Hotel> getHoteles() {
		return hoteles;
	}

	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}
	
}
