package grupo4.FanTurWEB.model;

public class FactoryReserva {

	public static Reserva createReserva(Paquete paquete) {
		if (paquete.getCantidad() > 0 ) {
			paquete.setCantidad(paquete.getCantidad()-1);
			return new Reserva();
		} else {
			return null;
		}
	}
}
