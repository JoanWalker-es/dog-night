package modeloRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Cliente;

/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que implementa la interfaz Repository con métodos 
 * para persistir los datos de los clientes a través de 
 * Hibernate en la base de datos.
 */
public class ClienteRepository implements Repository<Cliente> {
	
	private Session sesion;
	
	public ClienteRepository(Session session) {
		this.sesion=session;
	}

	/**
	 * Método para guardar clientes.
	 */
	public void save(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.save(t);
		System.out.println("Cliente guardado correctamente con el id: "+t.getId());
		tx.commit();
	}

	/**
	 * Método para extraer todos los clientes.
	 */
	public List<Cliente> findAll() {
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente",Cliente.class).getResultList();
		tx.commit();
		return clientes; 
	}

	/**
	 * Método para extraer un único cliente mediante su
	 * id.
	 */
	public Cliente findOneById(long id) {
		Transaction tx=sesion.beginTransaction();
		Cliente cliente=sesion.createQuery("FROM Cliente where idCliente=:id",Cliente.class).setParameter("id", id).getSingleResult();
		tx.commit();
		return cliente; 
	}

	/**
	 * Método para actualizar los datos de un cliente.
	 */
	public void update(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.update(t);
		System.out.println("Cliente actualizado correctamente con el id: "+t.getId());
		tx.commit();		
	}

	/**
	 * Método para eliminar un cliente.
	 */
	public void delete(Cliente t) {
		Transaction tx=sesion.beginTransaction();
		sesion.delete(t);
		System.out.println("Cliente eliminado correctamente con el id: "+t.getId());
		tx.commit();
	}
	
	/**
	 * Método para buscar un cliente mediante las coincidencias del
	 * String que introduce el usuario. Si los datos que introduce 
	 * están en los campos de nombre o apellidos se devuelve un
	 * listado con los clientes que lo incluyen.
	 * @param nombre
	 * @return
	 */
	public List<Cliente> like(String nombre) {
		Transaction tx=sesion.beginTransaction();
		List<Cliente> clientes=sesion.createQuery("FROM Cliente WHERE CONCAT( Nombre,  ' ', Apellidos ) LIKE  :n",Cliente.class).setParameter("n","%" + nombre + "%").getResultList();	
		tx.commit();
		return clientes; 
	}

}
