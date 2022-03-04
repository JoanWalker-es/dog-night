package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDao implements CRUD<Cliente> {
	
	private static Session session;
	
	public ClienteDao(Session session) {
		this.session=session;
	}

	public void save(Cliente t) {
		Transaction tx=session.beginTransaction();
		session.save(t);
		System.out.println("Cliente guardado correctamente con el id: "+t.getId());
		tx.commit();
	}

	public List<Cliente> findAll() {
		Transaction tx=session.beginTransaction();
		List<Cliente> clientes=session.createQuery("FROM Cliente",Cliente.class).getResultList();
		tx.commit();
		return clientes; 
	}

	public Cliente findOneById(long id) {
		Transaction tx=session.beginTransaction();
		Cliente cliente=session.createQuery("FROM Cliente where idCliente=:id",Cliente.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return cliente; 
	}

	public void update(Cliente t) {
		Transaction tx=session.beginTransaction();
		session.update(t);
		System.out.println("Cliente actualizado correctamente con el id: "+t.getId());
		tx.commit();			
	}

	public void delete(Cliente t) {
		Transaction tx=session.beginTransaction();
		session.delete(t);
		System.out.println("Cliente eliminado correctamente con el id: "+t.getId());
		tx.commit();
	}

}
