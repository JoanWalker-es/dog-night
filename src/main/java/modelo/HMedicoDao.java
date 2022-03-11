package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HMedicoDao implements CRUD<Historial_medico> {

private static Session session;
	
	public HMedicoDao(Session session) {
		this.session=session;
	}

	public void save(Historial_medico t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Historial medico guardado correctamente con id: "+t.getId());
		tx.commit();				
	}

	public Historial_medico findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Historial_medico medico=session.createQuery("FROM Historial_medico where idPerro=:id",Historial_medico.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return medico; 
	}

	public void update(Historial_medico t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Historial medico actualizado correctamente con id: "+t.getId());
		tx.commit();		
	}

	public void delete(Historial_medico t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Historial medico eliminado correctamente con id: "+t.getId());
		tx.commit();			
	}

	public List<Historial_medico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
