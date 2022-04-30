package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import vista.Reserva_creada;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * reserva creada.
 *
 */
public class Eventos_reserva_creada extends WindowAdapter implements ActionListener{

	private Reserva_creada ventana;
	
	public Eventos_reserva_creada(Reserva_creada ventana) {
		this.ventana=ventana;		
		if(Eventos_reservas.mensaje!=null) {
			ventana.getL_creada().setText(Eventos_reservas.mensaje);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		ventana.dispose();
	}
	
	public void windowOpened(WindowEvent e) {
		DecimalFormat formato = new DecimalFormat("0.00");
		ventana.getTf_inicio().setText(Eventos_crear_reserva.reserva.getFecha_inicio().toString());
		ventana.getTf_fin().setText(Eventos_crear_reserva.reserva.getFecha_fin().toString());
		ventana.getTf_total().setText(formato.format(Eventos_crear_reserva.reserva.getTotal()).replace(",","."));
		ventana.getTf_total_mascotas().setText(Eventos_crear_reserva.reserva.getNum_mascotas()+"");	
	}
	

}
