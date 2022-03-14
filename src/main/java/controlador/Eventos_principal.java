package controlador;

import java.awt.event.*;
import vista.*;

public class Eventos_principal implements ActionListener {
	
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
	
	

}
