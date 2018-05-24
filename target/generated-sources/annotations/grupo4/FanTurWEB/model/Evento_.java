package grupo4.FanTurWEB.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evento.class)
public abstract class Evento_ {

	public static volatile SingularAttribute<Evento, String> descripcion;
	public static volatile SingularAttribute<Evento, Date> fecha;
	public static volatile SingularAttribute<Evento, Double> precio;
	public static volatile SingularAttribute<Evento, Ubicacion> lugar;
	public static volatile SingularAttribute<Evento, Integer> id;
	public static volatile SingularAttribute<Evento, Integer> nroEnt;

}

