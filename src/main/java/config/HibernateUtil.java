package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de devolver una instancia de SessionFactory de Hibernate
 *
 */
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory=new Configuration().configure().buildSessionFactory();
			
		}catch(Throwable ex) {
			System.err.println("Error al crear la configuración de Hibernate "+ex.getMessage());
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory get() {
		return sessionFactory;
	}

}
