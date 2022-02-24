package Principal;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando configuracion Hibernate");		
		Session sesion=HibernateUtil.get().openSession();
		
		ClienteDao dao=new ClienteDao(sesion);
		
		//Cliente nuevo=new Cliente();
		//nuevo.setNombre("Juan de dios");
		
		//dao.save(nuevo);
		System.out.println(dao.findAll());
		
		
		
		
		
		
		sesion.close();
		
		System.out.println("Finalizando configuracion Hibernate");
	}

}
