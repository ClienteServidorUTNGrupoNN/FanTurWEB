package grupo4.FanTurWEB.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasaje",schema="fantur")
public class Pasaje {

	@Id
	@Column(name = "numPasaje")
	private int numPasaje;
	@Column(name = "vehiculo")
	private String vehiculo;
	@Column(name = "servicio")
	private String servicio;
	@Column(name = "fechaPartida")
	private LocalDate fechaPartida;
	@Column(name = "fechaVuelta")
	private LocalDate fechaVuelta;
	@Column(name = "origen")
	private String origen;
	@Column(name = "destino")
	private String destino;
	@Column(name = "asiento")
	private int asiento;
	@Column(name = "precio")
	private double precio;
	@ManyToOne
	@JoinColumn(name = "idPaquete")
	private Paquete paquete;
	public int getNumPasaje() {
		return numPasaje;
	}
	public void setNumPasaje(int numPasaje) {
		this.numPasaje = numPasaje;
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
	public LocalDate getFechaPartida() {
		return fechaPartida;
	}
	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}
	public LocalDate getFechaVuelta() {
		return fechaVuelta;
	}
	public void setFechaVuelta(LocalDate fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
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
	public Pasaje(int numPasaje, String vehiculo, String servicio, LocalDate fechaPartida, LocalDate fechaVuelta,
			String origen, String destino, int asiento, double precio, Paquete paquete) {
		this.numPasaje = numPasaje;
		this.vehiculo = vehiculo;
		this.servicio = servicio;
		this.fechaPartida = fechaPartida;
		this.fechaVuelta = fechaVuelta;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.precio = precio;
		this.paquete = paquete;
	}
	
	public Pasaje() {}

	
	
}
