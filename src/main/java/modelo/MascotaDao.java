package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class MascotaDao implements CRUD<Mascota> {
	
	private Session sesion;

	public MascotaDao(Session session) {
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
