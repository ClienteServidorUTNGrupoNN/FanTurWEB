package grupo4.FanTurWEB.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Reserva {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name= "idCliente")
	private Cliente cliente;
	
	private Date fechaReserva, fechaPago;
	
	@OneToOne
	@JoinColumn(name = "PAQUETE_FK")
	private Paquete paquete;
	
	public Reserva(){
		
	}

	public Reserva(Cliente cliente, Paquete paquete) {
		this.cliente = cliente;
		this.paquete = paquete;
	}

	public int getId() {
		return id;
	}

	public void setId(int idReserva) {
		this.id = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	
}
