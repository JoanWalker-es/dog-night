package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Servicios;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos de los servicios
 * en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 * Implementa todos los métodos de la interfaz Repository.
 */

public class ServiciosRepository implements Repository<Servicios>{

	private Session sesion;

	public ServiciosRepository(Session sesion) {
		this.sesion=sesion;
	}

	public void save(Servicios t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Servicio guardado correctamente con el id: "+t.getIdServicio());
		tx.commit();	
	}

	public List<Servicios> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Servicios> servicios=sesion.createQuery("FROM Servicios",Servicios.class).getResultList();
		tx.commit();
		return servicios; 		
	}

	public Servicios findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Servicios servicio=sesion.createQuery("FROM Servicios where idServicio=:id",Servicios.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return servicio; 
	}

	public void update(Servicios t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Servicio actualizado correctamente con el id: "+t.getIdServicio());
		tx.commit();
	}

	public void delete(Servicios t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Servicio eliminado correctamente con el id: "+t.getIdServicio());
		tx.commit();
	}

}
