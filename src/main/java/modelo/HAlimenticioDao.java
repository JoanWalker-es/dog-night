package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HAlimenticioDao implements CRUD<Historial_alimenticio> {
	
	private static Session session;
	
	public HAlimenticioDao(Session session) {
		this.session=session;
	}

	public void save(Historial_alimenticio t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Historial alimenticio guardado correctamente con id: "+t.getId());
		tx.commit();		
	}

	public Historial_alimenticio findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Historial_alimenticio alimentos=session.createQuery("FROM historial_alimenticio where idPerro=:id",Historial_alimenticio.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return alimentos; 
	}

	public void update(Historial_alimenticio t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Historial alimenticio actualizado correctamente con id: "+t.getId());
		tx.commit();		
	}

	public void delete(Historial_alimenticio t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Historial alimenticio eliminado correctamente con id: "+t.getId());
		tx.commit();			
	}

	public List<Historial_alimenticio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
