package controlador;

import java.awt.Color;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.*;
import org.hibernate.Session;
import Principal.Inicio;
import modelo.Hotel;
import modelo.Reserva;
import modeloRepository.HotelRepository;
import modeloRepository.ReservaRepository;
import vista.*;

/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la 
 * ventana de la interfaz Calendario reservas.
 *
 */

public class Eventos_calendario extends WindowAdapter implements ActionListener, PropertyChangeListener{
	
	private Calendario ventana_calendario;
	private ReservaRepository reservaDao;
	private HotelRepository hotelDao;
	private Session sesion;
	
	public Eventos_calendario(Calendario ventana) {
		this.ventana_calendario=ventana;
		sesion=Inicio.sesion;
		reservaDao=new ReservaRepository(sesion);
		hotelDao=new HotelRepository(sesion);
		
	}	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_calendario.getBtn_atras()) {
			ventana_calendario.dispose();
		}

	}

	public void windowOpened(WindowEvent e) {
		comprobarDia(ventana_calendario.getjCalendar().getDate());
	}


	/**
	 * M?todo sobreescrito que recoge un PropertyChangeEvent del 
	 * calendario.
	 */

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().compareTo("day") == 0) {
			comprobarDia(ventana_calendario.getjCalendar().getDate());
        }
	}
	
	/**
	 * M?todo que comprueba la fecha seleccionada del calendario para ver 
	 * los datos de las reservas que incluyan ese d?a. Si hay menos 
	 * mascotas en el hotel que habitaciones libres el color de fondo del recuadro
	 * de la disponibilidad aparecer? en verde, de lo contrario en rojo.
	 * @param dia
	 */
	
	private void comprobarDia(Date dia) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		int contador = 0;
		ventana_calendario.getTa_reservas().setText("");
		Hotel hotel = hotelDao.findOneById(1);

		try {
			List<Reserva> reservas = reservaDao.findAll();
			for (Reserva r : reservas) {
				List<Date> fechas = Metodos_utiles.getListaFechas(r.getFecha_inicio(), r.getFecha_fin());
				int indice = fechas.size() - 1;
				fechas.remove(indice);
				for (Date fecha : fechas) {
					String diaReserva = formato.format(fecha);
					if (diaReserva.equalsIgnoreCase(formato.format(dia))) {
						contador += r.getNum_mascotas();
						ventana_calendario.getTa_reservas()
								.append("C?digo reserva: " + r.getCodigo() + " Fecha inicio: "
										+ formato.format(r.getFecha_inicio()) + " Fecha fin: "
										+ formato.format(r.getFecha_fin()) + "\n");
					}
				}

			}

			if (contador >= hotel.getHabitaciones()) {
				ventana_calendario.getTf_mascotas().setBackground(Color.RED);
			} else {
				ventana_calendario.getTf_mascotas().setBackground(Color.GREEN);
			}

			ventana_calendario.getTf_mascotas().setText("" + contador);

		} catch (Exception e) {
			e.printStackTrace();
			new Ventana_error(ventana_calendario, true).setVisible(true);
		}

	}
	
        

}
