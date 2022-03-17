package controlador;

import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.List;

import org.hibernate.Session;

import Principal.Inicio;
import config.HibernateUtil;
import modelo.*;
import vista.*;

public class Eventos_precios extends WindowAdapter implements ActionListener{
	
	private Precios ventana_precios;
	private ServiciosDao servicioDao;
	private HotelDao hotelDao;
	private Session sesion;
	
	public Eventos_precios(Precios ventana) {
		this.ventana_precios=ventana;
		sesion=Inicio.sesion;
		servicioDao=new ServiciosDao(sesion);
		hotelDao=new HotelDao(sesion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_precios.getBtn_atras()) {
			ventana_precios.dispose();
		}else if(e.getSource()==ventana_precios.getBtn_guardar()) {	
			
			Servicios general=servicioDao.findOneById(1);
			general.setPrecio(Double.parseDouble(ventana_precios.getTf_general().getText()));
			Servicios peluqueria=servicioDao.findOneById(2);
			peluqueria.setPrecio(Double.parseDouble(ventana_precios.getTf_peluqueria().getText()));
			Servicios alimentos=servicioDao.findOneById(3);
			alimentos.setPrecio(Double.parseDouble(ventana_precios.getTf_alimentos().getText()));
			Servicios socios=servicioDao.findOneById(4);
			socios.setPrecio(Double.parseDouble(ventana_precios.getTf_socios().getText()));			
			Hotel nuevo=hotelDao.findOneById(1);
			nuevo.setHabitaciones(Integer.parseInt(ventana_precios.getTf_habitaciones().getText()));
						
			try {
				servicioDao.update(general);
				servicioDao.update(peluqueria);
				servicioDao.update(alimentos);
				servicioDao.update(socios);			
				hotelDao.update(nuevo);
			}catch(Exception ex) {
				new Ventana_error(ventana_precios,true).setVisible(true);
			}
				
		}
		
	}		

	@Override
	public void windowOpened(WindowEvent e) {
		cargarPrecios();		
	}
	
	private void cargarPrecios() {
		
		ventana_precios.getTf_general().setText(String.format("%.2f", servicioDao.findOneById(1).getPrecio())); 
		ventana_precios.getTf_peluqueria().setText(Double.toString(servicioDao.findOneById(2).getPrecio()));
		ventana_precios.getTf_alimentos().setText(Double.toString(servicioDao.findOneById(3).getPrecio()));
		ventana_precios.getTf_socios().setText(Double.toString(servicioDao.findOneById(4).getPrecio()));
		ventana_precios.getTf_habitaciones().setText(hotelDao.findOneById(1).getHabitaciones()+"");
	}

	
}
