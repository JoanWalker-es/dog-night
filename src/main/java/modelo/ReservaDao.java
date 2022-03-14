package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class ReservaDao implements CRUD<Reserva> {
	
//	private Session session;
//
//	public ReservaDao(Session session) {
//		this.session=session;
//	}

	public void save(Reserva t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Reserva guardada correctamente con el id: "+t.getCodigo());
		tx.commit();	
		sesion.close();
	}

	public List<Reserva> findAll() {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		List<Reserva> reservas=sesion.createQuery("FROM Reserva",Reserva.class).getResultList();
		tx.commit();
		sesion.close();
		return reservas; 
	}

	public Reserva findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Reserva reserva=sesion.createQuery("FROM Reserva where codigo=:id",Reserva.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return reserva; 
	}

	public void update(Reserva t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Reserva actualizada correctamente con el id: "+t.getCodigo());
		tx.commit();
		sesion.close();
	}
	
	public void saveOrUpdate(Reserva t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.saveOrUpdate(t);
		System.out.println("Reserva actualizada correctamente con el id: "+t.getCodigo());
		tx.commit();
		sesion.close();
	}

	public void delete(Reserva t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Reserva eliminada correctamente con el id: "+t.getCodigo());
		tx.commit();
		sesion.close();
	}

}
