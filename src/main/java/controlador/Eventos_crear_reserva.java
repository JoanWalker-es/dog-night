package controlador;

import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.hibernate.Session;
import Principal.Inicio;
import modelo.Cliente;
import modelo.Mascota;
import modelo.Reserva;
import modelo.Servicios;
import modeloRepository.ClienteRepository;
import modeloRepository.ReservaRepository;
import modeloRepository.ServiciosRepository;
import vista.Crear_reserva;
import vista.Reserva_creada;
import vista.Ventana_error;

/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * crear reserva.
 *
 */
public class Eventos_crear_reserva extends WindowAdapter implements ActionListener{

	private Crear_reserva ventana;
	private ReservaRepository reservaDao;
	private ServiciosRepository serviciosDao;
	private ClienteRepository clienteDao;
	public static Reserva reserva;
	private Cliente cliente;
	private List<Servicios> servicios=new ArrayList<Servicios>();
	private Servicios general;
	private Servicios peluqueria;
	private Servicios alimentos;
	private Servicios socios;
	public static String mensaje;
	private Session sesion;
	private boolean num_mascotas=true;
	
	
	public Eventos_crear_reserva(Crear_reserva ventana) {

		this.ventana=ventana;
		sesion=Inicio.sesion;
		reservaDao=new ReservaRepository(sesion);
		serviciosDao=new ServiciosRepository(sesion);
		clienteDao=new ClienteRepository(sesion);
		if(Eventos_consulta_cliente.consulta) {
			cliente=Eventos_consulta_cliente.cliente;
		}else {
			cliente=Eventos_reservas.cliente;			
		}		
	}
	
	/**
	 * Método sobreescrito de la interfaz ActionListener en el que recibimos un evento
	 * por parámetro y comprobamos su origen. Depende del origen, realizamos una acción 
	 * u otra. Aquí comprobamos que botón a clicado el usuario y dependiendo del botón
	 * haremos una acción.
	 * 
	 * Al botón el botón registrar hacemos una serie de comprobaciones que determinan si 
	 * lanzamos una ventana de error o no con un mensaje determinado.
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_cancelar()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_registrar()) {					
			LocalDate inicio=Metodos_utiles.convertToLocalDate(ventana.getJdate_llegada().getDate());
			LocalDate fin=Metodos_utiles.convertToLocalDate(ventana.getJdate_salida().getDate());			
			
			if(ventana.getJdate_llegada().getDate()==null || ventana.getJdate_salida().getDate()==null) {
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>DEBE SELECCIONAR LAS FECHAS</center><br><center>DE LLEGADA Y SALIDA</center></body></html>";				
				new Ventana_error(ventana,true).setVisible(true);						
			}else if(fin.isBefore(inicio)){				
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>LA FECHA DE LLEGADA DEBE SER</center><br><center>ANTERIOR A LA DE SALIDA</center></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else if(inicio.isBefore(LocalDate.now())){			
				mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center><br><center>LA FECHA DE LLEGADA DEBE SER</center><br><center>COMO MÍNIMO EL DÍA DE HOY</center></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else if(cliente.getMascotas().size()<1){
				mensaje="<html><body><center>EL CLIENTE NO TIENE NINGUNA</center><br><center>MASCOTA REGISTRADA</center><br></body></html>";
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
				ventana.getTf_precio().setText(Double.toString(total()*mascotas.size()));				
				reserva.setTotal(Double.parseDouble(ventana.getTf_precio().getText()));
				ventana.getTf_reserva_total_dias().setText(""+Metodos_utiles.diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate()));
				
				List<Date> fechas=Metodos_utiles.getListaFechas(reserva.getFecha_inicio(),reserva.getFecha_fin());
				Metodos_utiles metodo=new Metodos_utiles(ventana);
				for(Date f:fechas) {
					if(!metodo.comprobarDia(f)) {
						num_mascotas=false;
						break;
					}
				}
				
				if(num_mascotas) {
					reserva.setServicios(serviciosSeleccion(servicios));						
					reserva.setCliente(cliente);				
					
					try {										
						if(Eventos_reservas.modificar) {
							reservaDao.update(reserva);						
						}else {

							cliente.addReserva(reserva);
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
						ventana.getBtn_cancelar().setText("ATRAS");

					}catch(Exception ex) {	
						mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center></body></html>";
						new Ventana_error(ventana,true).setVisible(true);					
						ex.printStackTrace();
					}
				}else {
					mensaje="<html><body><center>NO HAY ESPACIO SUFICIENTE</center><br><center>EN EL HOTEL</center><br></body></html>";
					new Ventana_error(ventana,true).setVisible(true);
					num_mascotas=true;
				}
				
				
			}
		}
		
	}	
	
	public void windowOpened(WindowEvent e) {		
		if(Eventos_reservas.modificar) {
			ventana.setTitle("Modificar reserva");
			reserva=Eventos_reservas.reserva;
			rellenaDatos();
		}else {
			reserva=new Reserva();	
			for(Mascota m:cliente.getMascotas()) {
				ventana.getModelo().addElement(m);
			}
		}		
				
	}
	
	/**
	 * Método que se encarga de rellenar los datos de esta ventana
	 * dependiendo de si la hemos abierto para crear una nueva reserva 
	 * o estamos modificando una ya realizada.
	 */
	
	private void rellenaDatos() {		
		ventana.getJdate_llegada().setDate(reserva.getFecha_inicio());
		ventana.getJdate_salida().setDate(reserva.getFecha_fin());
		ventana.getTf_reserva_total_dias().setText(""+Metodos_utiles.diasEntreFechas(reserva.getFecha_inicio(),reserva.getFecha_fin()));
		for(Mascota m:cliente.getMascotas()) {
			ventana.getModelo().addElement(m);
		}
		ventana.getTa_comentarios().setText(reserva.getComentarios());
		seleccionServicios(reserva.getServicios());
		ventana.getTf_precio().setText(Double.toString(reserva.getTotal()));
		
	}
	
	/**
	 * Método que se encarga de marcar los servicios seleccionados cuando 
	 * cargamos una reserva de la base de datos para modificarla.
	 * @param servicios
	 */
	
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
	
	/**
	 * Método que devuelve el total de la reserva calculando los días
	 * y los servicios seleccionados.
	 * @return
	 */
	
	private double total() {
		double total=0;
		double precio=0;	
		
		try {
			general=serviciosDao.findOneById(1);
			peluqueria=serviciosDao.findOneById(2);
			alimentos=serviciosDao.findOneById(3);
			socios=serviciosDao.findOneById(4);
		}catch(Exception ex) {
			ex.printStackTrace();
			new Ventana_error(ventana,true).setVisible(true);
		}
			
		
		long fechas=Metodos_utiles.diasEntreFechas(ventana.getJdate_llegada().getDate(),ventana.getJdate_salida().getDate());
		
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
	
	/**
	 * Método que se encarga de setear los servicios seleccionados en la 
	 * creación o modificación de la reserva.
	 * @param servicios
	 * @return
	 */
	
	
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
