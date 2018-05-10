package grupo4.FanTurWEB.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evento",schema="fantur")
public class Evento {
	
	@Id
	@Column(name="nroEvento")
	private int nroEvento;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private double precio;
	@Column(name="nroEnt")
	private int nroEnt;
	@Column(name="lugar")
	private String lugar;
	@Column(name="fecha")
	private LocalDate fecha;
	@Column(name="hora")
	private int hora;
	
	
	public Evento(int nroEvento, String descripcion, double precio, int nroEnt, String lugar, LocalDate fecha,
			int hora) {
		this.nroEvento = nroEvento;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nroEnt = nroEnt;
		this.lugar = lugar;
		this.fecha = fecha;
		this.hora = hora;
	}

	
	public Evento() {
		
	}

	public int getNroEvento() {
		return nroEvento;
	}

	public void setNroEvento(int nroEvento) {
		this.nroEvento = nroEvento;
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	
	
}
