package grupo4.FanTurWEB.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Contacto {
	
	private String email;
	
	@NotNull
	@Min(000000)
	@Max(999999)
	private int CodPaisyArea;
	
	@NotNull
	@Min(000000)
	@Max(999999)
	private int telefono;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodPaisyArea() {
		return CodPaisyArea;
	}

	public void setCodPaisyArea(int codPaisyArea) {
		CodPaisyArea = codPaisyArea;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public Contacto() {
		
	}
	
	public Contacto(String email, int codPaisyArea, int telefono) {
		this.setEmail(email);
		this.setCodPaisyArea(codPaisyArea);
		this.setTelefono(telefono);
	}

}