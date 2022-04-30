package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Eliminar_reserva;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * eliminar reserva.
 *
 */
public class Eventos_eliminar_reserva implements ActionListener{

	private Eliminar_reserva ventana;
	public static boolean eliminar;
	
	public Eventos_eliminar_reserva(Eliminar_reserva ventana) {
		this.ventana=ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_aceptar()) {
			eliminar=true;
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_cancelar()) {
			eliminar=false;
			ventana.dispose();
		}
	}

}
