package grupo4.FanTurWEB.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import grupo4.FanTurWEB.model.Hotel;

@Stateless
public class HotelDao implements grupo4.FanTurWEB.model.dao.interfaces.HotelDao {
	
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;
	
	@Override
	public void create(Hotel h) {
	em.persist(h);
	}
	
	@Override
	public void delete(Hotel h) {
	em.remove(h);
	}
	
	@Override
	public void update(Hotel h) {
		em.persist(h);
	}
	
	@Override
	public Hotel findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Hotel encontrarHotel(int nh) {
		return em.find(Hotel.class,nh);
	}
	@Override
	public List<Hotel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
