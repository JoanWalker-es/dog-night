package controlador;

import java.awt.event.*;

import vista.Registro_cliente;

public class Eventos_registro_cliente implements ActionListener{
	
	private Registro_cliente ventana_registro;
	
	public Eventos_registro_cliente(Registro_cliente ventana_registro) {
		this.ventana_registro=ventana_registro;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_registro.getBtn_volver()) {
			ventana_registro.dispose();
		}
		
	}

}
