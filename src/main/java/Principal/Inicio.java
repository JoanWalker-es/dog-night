package Principal;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteRepository;
import modelo.Hotel;
import modelo.HotelRepository;
import modelo.Mascota;
import modelo.MascotaRepository;
import modelo.Servicios;
import modelo.ServiciosRepository;
import vista.Ventana_principal;

public class Inicio {
	
	public static Session sesion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando configuracion Hibernate");		
		sesion=HibernateUtil.get().openSession(); 
		
		//crearDatos(sesion);		
		
		Ventana_principal nueva=new Ventana_principal();
		nueva.setVisible(true);		
		
				
		
		System.out.println("Finalizando configuracion Hibernate");
	}
	
	public static void crearDatos(Session sesion) {
		ClienteRepository clienteDao = new ClienteRepository(sesion);		
		MascotaRepository mascotaDao=new MascotaRepository(sesion);
		ServiciosRepository oper_serv=new ServiciosRepository(sesion);
		HotelRepository hotelDao=new HotelRepository(sesion);
		
		Hotel dog_night=new Hotel();
		dog_night.setNombre("Dog-Night");
		dog_night.setHabitaciones(10);
		hotelDao.save(dog_night);
		
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
		
		Mascota mUno=new Mascota();
		mUno.setNombre("Kala");
		mUno.setRaza("Braco de Weimar");
		mascotaDao.save(mUno);
		
		Mascota mDos=new Mascota();
		mDos.setNombre("Espartaco");
		mDos.setRaza("Persa mezcla");
		mascotaDao.save(mDos);
		
		Mascota mTres=new Mascota();
		mTres.setNombre("Roma");
		mTres.setRaza("Golden");
		mascotaDao.save(mTres);				

		Cliente uno=new Cliente();
		uno.setNombre("Juan");
		uno.setApellidos("De la Rubia Jiménez");
		uno.setCorreo("juandelarubia@msn.com");
		uno.setTelefono("600634605");
		uno.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		uno.setDNI("74891618F");
		uno.getMascotas().add(mUno);
		clienteDao.save(uno);
		
		Cliente dos=new Cliente();
		dos.setNombre("Mónica");
		dos.setApellidos("Iniesta Calero");
		dos.setCorreo("monica_ic_fb@hotmail.com");
		dos.setTelefono("666219105");
		dos.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		dos.setDNI("47098448Z");
		dos.getMascotas().add(mDos);
		clienteDao.save(dos);
		
		Cliente tres=new Cliente();
		tres.setNombre("Paula");
		tres.setApellidos("De la Rubia Iniesta");
		tres.setCorreo("no tiene");
		tres.setTelefono("no tiene");
		tres.setDireccion("Calle Los Robles, 12, Casarrubios del Monte");
		tres.setDNI("no tiene");
		tres.getMascotas().add(mTres);
		clienteDao.save(tres);
		
		
		
	}


}
