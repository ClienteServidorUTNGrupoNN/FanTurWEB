package grupo4.FanTurWEB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
public class Alojamiento {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String servicio;
	private int noches;
	private double precio;
	
	public Alojamiento() {
		super();
	}

	public Alojamiento(String servicio, int noches, double precio) {
		super();
		this.servicio = servicio;
		this.noches = noches;
		this.precio = precio;
	}

	public int getId() {
		return id;
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
		Alojamiento other = (Alojamiento) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Alojamiento [getId()=" + getId() + ", getServicio()=" + getServicio() + ", getNoches()=" + getNoches()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
	
	
}
