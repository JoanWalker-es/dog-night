package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class HAlimenticioDao implements CRUD<Historial_alimenticio> {
	
//	private static Session sesion;
//	
//	public HAlimenticioDao(Session session) {
//		this.sesion=session;
//	}

	public void save(Historial_alimenticio t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Historial alimenticio guardado correctamente con id: "+t.getId());
		tx.commit();		
		sesion.close();
	}

	public Historial_alimenticio findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Historial_alimenticio alimentos=sesion.createQuery("FROM historial_alimenticio where idPerro=:id",Historial_alimenticio.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return alimentos; 
	}

	public void update(Historial_alimenticio t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Historial alimenticio actualizado correctamente con id: "+t.getId());
		tx.commit();	
		sesion.close();
	}

	public void delete(Historial_alimenticio t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Historial alimenticio eliminado correctamente con id: "+t.getId());
		tx.commit();	
		sesion.close();
	}

	public List<Historial_alimenticio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
