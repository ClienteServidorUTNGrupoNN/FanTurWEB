package grupo4.FanTurWEB.model;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;


@Entity
public class Admin extends User {

	@ManyToOne
	private Admin registradoPor;

	public Admin() {}

	public Admin(String nombre, String apellido, String password, Admin registradoPor) {
		super(nombre, apellido, password);
		this.registradoPor = registradoPor;
	}
	
	public Admin getRegistradoPor() {
		return registradoPor;
	}
	
}
