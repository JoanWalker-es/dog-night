package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana_error;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * ventana de error. Muestra al usuario los mensajes que provienen de distintas
 * partes de la aplicación.
 *
 */
public class Eventos_error implements ActionListener{

	private Ventana_error ventana;
	
	public Eventos_error(Ventana_error ventana) {
		this.ventana=ventana;
		if(!(Eventos_registro_mascota.mensaje==null)) {
			ventana.getL_error().setText(Eventos_registro_mascota.mensaje);
		}else if(!(Eventos_registro_cliente.mensaje==null)) {			
			ventana.getL_error().setText(Eventos_registro_cliente.mensaje);
		}else if(!(Eventos_crear_reserva.mensaje==null)) {
			ventana.getL_error().setText(Eventos_crear_reserva.mensaje);
		}else if(!(Eventos_reservas.mensaje==null)) {
			ventana.getL_error().setText(Eventos_reservas.mensaje);
		}else if(!(Eventos_seleccion_cliente.mensaje==null)) {
			ventana.getL_error().setText(Eventos_seleccion_cliente.mensaje);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.dispose();		
	}

}
