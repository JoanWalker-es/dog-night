package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class ServiciosDao implements CRUD<Servicios>{

//	private Session sesion;
//
//	public ServiciosDao(Session sesion) {
//		this.sesion=sesion;
//	}

	public void save(Servicios t) {
		Session sesion=HibernateUtil.get().openSession(); 
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Servicio guardado correctamente con el id: "+t.getIdServicio());
		tx.commit();	
		sesion.close();
	}

	public List<Servicios> findAll() {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		List<Servicios> servicios=sesion.createQuery("FROM Servicios",Servicios.class).getResultList();
		tx.commit();
		sesion.close();
		return servicios; 		
	}

	public Servicios findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Servicios servicio=sesion.createQuery("FROM Servicios where idServicio=:id",Servicios.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return servicio; 
	}

	public void update(Servicios t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Servicio actualizado correctamente con el id: "+t.getIdServicio());
		tx.commit();
		sesion.close();
	}

	public void delete(Servicios t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Servicio eliminado correctamente con el id: "+t.getIdServicio());
		tx.commit();
		sesion.close();
	}

}
