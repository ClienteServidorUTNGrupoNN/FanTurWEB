package grupo4.FanTurWEB.model;

import java.util.Date; 

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Past;

@Entity
@Table(name="cliente",schema="fantur")
public class Cliente extends User {
	
	@Past
	private Date nacimiento;

	@OneToMany(mappedBy="cliente")
	private List<Reserva> reservas;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre,String apellido,String password, Date nacimiento, List<Reserva> reservas) {
		super(nombre,apellido,password);
		this.nacimiento = nacimiento;
		this.reservas = reservas;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
