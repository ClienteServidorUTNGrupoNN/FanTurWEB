package grupo4.FanTurWEB.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Evento {
	
	@Id
	private int id;
	private String descripcion;
	private double precio;
	private int nroEnt;
	
	@OneToOne
	@JoinColumn(name = "UBICACION_FK")
	private Ubicacion lugar;
	private Date fecha;
	
	
	public Evento(String descripcion, double precio, int nroEnt, Ubicacion lugar, Date fecha) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.nroEnt = nroEnt;
		this.lugar = lugar;
		this.fecha = fecha;
	}

	
	public Evento() {
		
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNroEnt() {
		return nroEnt;
	}

	public void setNroEnt(int nroEnt) {
		this.nroEnt = nroEnt;
	}

	public Ubicacion getLugar() {
		return lugar;
	}

	public void setLugar(Ubicacion lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
