package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ServiciosDao implements CRUD<Servicios>{

	private Session session;

	public ServiciosDao(Session session) {
		this.session=session;
	}

	public void save(Servicios t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Servicio guardado correctamente con el id: "+t.getIdServicio());
		tx.commit();		
	}

	public List<Servicios> findAll() {
		Transaction tx=session.beginTransaction();
		List<Servicios> servicios=session.createQuery("FROM servicios",Servicios.class).getResultList();
		tx.commit();
		return servicios; 
	}

	public Servicios findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Servicios servicio=session.createQuery("FROM servicios where idServicio=:id",Servicios.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return servicio; 
	}

	public void update(Servicios t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Servicio actualizado correctamente con el id: "+t.getIdServicio());
		tx.commit();
	}
	
//	public void updatePrecio(Servicios t,long id) {
//		Transaction tx=session.beginTransaction();
//		Servicios servicio=session.createQuery("FROM servicios where idServicio=:id",Servicios.class).setParameter("id",id).getSingleResult();
//		session.update(t);
//		System.out.println("Servicio actualizado correctamente con el id: "+t.getIdServicio());
//		tx.commit();
//	}

	public void delete(Servicios t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Servicio eliminado correctamente con el id: "+t.getIdServicio());
		tx.commit();
	}

}
