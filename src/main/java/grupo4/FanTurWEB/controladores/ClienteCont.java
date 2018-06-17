package grupo4.FanTurWEB.controladores;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import grupo4.FanTurWEB.model.Cliente;
import grupo4.FanTurWEB.model.Contacto;
//import grupo4.FanTurWEB.model.dao.ContactoDao;
import grupo4.FanTurWEB.model.dao.interfaces.ClienteDao;

@Named("clienteBean")
@ViewScoped
public class ClienteCont implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(ClienteCont.class.getName());

	
	
	@EJB
	private ClienteDao clienteEJB;

	private Cliente cliente;
	
	private Contacto contacto;

	
	
	
	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	@PostConstruct
	public void onInit() {
		contacto = new Contacto();
		cliente = new Cliente();
	}
	
	
	
	public void registrar() {
		try {
			
			logger.info("Se va a crear un cliente: " + cliente);
			
			
			/*
			this.contacto.setEmail("");
			this.contacto.setPagina("");
			this.contacto.setCodPaisyArea(000000);
			this.contacto.setTelefono(000000);
			*/
			
			logger.info("Se va a setear el siguiente contacto al cliente: " + contacto);

			
			this.cliente.setContacto(this.contacto);
			
			logger.info("Se seteó el siguiente contacto al cliente: " + cliente.getContacto());
			
			clienteEJB.create(cliente);
			//mensaje
		}catch(Exception e) {
			//mensaje
		}
	}

}
