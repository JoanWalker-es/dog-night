package controlador;

import java.awt.event.*;
import vista.*;

public class Eventos_reservas implements ActionListener{
	
	private Reservas ventana_reservas;
	
	public Eventos_reservas(Reservas ventana_reservas) {
		this.ventana_reservas=ventana_reservas;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_reservas.getBtn_atras()) {
			ventana_reservas.dispose();
		}
		
	}
	
	

}
