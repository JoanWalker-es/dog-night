package controlador;

import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.*;

import vista.*;

public class Eventos_calendario extends WindowAdapter implements ActionListener, PropertyChangeListener{
	
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

	public void windowOpened(WindowEvent e) {
		
	}



	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().compareTo("day") == 0) {
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(formatoDeFecha.format(ventana_calendario.getjCalendar().getDate()));
        }
	}
	
        

}
