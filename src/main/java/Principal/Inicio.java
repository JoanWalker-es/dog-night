package Principal;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Mascota;
import modelo.MascotaDao;
import modelo.Servicios;
import modelo.ServiciosDao;
import vista.Calendario;
import vista.Consulta_cliente;
import vista.Consulta_mascota;
import vista.Datos_alimentos;
import vista.Datos_medicos;
import vista.Eliminar_reserva;
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
		
		//crearPrecios(sesion);	
		//crearMascotas(sesion);
		//crearClientes(sesion);
		
		Ventana_principal nueva=new Ventana_principal();
		nueva.setVisible(true);		
		
		sesion.close();			
		
		System.out.println("Finalizando configuracion Hibernate");
	}
	
	public static void crearPrecios(Session sesion) {
		ServiciosDao oper_serv=new ServiciosDao(sesion);
		
		Servicios general=new Servicios();
		general.setNombre("General");
		general.setPrecio(25);
		general.setDescripcion("Estancia de una noche en el hotel Dog-Night.");
		oper_serv.save(general);
		
		Servicios peluqueria=new Servicios();
		peluqueria.setNombre("Peluqueria");
		peluqueria.setPrecio(10);
		peluqueria.setDescripcion("Corte de pelo canino con posterior baño y suavizante.");
		oper_serv.save(peluqueria);
		
		Servicios alimentos=new Servicios();
		alimentos.setNombre("Alimentación");
		alimentos.setPrecio(15);
		alimentos.setDescripcion("Alimentación diaria de la mascota con los mejores piensos del mercado.");
		oper_serv.save(alimentos);
		
		Servicios socios=new Servicios();
		socios.setNombre("Socios");
		socios.setPrecio(20);
		socios.setDescripcion("Estancia de una noche en el hotel Dog-Night para socios.");		
		oper_serv.save(socios);	
	}
	
	public static void crearClientes(Session sesion) {
		ClienteDao clienteDao = new ClienteDao(sesion);
		
		Cliente uno=new Cliente();
		uno.setNombre("Juan");
		uno.setApellidos("De la Rubia Jiménez");
		uno.setCorreo("juandelarubia@msn.com");
		uno.setTelefono("600634605");
		uno.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		uno.setDNI("74891618F");
		clienteDao.save(uno);
		
		Cliente dos=new Cliente();
		dos.setNombre("Mónica");
		dos.setApellidos("Iniesta Calero");
		dos.setCorreo("monica_ic_fb@hotmail.com");
		dos.setTelefono("666219105");
		dos.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		dos.setDNI("47098448Z");
		clienteDao.save(dos);
		
		Cliente tres=new Cliente();
		tres.setNombre("Paula");
		tres.setApellidos("De la Rubia Iniesta");
		tres.setCorreo("no tiene");
		tres.setTelefono("no tiene");
		tres.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		tres.setDNI("no tiene");
		clienteDao.save(tres);
		
	}
	
	public static void crearMascotas(Session sesion) {
		MascotaDao mascotaDao=new MascotaDao(sesion);
		
		Mascota uno=new Mascota();
		uno.setNombre("Kala");
		uno.setRaza("Braco de Weimar");
		mascotaDao.save(uno);
		
		Mascota dos=new Mascota();
		dos.setNombre("Espartaco");
		dos.setRaza("Persa mezcla");
		mascotaDao.save(dos);
		
		Mascota tres=new Mascota();
		tres.setNombre("Roma");
		tres.setRaza("Golden");
		mascotaDao.save(tres);		
		
	}


}
