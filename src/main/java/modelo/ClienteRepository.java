package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.HibernateUtil;

public class ClienteRepository implements Repository<Cliente> {
	
	private static Session sesion;
	
	public ClienteRepository(Session session) {
		this.sesion=session;
	}

	public void save(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Cliente guardado correctamente con el id: "+t.getId());
		tx.commit();
	}

	public List<Cliente> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente",Cliente.class).getResultList();
		tx.commit();
		return clientes; 
	}

	public Cliente findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Cliente cliente=sesion.createQuery("FROM Cliente where idCliente=:id",Cliente.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return cliente; 
	}

	public void update(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Cliente actualizado correctamente con el id: "+t.getId());
		tx.commit();		
	}

	public void delete(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Cliente eliminado correctamente con el id: "+t.getId());
		tx.commit();
	}
	
	public List<Cliente> like(String nombre) {
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente WHERE CONCAT( Nombre,  ' ', Apellidos ) LIKE  :n",Cliente.class).setParameter("n","%" + nombre + "%").getResultList();	
		tx.commit();
		return clientes; 
	}

}
