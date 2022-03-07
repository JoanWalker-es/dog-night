package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import modelo.ClienteDao;
import modelo.Reserva;
import modelo.ReservaDao;
import modelo.Servicios;
import modelo.ServiciosDao;
import vista.Crear_reserva;
import vista.Reserva_creada;
import vista.Ventana_error;
import vista.Ventana_error_fechas;

public class Eventos_crear_reserva implements ActionListener{

	private Crear_reserva ventana;
	private Session sesion;
	private ReservaDao reservaDao;
	private ServiciosDao serviciosDao;
	private ClienteDao clienteDao;
	private List<Reserva> reservas=new ArrayList<Reserva>();
	public static Reserva reserva;
	
	public Eventos_crear_reserva(Crear_reserva ventana) {
		this.ventana=ventana;
		sesion=Eventos_reservas.sesion;
		reservaDao=new ReservaDao(sesion);
		serviciosDao=new ServiciosDao(sesion);
		clienteDao=new ClienteDao(sesion);				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_cancelar()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_registrar()) {		
			
			if(ventana.getJdate_llegada().getDate()==null || ventana.getJdate_salida().getDate()==null) {
				new Ventana_error_fechas(ventana,true).setVisible(true);						
			}else if(diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate())<0) {
				new Ventana_error_fechas(ventana,true).setVisible(true);
			}else {			

				reserva=new Reserva();
				reserva.setFecha_inicio(new java.sql.Date(ventana.getJdate_llegada().getDate().getTime()));
				reserva.setFecha_fin(new java.sql.Date(ventana.getJdate_salida().getDate().getTime()));
				reserva.setComentarios(ventana.getTa_comentarios().getText());
				reserva.setPeluqueria(ventana.getCbox_peluqueria().isSelected());
				reserva.setAlimentos(ventana.getCbox_alimentos().isSelected());
				ventana.getTf_precio().setText(Double.toString(total()));
				reserva.setTotal(Double.parseDouble(ventana.getTf_precio().getText()));
				ventana.getTf_reserva_total_dias().setText(""+diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate()));
				reservas.add(reserva);
				Eventos_reservas.cliente.setReservas(reservas);						
				
				try {
					reservaDao.save(reserva);
					clienteDao.update(Eventos_reservas.cliente);
					new Reserva_creada(ventana,true).setVisible(true);
					ventana.getBtn_registrar().setEnabled(false);
					ventana.getTa_comentarios().setEnabled(false);
					ventana.getJdate_llegada().setEnabled(false);
					ventana.getJdate_salida().setEnabled(false);
					ventana.getCbox_socio().setEnabled(false);
					ventana.getCbox_peluqueria().setEnabled(false);
					ventana.getCbox_alimentos().setEnabled(false);

				}catch(Exception ex) {					
					new Ventana_error(ventana,true).setVisible(true);					
				}
			}
		}
		
	}
	
	private double total() {
		double total=0;
		double precio=0;
		Servicios general=serviciosDao.findOneById(1);
		Servicios peluqueria=serviciosDao.findOneById(2);
		Servicios alimentos=serviciosDao.findOneById(3);
		Servicios socios=serviciosDao.findOneById(4);		
		
		long fechas=diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate());
		
		boolean peluqueriaSeleccionada=ventana.getCbox_peluqueria().isSelected();
		boolean alimentosSeleccionado=ventana.getCbox_alimentos().isSelected();
		
		if(ventana.getCbox_socio().isSelected()) {
			precio=socios.getPrecio();
		}else {
			precio=general.getPrecio();
		}
				
		if(peluqueriaSeleccionada && alimentosSeleccionado) {
			total=(fechas*(precio+alimentos.getPrecio()))+peluqueria.getPrecio();
		}else if(peluqueriaSeleccionada && !alimentosSeleccionado) {
			total=(fechas*(precio))+peluqueria.getPrecio();
		}else if(!peluqueriaSeleccionada && alimentosSeleccionado) {
			total=(fechas*(precio+alimentos.getPrecio()));
		}else {
			total=fechas*precio;
		}
		return total;
	}
	
	public static long diasEntreFechas(java.util.Date fechaInicio, java.util.Date fechaFin){
	     long inicio = fechaInicio.getTime() ;
	     long fin = fechaFin.getTime();
	     long diasDesde = (long) Math.floor(inicio / (1000*60*60*24)); 
	     long diasHasta = (long) Math.floor(fin / (1000*60*60*24)); 
	     long dias = diasHasta - diasDesde;

	     return dias;
	}

}
