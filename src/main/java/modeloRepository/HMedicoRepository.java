package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Historial_medico;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos del historial
 * médico de las mascotas en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 * Implementa todos los métodos de la interfaz Repository.
 */

public class HMedicoRepository implements Repository<Historial_medico> {

	private Session sesion;

	public HMedicoRepository(Session session) {
		this.sesion=session;
	}

	public void save(Historial_medico t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Historial medico guardado correctamente con id: "+t.getId());
		tx.commit();	
	}

	public Historial_medico findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Historial_medico medico=sesion.createQuery("FROM Historial_medico where idPerro=:id",Historial_medico.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return medico; 
	}

	public void update(Historial_medico t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Historial medico actualizado correctamente con id: "+t.getId());
		tx.commit();		
	}

	public void delete(Historial_medico t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Historial medico eliminado correctamente con id: "+t.getId());
		tx.commit();	
	}

	@Override
	public List<Historial_medico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
