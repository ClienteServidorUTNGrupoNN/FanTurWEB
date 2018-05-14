package grupo4.FanTurWEB.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasaje",schema="fantur")
public class Pasaje {

	@Id
	@GeneratedValue
	private int id;
	
	private enum TipoVehiculo {
	    Auto,
	    Avion,
	    Colectivo,
	    Tren
	}
	
	@Enumerated(EnumType.STRING)
	private TipoVehiculo vehiculo;
	
	@JoinColumn(name = "idServicio")
	private Servicio servicio;
	
	private Date partida;
	
	@Column(name = "fechaVuelta")
	private LocalDate fechaVuelta;
	
	@OneToOne
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
	public TipoVehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(TipoVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
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
	public Pasaje(TipoVehiculo vehiculo, Servicio servicio, Date fechaPartida, LocalDate fechaVuelta,
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
