package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import vista.Reserva_creada;
import vista.Ventana_guardado_ok;

public class Eventos_reserva_creada extends WindowAdapter implements ActionListener{

	private Reserva_creada ventana;
	
	public Eventos_reserva_creada(Reserva_creada ventana) {
		this.ventana=ventana;		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			ventana.dispose();
	}
	
	public void windowOpened(WindowEvent e) {
		ventana.getTf_inicio().setText(Eventos_crear_reserva.reserva.getFecha_inicio().toString());
		ventana.getTf_fin().setText(Eventos_crear_reserva.reserva.getFecha_fin().toString());
		ventana.getTf_total().setText(Eventos_crear_reserva.reserva.getTotal()+"");
	}
	

}
