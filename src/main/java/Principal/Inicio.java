package Principal;

import org.hibernate.Session;

import config.HibernateUtil;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando configuracion Hibernate");
		
		Session sesion=HibernateUtil.get().openSession();
		
		//TODO A�adir la l�gica
		
		sesion.close();
		
		System.out.println("Finalizando configuracion Hibernate");
	}

}
