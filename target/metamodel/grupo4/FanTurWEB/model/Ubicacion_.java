package grupo4.FanTurWEB.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ubicacion.class)
public abstract class Ubicacion_ {

	public static volatile SingularAttribute<Ubicacion, Integer> altura;
	public static volatile SingularAttribute<Ubicacion, String> calle;
	public static volatile SingularAttribute<Ubicacion, String> localidad;
	public static volatile SingularAttribute<Ubicacion, Integer> id;
	public static volatile SingularAttribute<Ubicacion, String> provincia;
	public static volatile SingularAttribute<Ubicacion, String> pais;

	public static final String ALTURA = "altura";
	public static final String CALLE = "calle";
	public static final String LOCALIDAD = "localidad";
	public static final String ID = "id";
	public static final String PROVINCIA = "provincia";
	public static final String PAIS = "pais";

}

