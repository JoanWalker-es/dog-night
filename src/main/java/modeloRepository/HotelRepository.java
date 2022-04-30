package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Hotel;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos de la sucursal
 * del hotel en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 * Implementa todos los métodos de la interfaz Repository.
 */
public class HotelRepository implements Repository<Hotel>{
	
	private Session sesion;

	public HotelRepository(Session sesion) {
		this.sesion=sesion;
	}

	@Override
	public void save(Hotel t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Hotel guardado correctamente con el id: "+t.getId());
		tx.commit();			
	}

	@Override
	public Hotel findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Hotel hotel=sesion.createQuery("FROM Hotel where id=:id",Hotel.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return hotel; 
	}

	@Override
	public List<Hotel> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Hotel> hoteles=sesion.createQuery("FROM Hotel",Hotel.class).getResultList();
		tx.commit();
		return hoteles; 
	}
	
	@Override
	public void update(Hotel t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Hotel actualizado correctamente con el id: "+t.getId());
		tx.commit();		
	}

	@Override
	public void delete(Hotel t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Hotel eliminado correctamente con el id: "+t.getId());
		tx.commit();
		
	}

	

}
