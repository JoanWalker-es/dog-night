package Principal;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Servicios;
import modelo.ServiciosDao;
import vista.Calendario;
import vista.Consulta_cliente;
import vista.Consulta_mascota;
import vista.Datos_alimentos;
import vista.Datos_medicos;
import vista.Eliminar_reserva;
import vista.Guardado_ok;
import vista.Precios;
import vista.Registro_cliente;
import vista.Registro_mascota;
import vista.Reserva_creada;
import vista.Reservas;
import vista.Crear_reserva;
import vista.Seleccion_cliente;
import vista.Ventana_principal;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando configuracion Hibernate");		
		Session sesion=HibernateUtil.get().openSession(); 
		
				
//		ServiciosDao oper_serv=new ServiciosDao(sesion);
//		
//		Servicios general=new Servicios();
//		general.setNombre("Estancia general");
//		general.setPrecio(25);
//		general.setDescripcion("Estancia de una noche en el hotel Dog-Night.");
//		oper_serv.save(general);
//		
//		Servicios peluqueria=new Servicios();
//		peluqueria.setNombre("Servicio peluqueria");
//		peluqueria.setPrecio(10);
//		peluqueria.setDescripcion("Corte de pelo canino con posterior baño y suavizante.");
//		oper_serv.save(peluqueria);
//		
//		Servicios alimentos=new Servicios();
//		alimentos.setNombre("Servicio alimentación");
//		alimentos.setPrecio(15);
//		alimentos.setDescripcion("Alimentación diaria de la mascota con los mejores piensos del mercado.");
//		oper_serv.save(alimentos);
//		
//		Servicios socios=new Servicios();
//		socios.setNombre("Estancia socios");
//		socios.setPrecio(20);
//		socios.setDescripcion("Estancia de una noche en el hotel Dog-Night para socios.");		
//		oper_serv.save(socios);		
		
		
		Ventana_principal nueva=new Ventana_principal();
		nueva.setVisible(true);
		
		
		
		sesion.close();	
		
		
		
		System.out.println("Finalizando configuracion Hibernate");
	}

}
