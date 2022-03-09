package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Eliminar_reserva;

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
