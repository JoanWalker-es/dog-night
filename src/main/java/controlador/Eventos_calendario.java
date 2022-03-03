package controlador;

import java.awt.event.*;

import vista.*;

public class Eventos_calendario implements ActionListener{
	
	private Calendario ventana_calendario;
	
	public Eventos_calendario(Calendario ventana) {
		this.ventana_calendario=ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_calendario.getBtn_atras()) {
			ventana_calendario.dispose();
		}
		
	}

}
