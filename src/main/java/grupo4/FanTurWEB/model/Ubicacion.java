package grupo4.FanTurWEB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name="ubicacion",schema="fantur")
public class Ubicacion {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="calle")
	private String calle;
	
	@Min(0)
	@Column(name="altura")
	private int altura;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="pais")
	private String pais;
	
	public Ubicacion() {
		
	}
	
	public Ubicacion( String calle, int altura, String localidad, String provincia, String pais) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
