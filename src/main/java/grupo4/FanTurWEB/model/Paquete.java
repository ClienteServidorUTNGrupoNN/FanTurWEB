package grupo4.FanTurWEB.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
public class Paquete {

	@Id
	private int id;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	private double precio;
	
	private int cantidad;
	
	@OneToMany(mappedBy="paquete")
	private List<Pasaje> pasajes;
	
	@ManyToOne
	@JoinColumn(name = "ALOJAMIENTO_ID")
	private Alojamiento alojamiento;
	
	@ManyToMany
	@JoinTable(name="Paquete_Evento",
	 joinColumns=@JoinColumn(name="ID_PAQUETE"),
	 inverseJoinColumns=@JoinColumn(name="ID_EVENTO"))
	private List<Evento> evento;
	
	@OneToOne
	@JoinColumn
	private Admin creadoPor;
	
	private String autorizado;
	
	public Paquete() {
		super();
	}

	public Paquete(int id, double precio, int cantidad, List<Pasaje> pasajes, Alojamiento alojamiento,
			List<Evento> evento, Admin admin) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
		this.pasajes = pasajes;
		this.alojamiento = alojamiento;
		this.evento = evento;
		this.creadoPor = admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(List<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}
	
	public Admin getCreadoPor() {
		return this.creadoPor;
	}

}
