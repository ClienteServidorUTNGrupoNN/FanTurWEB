package grupo4.FanTurWEB.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ extends grupo4.FanTurWEB.model.User_ {

	public static volatile SingularAttribute<Cliente, Contacto> contacto;
	public static volatile ListAttribute<Cliente, Reserva> reservas;
	public static volatile SingularAttribute<Cliente, Date> nacimiento;

}

