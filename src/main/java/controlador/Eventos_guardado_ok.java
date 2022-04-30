package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana_guardado_ok;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * guardado de datos correcto.
 *
 */
public class Eventos_guardado_ok implements ActionListener{

	private Ventana_guardado_ok ventana;
	
	public Eventos_guardado_ok(Ventana_guardado_ok ventana) {
		this.ventana=ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.dispose();		
	}

}
