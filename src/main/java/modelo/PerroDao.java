package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PerroDao implements CRUD<Perro> {
	
	private Session session;

	public PerroDao(Session session) {
		this.session=session;
	}

	public void save(Perro t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Perro guardado correctamente con el id: "+t.getIdPerro());
		tx.commit();		
	}

	public List<Perro> findAll() {
		Transaction tx=session.beginTransaction();
		List<Perro> perros=session.createQuery("FROM perro",Perro.class).getResultList();
		tx.commit();
		return perros; 
	}

	public Perro findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Perro perro=session.createQuery("FROM perro where idPerro=:id",Perro.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return perro; 
	}

	public void update(Perro t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Perro actualizado correctamente con el id: "+t.getIdPerro());
		tx.commit();			
	}

	public void delete(Perro t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Perro eliminado correctamente con el id: "+t.getIdPerro());
		tx.commit();
	}

}
