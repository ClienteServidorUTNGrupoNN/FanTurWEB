package grupo4.FanTurWEB.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasaje",schema="fantur")
public class Pasaje {

	@Id
	@GeneratedValue
	private int id;
	private String vehiculo;
	private String servicio;
	private Date partida;
	@Column(name = "fechaVuelta")
	private LocalDate fechaVuelta;
	private Ubicacion origen, destino;
	private int asiento;
	private double precio;
	@ManyToOne
	@JoinColumn(name = "idPaquete")
	private Paquete paquete;
	
	public int getId() {
		return id;
	}
	public void setNumPasaje(int numPasaje) {
		this.id = numPasaje;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public Date getPartida() {
		return partida;
	}
	public void setFechaPartida(Date partida) {
		this.partida = partida;
	}
	public LocalDate getFechaVuelta() {
		return fechaVuelta;
	}
	public void setFechaVuelta(LocalDate fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}
	public Ubicacion getOrigen() {
		return origen;
	}
	public void setOrigen(Ubicacion origen) {
		this.origen = origen;
	}
	public Ubicacion getDestino() {
		return destino;
	}
	public void setDestino(Ubicacion destino) {
		this.destino = destino;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public Pasaje(String vehiculo, String servicio, Date fechaPartida, LocalDate fechaVuelta,
			Ubicacion origen, Ubicacion destino, int asiento, double precio, Paquete paquete) {
		this.vehiculo = vehiculo;
		this.servicio = servicio;
		this.partida = fechaPartida;
		this.fechaVuelta = fechaVuelta;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.precio = precio;
		this.paquete = paquete;
	}
	
	public Pasaje() {}

}
