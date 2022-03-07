package controlador;

import java.awt.event.*;
import java.util.List;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Reserva;
import modelo.ReservaDao;
import vista.*;

public class Eventos_reservas extends WindowAdapter implements ActionListener{
	
	private Reservas ventana_reservas;
	public static Session sesion;
	private ReservaDao reservaDao;
	private ClienteDao clienteDao;
	public static Cliente cliente;
	
	public Eventos_reservas(Reservas ventana_reservas) {
		this.ventana_reservas=ventana_reservas;
		sesion=HibernateUtil.get().openSession();
		reservaDao=new ReservaDao(sesion);
		clienteDao=new ClienteDao(sesion);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_reservas.getBtn_atras()) {
			ventana_reservas.dispose();
		}else if(e.getSource()==ventana_reservas.getBtn_eliminar()) {
			//ELIMINAMOS LA RESERVA SELECCIONADA
		}else if(e.getSource()==ventana_reservas.getBtn_crear()) {				
			new Crear_reserva(ventana_reservas,true).setVisible(true);	
			ventana_reservas.getBtn_crear().setEnabled(false);
		}else if(e.getSource()==ventana_reservas.getBtn_mostrar()) {
			Cliente nuevo=(Cliente) ventana_reservas.getCbox_selec_cliente().getSelectedItem();
			cliente=clienteDao.findOneById(nuevo.getIdCliente());			
			System.out.println("id cliente: "+cliente.getIdCliente());
			ventana_reservas.getBtn_crear().setEnabled(true);				
		}
		
	}
	
	public void windowOpened(WindowEvent e) {
		List<Cliente> clientes=clienteDao.findAll();					
		for(Cliente c:clientes) {				
			ventana_reservas.getCbox_selec_cliente().addItem(c);				
		}		
		ventana_reservas.getBtn_crear().setEnabled(false);				
	}
	
	

}
