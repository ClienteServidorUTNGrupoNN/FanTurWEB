package grupo4.FanTurWEB.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva",schema="fantur")
public class Reserva {
	
	@Id 
	@Column(name = "idReserva")
	private int idReserva;
	
	@ManyToOne
	@JoinColumn(name= "id")
	private Cliente cliente;
	private LocalDate fechaRes;
	private LocalDate fechaPago;
	
	@OneToOne
	@JoinColumn(name = "idPaquete")
	private Paquete paquete;
	
	public Reserva(){
		
	}

	public Reserva(int idReserva, Cliente cliente, LocalDate fechaRes, LocalDate fechaPago, Paquete paquete) {
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.fechaRes = fechaRes;
		this.fechaPago = fechaPago;
		this.paquete = paquete;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaRes() {
		return fechaRes;
	}

	public void setFechaRes(LocalDate fechaRes) {
		this.fechaRes = fechaRes;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	
	
	
	
	
}
