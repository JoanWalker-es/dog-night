package controlador;

import java.awt.event.*;
import java.text.DecimalFormat;
import org.hibernate.Session;
import Principal.Inicio;
import modelo.*;
import modeloRepository.HotelRepository;
import modeloRepository.ServiciosRepository;
import vista.*;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * Configuraci�n de precios.
 *
 */
public class Eventos_precios extends WindowAdapter implements ActionListener{
	
	private Precios ventana_precios;
	private ServiciosRepository servicioDao;
	private HotelRepository hotelDao;
	private Session sesion;
	
	public Eventos_precios(Precios ventana) {
		this.ventana_precios=ventana;
		sesion=Inicio.sesion;
		servicioDao=new ServiciosRepository(sesion);
		hotelDao=new HotelRepository(sesion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_precios.getBtn_atras()) {
			ventana_precios.dispose();
		}else if(e.getSource()==ventana_precios.getBtn_guardar()) {	
			
			try {
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

				servicioDao.update(general);
				servicioDao.update(peluqueria);
				servicioDao.update(alimentos);
				servicioDao.update(socios);			
				hotelDao.update(nuevo);
				new Ventana_guardado_ok(ventana_precios,true).setVisible(true);
			}catch(Exception ex) {
				new Ventana_error(ventana_precios,true).setVisible(true);
				ex.printStackTrace();
			}
				
		}
		
	}		

	@Override
	public void windowOpened(WindowEvent e) {
		cargarPrecios();		
	}
	
	/**
	 * M�todo que se encarga de cargar los precios y la disponibilidad en sus campos 
	 * correspondientes de la interfaz gr�fica. Tambi�n les da formato a los doubles 
	 * sacando s�lo dos decimales y mostrando . en vez de ,
	 */
	private void cargarPrecios() {
		DecimalFormat formato = new DecimalFormat("0.00");
		
		ventana_precios.getTf_general().setText(formato.format(servicioDao.findOneById(1).getPrecio()).replace(",", ".")); 
		ventana_precios.getTf_peluqueria().setText(formato.format(servicioDao.findOneById(2).getPrecio()).replace(",", "."));
		ventana_precios.getTf_alimentos().setText(formato.format(servicioDao.findOneById(3).getPrecio()).replace(",", "."));
		ventana_precios.getTf_socios().setText(formato.format(servicioDao.findOneById(4).getPrecio()).replace(",", "."));
		ventana_precios.getTf_habitaciones().setText(hotelDao.findOneById(1).getHabitaciones()+"");
	}

	
}
