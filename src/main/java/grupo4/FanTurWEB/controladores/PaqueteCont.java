package grupo4.FanTurWEB.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import grupo4.FanTurWEB.model.Alojamiento;
import grupo4.FanTurWEB.model.Evento;
import grupo4.FanTurWEB.model.Hotel;
import grupo4.FanTurWEB.model.Paquete;
import grupo4.FanTurWEB.model.dao.interfaces.EventoDao;
import grupo4.FanTurWEB.model.dao.interfaces.HotelDao;
import grupo4.FanTurWEB.model.dao.interfaces.PaqueteDao;

@Named("paqueteCont")
@ConversationScoped()
public class PaqueteCont implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@EJB
	private PaqueteDao paqueteEJB;
	@Inject
	private Conversation conversacion;
	private Paquete paquete;	
	private Alojamiento alojamiento;
	private Evento evento;
	private List<Evento> eventos;
	private List<Hotel> hoteles;
	@EJB
	private HotelDao hotelEJB;
	@EJB
	private EventoDao eventoEJB;
	
	public void comenzar() {
		conversacion.begin();
	}
	
	public void terminar() {
		conversacion.end();
	}
		
	public List<Hotel> getHoteles() {
		return hoteles;
	}

	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}


	
	@PostConstruct
	public void init() {
		paquete = new Paquete();
		alojamiento = new Alojamiento();
		paquete.setAlojamiento(alojamiento);		
		evento = new Evento();
		eventos = new ArrayList<Evento>();
		hoteles = new ArrayList<Hotel>();	
		paquete.setEventos(eventos);	
	}
	
	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}	

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	
	public void setearHotel(Hotel hotelSel) {
		paquete.getAlojamiento().getHoteles().add(hotelSel);
	}
	
	public void setearEvento(Evento eventoSel) {
		paquete.getEventos().add(eventoSel);
	}
	
	public List<Evento> listarEventos() {
		return eventoEJB.findAll();
	}
	public String agregarHoteles() {			
		return "continuar";
	}
	
	public List<Hotel> listarHoteles() {
		return hotelEJB.findAll();
	}
	
	public String empezar() {
		comenzar();
		return "crearPaquete";
	}
	public String continuarHotel() {			
		return "seguir";
	}
	
	public String crearPaquete() {				
		paqueteEJB.create(paquete);		
		terminar();
		return "terminar";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
