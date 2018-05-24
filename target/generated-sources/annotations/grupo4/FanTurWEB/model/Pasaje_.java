package grupo4.FanTurWEB.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pasaje.class)
public abstract class Pasaje_ {

	public static volatile SingularAttribute<Pasaje, Double> precio;
	public static volatile SingularAttribute<Pasaje, Date> fechaVuelta;
	public static volatile SingularAttribute<Pasaje, Integer> id;
	public static volatile SingularAttribute<Pasaje, TipoVehiculo> vehiculo;
	public static volatile SingularAttribute<Pasaje, Ubicacion> origen;
	public static volatile SingularAttribute<Pasaje, Ubicacion> destino;
	public static volatile SingularAttribute<Pasaje, Integer> asiento;
	public static volatile SingularAttribute<Pasaje, Paquete> paquete;
	public static volatile SingularAttribute<Pasaje, Clase> clase;
	public static volatile SingularAttribute<Pasaje, Date> partida;

}

