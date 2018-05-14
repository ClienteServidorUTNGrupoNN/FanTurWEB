package grupo4.FanTurWEB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import grupo4.FanTurWEB.model.Pasaje.TipoVehiculo;

@Entity
public class Servicio {
	
	private enum TipoServicio {
		Basic,
		Medium,
		Premium,
	}
	
	@Id
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoServicio tipoServ;
	
	@Size(min = 2, max = 50)
	@Column(name = "comida")
	private String comida;
	
	@AssertTrue
	@Column(name = "azafata")
	private String azafata;

	private enum TipoClase {
		turista,
		segundaClase,
		primera
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "tipoClase")
	private TipoClase tipoCls;

	public TipoServicio getTipoServ() {
		return tipoServ;
	}

	public void setTipoServ(TipoServicio tipoServ) {
		this.tipoServ = tipoServ;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public String getAzafata() {
		return azafata;
	}

	public void setAzafata(String azafata) {
		this.azafata = azafata;
	}

	public TipoClase getTipoCls() {
		return tipoCls;
	}

	public void setTipoCls(TipoClase tipoCls) {
		this.tipoCls = tipoCls;
	}
	
	public Servicio(TipoServicio tipoServ, String comida, String azafata, TipoClase tipoCls) {
		this.setTipoServ(tipoServ);
		this.setComida(comida);
		this.setAzafata(azafata);
		this.setTipoCls(tipoCls);
	}
	
	public Servicio() {
		
	}

}
