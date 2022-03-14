package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class ClienteDao implements CRUD<Cliente> {
	
//	private static Session sesion;
//	
//	public ClienteDao(Session session) {
//		this.sesion=session;
//	}

	public void save(Cliente t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Cliente guardado correctamente con el id: "+t.getId());
		tx.commit();
		sesion.close();
	}

	public List<Cliente> findAll() {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente",Cliente.class).getResultList();
		tx.commit();
		sesion.close();
		return clientes; 
	}

	public Cliente findOneById(long id) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		Cliente cliente=sesion.createQuery("FROM Cliente where idCliente=:id",Cliente.class).setParameter("id", id).getSingleResult();
		tx.commit();
		sesion.close();
		return cliente; 
	}

	public void update(Cliente t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Cliente actualizado correctamente con el id: "+t.getId());
		tx.commit();		
		sesion.close();
	}

	public void delete(Cliente t) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Cliente eliminado correctamente con el id: "+t.getId());
		tx.commit();
		sesion.close();
	}
	
	public List<Cliente> like(String nombre) {
		Session sesion=HibernateUtil.get().openSession();
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente WHERE CONCAT( Nombre,  ' ', Apellidos ) LIKE  :n",Cliente.class).setParameter("n","%" + nombre + "%").getResultList();	
		tx.commit();
		sesion.close();
		return clientes; 
	}

}
