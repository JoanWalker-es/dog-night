package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class HMedicoDao implements CRUD<Historial_medico> {

//	private static Session sesion;
//
//	public HMedicoDao(Session session) {
//		this.sesion=session;
//	}

	public void save(Historial_medico t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Historial medico guardado correctamente con id: "+t.getId());
		tx.commit();		
		sesion.close();
	}

	public Historial_medico findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Historial_medico medico=sesion.createQuery("FROM Historial_medico where idPerro=:id",Historial_medico.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return medico; 
	}

	public void update(Historial_medico t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Historial medico actualizado correctamente con id: "+t.getId());
		tx.commit();		
		sesion.close();
	}

	public void delete(Historial_medico t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Historial medico eliminado correctamente con id: "+t.getId());
		tx.commit();	
		sesion.close();
	}

	@Override
	public List<Historial_medico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
