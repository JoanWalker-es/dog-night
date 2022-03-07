package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana_guardado_ok;
import vista.Ventana_error;
import vista.Ventana_error_fechas;

public class Eventos_error_fechas implements ActionListener{

	private Ventana_error_fechas ventana;
	
	public Eventos_error_fechas(Ventana_error_fechas ventana) {
		this.ventana=ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.dispose();		
	}

}
