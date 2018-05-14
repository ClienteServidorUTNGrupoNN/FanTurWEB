package grupo4.FanTurWEB.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> apellido;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> nombre;

	public static final String PASSWORD = "password";
	public static final String APELLIDO = "apellido";
	public static final String ID = "id";
	public static final String NOMBRE = "nombre";

}

