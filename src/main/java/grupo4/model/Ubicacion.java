package grupo4.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ubicacion {

	@Id
	private int id;
	private String calle;
	private int altura;
	private String provincia;
	private String pais;
	
	public Ubicacion() {
		
	}
	
	public Ubicacion(int id, String calle, int altura, String provincia, String pais) {
		super();
		this.id = id;
		this.calle = calle;
		this.altura = altura;
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
