package controlador;

import java.awt.event.*;

import vista.Seleccion_cliente;

public class Eventos_seleccion_cliente implements ActionListener{
	
	private Seleccion_cliente ventana_seleccion;
	
	public Eventos_seleccion_cliente(Seleccion_cliente ventana_seleccion) {
		this.ventana_seleccion=ventana_seleccion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_seleccion.getBtn_atras()) {
			ventana_seleccion.dispose();
		}
		
	}

}
