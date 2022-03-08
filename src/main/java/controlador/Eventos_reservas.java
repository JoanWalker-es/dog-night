package controlador;

import java.awt.event.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.internal.build.AllowSysOut;

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
			//SELECCIONAMOS EL CODIGO DE LA RESERVA:
			Object ob=ventana_reservas.getTabla_reservas().getValueAt(ventana_reservas.getTabla_reservas().getSelectedRow(),ventana_reservas.getTabla_reservas().getSelectedColumn());
			System.out.println(ob.toString());
			Reserva reser=reservaDao.findOneById(Long.parseLong(ob.toString()));						
			//PREGUNTAMOS SI REALMENTE QUEREMOS ELIMINAR LA RESERVA
			new Eliminar_reserva(ventana_reservas,true).setVisible(true);		
			
			if(Eventos_eliminar_reserva.eliminar) {
				//SI DICE QUE SI, ELIMINAMOS LA RESERVA Y ACTUALIZAMOS TABLA	
				
//				for(Reserva r:cliente.getReservas()) {
//					if(r.getCodigo()==reser.getCodigo()) {
//						
						cliente.getReservas().remove(reser);						
						clienteDao.update(cliente);			
//						reservaDao.delete(reser);
//					}
//				}												
				rellenaTabla();
			}			
			
		}else if(e.getSource()==ventana_reservas.getBtn_crear()) {				
			new Crear_reserva(ventana_reservas,true).setVisible(true);	
			ventana_reservas.getBtn_crear().setEnabled(false);
		}else if(e.getSource()==ventana_reservas.getBtn_mostrar()) {
			Cliente nuevo=(Cliente) ventana_reservas.getCbox_selec_cliente().getSelectedItem();
			cliente=clienteDao.findOneById(nuevo.getIdCliente());
			ventana_reservas.getBtn_crear().setEnabled(true);	
			rellenaTablaCliente(nuevo);
			ventana_reservas.getBtn_eliminar().setEnabled(true);
		}
		
	}
	
	public void windowOpened(WindowEvent e) {
		List<Cliente> clientes=clienteDao.findAll();					
		for(Cliente c:clientes) {				
			ventana_reservas.getCbox_selec_cliente().addItem(c);				
		}		
		ventana_reservas.getBtn_crear().setEnabled(false);	
		
		rellenaTabla();
	}
	
	private void rellenaTabla() {	
		ventana_reservas.getModelo().setRowCount(0);
		
		List<Reserva> reservas=reservaDao.findAll();		
		for(Reserva r:reservas) {
			Object[] obj=new Object[7];
			obj[0]=r.getCodigo();
			obj[1]=r.getFecha_inicio();
			obj[2]=r.getFecha_fin();
			obj[3]=r.isPeluqueria();
			obj[4]=r.isAlimentos();
			obj[5]=r.getComentarios();
			obj[6]=r.getTotal();
			ventana_reservas.getModelo().addRow(obj);			
		}
	}
	
	private void rellenaTablaCliente(Cliente cliente) {			
		ventana_reservas.getModelo().setRowCount(0);
		
		List<Reserva> reservas=cliente.getReservas();		
		for(Reserva r:reservas) {
			Object[] obj=new Object[7];
			obj[0]=r.getCodigo();
			obj[1]=r.getFecha_inicio();
			obj[2]=r.getFecha_fin();
			obj[3]=r.isPeluqueria();
			obj[4]=r.isAlimentos();
			obj[5]=r.getComentarios();
			obj[6]=r.getTotal();
			ventana_reservas.getModelo().addRow(obj);			
		}
	}
	
	

}
