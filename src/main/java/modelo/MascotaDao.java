package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class MascotaDao implements CRUD<Mascota> {
	
//	private Session sesion;
//
//	public MascotaDao(Session session) {
//		this.sesion=session;
//	}

	public void save(Mascota t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Perro guardado correctamente con el id: "+t.getIdPerro());
		tx.commit();		
		sesion.close();
	}

	public List<Mascota> findAll() {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		List<Mascota> perros=sesion.createQuery("FROM perro",Mascota.class).getResultList();
		tx.commit();
		sesion.close();
		return perros; 
	}

	public Mascota findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Mascota perro=sesion.createQuery("FROM perro where idPerro=:id",Mascota.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return perro; 
	}

	public void update(Mascota t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Perro actualizado correctamente con el id: "+t.getIdPerro());
		tx.commit();		
		sesion.close();
	}

	public void delete(Mascota t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Perro eliminado correctamente con el id: "+t.getIdPerro());
		tx.commit();
		sesion.clear();
	}

}
