package grupo4.FanTurWEB.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Cliente extends User {
	private Date nacimiento;
//	private List<Reserva> reservas;

	public Cliente(String nombre, String apellido, String password, Date nacimiento) {
		super(nombre, apellido, password);
		this.nacimiento = nacimiento;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	/*	
	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void addReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	*/
	
}
