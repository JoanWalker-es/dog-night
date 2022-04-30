package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Historial_alimenticio;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos del historial
 * alimenticio de las mascotas en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 * Implementa todos los m�todos de la interfaz Repository.
 */

public class HAlimenticioRepository implements Repository<Historial_alimenticio> {
	
	private Session sesion;
	
	public HAlimenticioRepository(Session session) {
		this.sesion=session;
	}

	public void save(Historial_alimenticio t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Historial alimenticio guardado correctamente con id: "+t.getId());
		tx.commit();	
	}

	public Historial_alimenticio findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Historial_alimenticio alimentos=sesion.createQuery("FROM historial_alimenticio where idPerro=:id",Historial_alimenticio.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return alimentos; 
	}

	public void update(Historial_alimenticio t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Historial alimenticio actualizado correctamente con id: "+t.getId());
		tx.commit();	
	}

	public void delete(Historial_alimenticio t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Historial alimenticio eliminado correctamente con id: "+t.getId());
		tx.commit();	
	}

	public List<Historial_alimenticio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
