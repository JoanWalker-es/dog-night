package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ReservaRepository implements Repository<Reserva> {
	
	private Session sesion;

	public ReservaRepository(Session session) {
		this.sesion=session;
	}

	public void save(Reserva t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Reserva guardada correctamente con el id: "+t.getCodigo());
		tx.commit();	
	}

	public List<Reserva> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Reserva> reservas=sesion.createQuery("FROM Reserva",Reserva.class).getResultList();
		tx.commit();
		return reservas; 
	}

	public Reserva findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Reserva reserva=sesion.createQuery("FROM Reserva where codigo=:id",Reserva.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return reserva; 
	}

	public void update(Reserva t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Reserva actualizada correctamente con el id: "+t.getCodigo());
		tx.commit();
	}
	
	public void saveOrUpdate(Reserva t) {
		Transaction tx=sesion.beginTransaction();
		sesion.saveOrUpdate(t);
		System.out.println("Reserva actualizada correctamente con el id: "+t.getCodigo());
		tx.commit();
	}

	public void delete(Reserva t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Reserva eliminada correctamente con el id: "+t.getCodigo());
		tx.commit();
	}
	
	

}
