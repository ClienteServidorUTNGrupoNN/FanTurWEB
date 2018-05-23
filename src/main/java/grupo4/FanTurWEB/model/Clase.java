package grupo4.FanTurWEB.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import grupo4.FanTurWEB.model.Pasaje.TipoVehiculo;

@Entity
public class Clase {
	
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
		Clase other = (Clase) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoClase clase;
	
//	@Enumerated(EnumType.STRING)
	@OneToMany
	private List<Servicio> servicios;

	public TipoClase getClase() {
		return clase;
	}

	public void setClase(TipoClase clase) {
		this.clase = clase;
	}
	
	public List<Servicio> getServicios(){
		return servicios;
	}
	
	
	public void addServicio(Servicio servicio) {
		if (this.servicios == null) {
			this.servicios = new LinkedList<Servicio>();
		}
		this.servicios.add(servicio);
	}
	
	public Clase (TipoClase clase) {
		this.setClase(clase);
	}
	
	public Clase() {
		super();
	}

}
