package controlador;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.internal.build.AllowSysOut;

import Principal.Inicio;
import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Mascota;
import modelo.Reserva;
import modelo.ReservaDao;
import modelo.Servicios;
import modelo.ServiciosDao;
import vista.Crear_reserva;
import vista.Reserva_creada;
import vista.Ventana_error;

public class Eventos_crear_reserva extends WindowAdapter implements ActionListener{

	private Crear_reserva ventana;
	private ReservaDao reservaDao;
	private ServiciosDao serviciosDao;
	private ClienteDao clienteDao;
	public static Reserva reserva;
	private Cliente cliente;
	private List<Servicios> servicios=new ArrayList<Servicios>();
	private Servicios general;
	private Servicios peluqueria;
	private Servicios alimentos;
	private Servicios socios;
	public static String mensaje;
	private Calendar calendario;
	private Session sesion;
	
	
	public Eventos_crear_reserva(Crear_reserva ventana) {

		this.ventana=ventana;
		sesion=Inicio.sesion;
		reservaDao=new ReservaDao(sesion);
		serviciosDao=new ServiciosDao(sesion);
		clienteDao=new ClienteDao(sesion);			

		calendario=Calendar.getInstance();
		if(Eventos_consulta_cliente.consulta) {
			cliente=Eventos_consulta_cliente.cliente;
		}else {
			cliente=Eventos_reservas.cliente;			
		}		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_cancelar()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_registrar()) {		
			
			if(ventana.getJdate_llegada().getDate()==null || ventana.getJdate_salida().getDate()==null) {
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>DEBE SELECCIONAR LAS FECHAS</center><br><center>DE LLEGADA Y SALIDA</center></body></html>";				
				new Ventana_error(ventana,true).setVisible(true);						
			}else if(diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate())<0) {
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>LA FECHA DE LLEGADA DEBE SER</center><br><center>ANTERIOR A LA DE SALIDA</center></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else if(ventana.getJdate_llegada().getDate().getTime()<calendario.getTime().getTime()) {
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>LA FECHA DE LLEGADA DEBE SER</center><br><center>POSTERIOR AL DÍA DE HOY</center></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else if(ventana.getList_mascotas().isSelectionEmpty()){
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>DEBE SELECCIONAR UNA MASCOTA</center><br></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else {		
				List<Mascota> mascotas=ventana.getList_mascotas().getSelectedValuesList();				
			
				reserva.setNum_mascotas(mascotas.size());
				reserva.setFecha_inicio(new java.sql.Date(ventana.getJdate_llegada().getDate().getTime()));
				reserva.setFecha_fin(new java.sql.Date(ventana.getJdate_salida().getDate().getTime()));
				reserva.setComentarios(ventana.getTa_comentarios().getText());					
				ventana.getTf_precio().setText(Double.toString(total()));				
				reserva.setTotal(Double.parseDouble(ventana.getTf_precio().getText()));
				ventana.getTf_reserva_total_dias().setText(""+diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate()));
				
				reserva.setServicios(serviciosSeleccion(servicios));								
				
				reserva.setCliente(cliente);
				cliente.addReserva(reserva);
				
				try {

					if(Eventos_reservas.modificar) {
						reservaDao.update(reserva);						
					}else {
						reservaDao.save(reserva);
					}					

					clienteDao.update(cliente);
					new Reserva_creada(ventana,true).setVisible(true);
					ventana.getBtn_registrar().setEnabled(false);
					ventana.getTa_comentarios().setEnabled(false);
					ventana.getJdate_llegada().setEnabled(false);
					ventana.getJdate_salida().setEnabled(false);
					ventana.getCbox_socio().setEnabled(false);
					ventana.getCbox_peluqueria().setEnabled(false);
					ventana.getCbox_alimentos().setEnabled(false);

				}catch(Exception ex) {	
					mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center></body></html>";
					new Ventana_error(ventana,true).setVisible(true);					
					ex.printStackTrace();
				}
			}
		}
		
	}	
	
	public void windowOpened(WindowEvent e) {		
		if(Eventos_reservas.modificar) {
			reserva=Eventos_reservas.reserva;
			rellenaDatos();
		}else {
			reserva=new Reserva();	
			for(Mascota m:cliente.getMascotas()) {
				ventana.getModelo().addElement(m);
			}
		}		
				
	}
	
	private void rellenaDatos() {		
		ventana.getJdate_llegada().setDate(reserva.getFecha_inicio());
		ventana.getJdate_salida().setDate(reserva.getFecha_fin());
		ventana.getTf_reserva_total_dias().setText(""+diasEntreFechas(reserva.getFecha_inicio(),reserva.getFecha_fin()));
		for(Mascota m:cliente.getMascotas()) {
			ventana.getModelo().addElement(m);
		}
		ventana.getTa_comentarios().setText(reserva.getComentarios());
		seleccionServicios(reserva.getServicios());
		ventana.getTf_precio().setText(Double.toString(reserva.getTotal()));
		
	}
	
	private void seleccionServicios(List<Servicios> servicios) {
		for(Servicios s:servicios) {
			if(s.getIdServicio()==2) {
				ventana.getCbox_peluqueria().setSelected(true);
			}else if(s.getIdServicio()==3) {
				ventana.getCbox_alimentos().setSelected(true);
			}else if(s.getIdServicio()==4) {
				ventana.getCbox_socio().setSelected(true);
			}
		}
		
	}
	
	
	private double total() {
		double total=0;
		double precio=0;	
		
		general=serviciosDao.findOneById(1);
		peluqueria=serviciosDao.findOneById(2);
		alimentos=serviciosDao.findOneById(3);
		socios=serviciosDao.findOneById(4);	
		
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
	
	private List<Servicios> serviciosSeleccion(List<Servicios> servicios){
		if(ventana.getCbox_peluqueria().isSelected()&&ventana.getCbox_alimentos().isSelected()&&ventana.getCbox_socio().isSelected()) {
			servicios.add(peluqueria);
			servicios.add(alimentos);
			servicios.add(socios);
		}else if(ventana.getCbox_peluqueria().isSelected()&&ventana.getCbox_alimentos().isSelected()&&!ventana.getCbox_socio().isSelected()) {
			servicios.add(peluqueria);
			servicios.add(alimentos);
			servicios.add(general);
		}else if(!ventana.getCbox_peluqueria().isSelected()&&ventana.getCbox_alimentos().isSelected()&&!ventana.getCbox_socio().isSelected()) {
			servicios.add(alimentos);
			servicios.add(general);
		}else if(ventana.getCbox_peluqueria().isSelected()&&!ventana.getCbox_alimentos().isSelected()&&!ventana.getCbox_socio().isSelected()) {
			servicios.add(peluqueria);
			servicios.add(general);
		}else if(!ventana.getCbox_peluqueria().isSelected()&&!ventana.getCbox_alimentos().isSelected()&&!ventana.getCbox_socio().isSelected()) {
			servicios.add(general);
		}else if(!ventana.getCbox_peluqueria().isSelected()&&!ventana.getCbox_alimentos().isSelected()&&ventana.getCbox_socio().isSelected()) {
			servicios.add(socios);
		}else if(ventana.getCbox_peluqueria().isSelected()&&!ventana.getCbox_alimentos().isSelected()&&ventana.getCbox_socio().isSelected()) {
			servicios.add(peluqueria);
			servicios.add(socios);
		}else if(!ventana.getCbox_peluqueria().isSelected()&&ventana.getCbox_alimentos().isSelected()&&ventana.getCbox_socio().isSelected()) {
			servicios.add(alimentos);
			servicios.add(socios);
		}		
		
		return servicios;
	}

}
