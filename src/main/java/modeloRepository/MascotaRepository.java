package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Mascota;

/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos de
 * las mascotas en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 * Implementa todos los métodos de la interfaz Repository.
 */
public class MascotaRepository implements Repository<Mascota> {
	
	private Session sesion;

	public MascotaRepository(Session session) {
		this.sesion=session;
	}

	public void save(Mascota t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Mascota guardado correctamente con el id: "+t.getIdMascota());
		tx.commit();	
	}

	public List<Mascota> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Mascota> perros=sesion.createQuery("FROM Mascota",Mascota.class).getResultList();
		tx.commit();
		return perros; 
	}

	public Mascota findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Mascota perro=sesion.createQuery("FROM Mascota where idMascota=:id",Mascota.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return perro; 
	}

	public void update(Mascota t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Mascota actualizado correctamente con el id: "+t.getIdMascota());
		tx.commit();		
	}

	public void delete(Mascota t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Mascota eliminado correctamente con el id: "+t.getIdMascota());
		tx.commit();
	}

}
