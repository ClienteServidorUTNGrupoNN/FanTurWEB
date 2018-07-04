package grupo4.FanTurWEB.controladores;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;

import grupo4.FanTurWEB.model.Admin;
import grupo4.FanTurWEB.model.Cliente;
import grupo4.FanTurWEB.model.Contacto;
import grupo4.FanTurWEB.model.dao.interfaces.AdminDao;
import grupo4.FanTurWEB.model.dao.interfaces.ClienteDao;
import grupo4.FanTurWEB.model.dao.interfaces.ContactoDao;

@Named("loginBean")
@SessionScoped
public class LoginCont implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = Logger.getLogger(LoginCont.class);

	@EJB
	private ClienteDao clienteEJB;
	
	
	@EJB
	private ContactoDao contactoEJB;
	
	@EJB
	private AdminDao adminEJB;
	

	private Cliente cliente;

	private Contacto contacto;

	private Cliente clienteResguardo;

	private String usuario;

	private String password;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Cliente getClienteResguardo() {
		return clienteResguardo;
	}

	public void setClienteResguardo(Cliente clienteResguardo) {
		this.clienteResguardo = clienteResguardo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		contacto = new Contacto();
		clienteResguardo = new Cliente();
	}
	
	
	
	public String iniciarSesion() {
		logger.info("Se llama a iniciarSesion()");
		// Cliente tempCli;
		String redireccion = null;
		// cliente.setContacto(contacto);

		try {

			List<Cliente> listaClienteTemp = clienteEJB.findByUser(this.usuario);
			
			//SI LA LISTA ESTA VACIA, SALE POR EL CATCH
			
			if (listaClienteTemp != null) {
				clienteResguardo = listaClienteTemp.get(0);
				
				logger.info("Se guardó el resguardo del cliente" + clienteResguardo);

				if (clienteResguardo.getPassword().equals(this.password)) {
					// Almacenar en la sesión de JSF
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("clientex",
							clienteResguardo);
					redireccion = "loginproxy";
					
				} else {

					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Contraseña Incorrecta"));
				}

			}

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "Usuario no regitrado"));

		}
		return redireccion;
	}
	
	
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
		try {
			if (request != null) {
				//request.getSession(false).invalidate();
				request.logout();
				//this.authenticationError = false;
			}
			externalContext.redirect(externalContext.getRequestContextPath() + "/index.xhtml");
		} catch (IOException e) {
			logger.error("Logout error: " + e.getMessage());
		} catch (ServletException e) {
			logger.error("Logout error: " + e.getMessage());
		}
	}
	
	
	
	public Admin obtenerAdminSesion() {
		logger.info("Se llama a obtenerAdminSesion()");
		List<Admin> listaAdminTemp = adminEJB.findByUser(this.usuario);
		logger.info("la seteo la lista");
		logger.info("la lista esta vacia" + listaAdminTemp.isEmpty());
		return listaAdminTemp.get(0);
		
	}
	
	
}
