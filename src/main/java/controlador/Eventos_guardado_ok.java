package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana_guardado_ok;

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
