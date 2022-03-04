package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana_guardado_ok;
import vista.Ventana_error;

public class Eventos_error implements ActionListener{

	private Ventana_error ventana;
	
	public Eventos_error(Ventana_error ventana) {
		this.ventana=ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.dispose();		
	}

}
