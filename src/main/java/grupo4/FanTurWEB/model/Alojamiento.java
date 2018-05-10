package grupo4.FanTurWEB.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alojamiento",schema="fantur")
public class Alojamiento {
	
	@Id
	@Column(name = "alojamientoId")
	private int alojamientoId;
	@Column(name = "servicio")
	private String servicio;
	@Column(name = "nroHab")
	private int nroHab;
	@Column(name = "noches")
	private int noches;
	@Column(name = "precio")
	private double precio;
	@OneToMany(mappedBy = "alojamiento")
	private List<Paquete> paquetes;
	@OneToMany(mappedBy = "aloj")
	private List<Hotel> hoteles;
	
	public Alojamiento() {}

	public Alojamiento(int alojamientoId, String servicio, int nroHab, int noches, double precio,
			List<Paquete> paquetes, List<Hotel> hoteles) {
		super();
		this.alojamientoId = alojamientoId;
		this.servicio = servicio;
		this.nroHab = nroHab;
		this.noches = noches;
		this.precio = precio;
		this.paquetes = paquetes;
		this.hoteles = hoteles;
	}

	public int getAlojamientoId() {
		return alojamientoId;
	}

	public void setAlojamientoId(int alojamientoId) {
		this.alojamientoId = alojamientoId;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public int getNroHab() {
		return nroHab;
	}

	public void setNroHab(int nroHab) {
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
