package controlador;

import java.awt.event.*;

import Principal.Inicio;
import vista.*;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * principal.
 *
 */
public class Eventos_principal extends WindowAdapter implements ActionListener {
	
	private Ventana_principal ventana;
	
	
	public Eventos_principal(Ventana_principal ventana) {
		this.ventana=ventana;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ventana.getBtn_calendario()) {
			new Calendario(ventana,true).setVisible(true);
		}else if(e.getSource()==ventana.getBtn_precios()) {
			new Precios(ventana,true).setVisible(true);
		}else if(e.getSource()==ventana.getBtn_nuevo_cliente()) {
			new Registro_cliente(ventana,true).setVisible(true);
		}else if(e.getSource()==ventana.getBtn_reservas()) {
			new Reservas(ventana,true).setVisible(true);
		}else if(e.getSource()==ventana.getBtn_seleccion_cliente()) {
			new Seleccion_cliente(ventana,true).setVisible(true);
		}		
		
	}
	/**
	 * Método que cierra la session de hibernate al cerrar la aplicación.
	 */
	
	public void windowClosing(WindowEvent e) {
		Inicio.sesion.close();
	}
	
	

}
