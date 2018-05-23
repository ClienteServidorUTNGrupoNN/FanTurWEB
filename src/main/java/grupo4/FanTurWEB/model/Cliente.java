package grupo4.FanTurWEB.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Past;

@Entity
public class Cliente extends User {
	
	@Past
	private Date nacimiento;

	@OneToMany(mappedBy="cliente")
	private List<Reserva> reservas;
	
	@Transient
	private Reserva reserva;
	
	@OneToOne
	@JoinColumn(name = "idContacto")
	private Contacto contacto;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nombre,String apellido,String password, Date nacimiento, List<Reserva> reservas, Contacto contacto) {
		super(nombre,apellido,password);
		this.nacimiento = nacimiento;
		this.reservas = reservas;
		this.contacto = contacto;
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
	
	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public void reservar(Paquete paquete) {
		reserva = FactoryReserva.createReserva(paquete);
		if (reserva != null) {
			if (this.reservas == null) {
				this.reservas = new LinkedList<Reserva>();
			}
			this.reservas.add(reserva);
		}
	}


}
