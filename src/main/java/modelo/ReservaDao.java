package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReservaDao implements CRUD<Reserva> {
	
	private Session session;

	public ReservaDao(Session session) {
		this.session=session;
	}

	public void save(Reserva t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Reserva guardada correctamente con el id: "+t.getCodigo());
		tx.commit();		
	}

	public List<Reserva> findAll() {
		Transaction tx=session.beginTransaction();
		List<Reserva> reservas=session.createQuery("FROM Reserva",Reserva.class).getResultList();
		tx.commit();
		return reservas; 
	}

	public Reserva findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Reserva reserva=session.createQuery("FROM Reserva where codigo=:id",Reserva.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return reserva; 
	}

	public void update(Reserva t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Reserva actualizada correctamente con el id: "+t.getCodigo());
		tx.commit();
	}

	public void delete(Reserva t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Reserva eliminada correctamente con el id: "+t.getCodigo());
		tx.commit();
	}

}
