package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MascotaDao implements CRUD<Mascota> {
	
	private Session session;

	public MascotaDao(Session session) {
		this.session=session;
	}

	public void save(Mascota t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Perro guardado correctamente con el id: "+t.getIdPerro());
		tx.commit();		
	}

	public List<Mascota> findAll() {
		Transaction tx=session.beginTransaction();
		List<Mascota> perros=session.createQuery("FROM Mascota",Mascota.class).getResultList();
		tx.commit();
		return perros; 
	}

	public Mascota findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Mascota perro=session.createQuery("FROM Mascota where idPerro=:id",Mascota.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return perro; 
	}

	public void update(Mascota t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Perro actualizado correctamente con el id: "+t.getIdPerro());
		tx.commit();			
	}

	public void delete(Mascota t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Perro eliminado correctamente con el id: "+t.getIdPerro());
		tx.commit();
	}

}
