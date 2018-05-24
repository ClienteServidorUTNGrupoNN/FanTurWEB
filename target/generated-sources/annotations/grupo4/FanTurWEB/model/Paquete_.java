package grupo4.FanTurWEB.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paquete.class)
public abstract class Paquete_ {

	public static volatile SingularAttribute<Paquete, Admin> creadoPor;
	public static volatile SingularAttribute<Paquete, Double> precio;
	public static volatile ListAttribute<Paquete, Evento> evento;
	public static volatile SingularAttribute<Paquete, String> autorizado;
	public static volatile SingularAttribute<Paquete, Integer> id;
	public static volatile SingularAttribute<Paquete, Integer> cantidad;
	public static volatile ListAttribute<Paquete, Pasaje> pasajes;
	public static volatile SingularAttribute<Paquete, Alojamiento> alojamiento;

}

