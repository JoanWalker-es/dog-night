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
	public static String mensaje;
	private Cliente todos=new Cliente("TODOS","LOS CLIENTES");
	public static Reserva reserva;
	public static boolean modificar;
	
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
			modificar=false;
			try {
				Object ob=ventana_reservas.getTabla_reservas().getValueAt(ventana_reservas.getTabla_reservas().getSelectedRow(),ventana_reservas.getTabla_reservas().getSelectedColumn());
				Reserva reser=reservaDao.findOneById(Long.parseLong(ob.toString()));				
				new Eliminar_reserva(ventana_reservas,true).setVisible(true);		
				
				if(Eventos_eliminar_reserva.eliminar) {	
					ventana_reservas.getModelo().setRowCount(0);
					cliente.getReservas().remove(reser);
					clienteDao.update(cliente);	
					reservaDao.delete(reser);											
					rellenaTablaCliente(cliente);
				}
			}catch(Exception ex) {
				mensaje="<html><body><center>DEBE SELECCIONAR UN</center><br><center>CÓDIGO DE RESERVA</center><br></body></html>";
				new Ventana_error(ventana_reservas,true).setVisible(true);
			}				
						
			
		}else if(e.getSource()==ventana_reservas.getBtn_crear()) {		
			modificar=false;
			new Crear_reserva(ventana_reservas,true).setVisible(true);	
			ventana_reservas.getBtn_crear().setEnabled(false);
		}else if(e.getSource()==ventana_reservas.getBtn_mostrar()) {
			
			Cliente nuevo=(Cliente) ventana_reservas.getCbox_selec_cliente().getSelectedItem();
			
			if(nuevo.getNombre().equals(todos.getNombre())) {
				rellenaTabla();
			}else {				
				cliente=clienteDao.findOneById(nuevo.getIdCliente());
				ventana_reservas.getBtn_crear().setEnabled(true);	
				rellenaTablaCliente(nuevo);
				ventana_reservas.getBtn_eliminar().setEnabled(true);
				ventana_reservas.getBtn_modificar().setEnabled(true);
			}
			
		}else if(e.getSource()==ventana_reservas.getBtn_modificar()) {
			//MODIFICAMOS LA RESERVA SELECIONADA
			try {
				Object ob=ventana_reservas.getTabla_reservas().getValueAt(ventana_reservas.getTabla_reservas().getSelectedRow(),ventana_reservas.getTabla_reservas().getSelectedColumn());
				Reserva reser=reservaDao.findOneById(Long.parseLong(ob.toString()));
				reserva=reser;
				modificar=true;
				new Crear_reserva(ventana_reservas,true).setVisible(true);

			}catch(Exception ex) {
				mensaje="<html><body><center>DEBE SELECCIONAR UN</center><br><center>CÓDIGO DE RESERVA</center><br></body></html>";
				new Ventana_error(ventana_reservas,true).setVisible(true);
			}
			
		}
		
	}
	
	public void windowOpened(WindowEvent e) {
		
		List<Cliente> clientes=clienteDao.findAll();
		ventana_reservas.getCbox_selec_cliente().addItem(todos);
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
			Object[] obj=new Object[6];
			obj[0]=r.getCodigo();
			obj[1]=r.getFecha_inicio();
			obj[2]=r.getFecha_fin();
			obj[3]=r.getServicios().toString();
			obj[4]=r.getComentarios();
			obj[5]=r.getTotal();
			ventana_reservas.getModelo().addRow(obj);			
		}
	}

	private void rellenaTablaCliente(Cliente cliente) {			
		ventana_reservas.getModelo().setRowCount(0);
		
		List<Reserva> reservas=cliente.getReservas();		
		if(cliente.getReservas().size()<1) {
			ventana_reservas.getModelo().setRowCount(0);
		}else {
			for(Reserva r:reservas) {
				Object[] obj=new Object[6];
				obj[0]=r.getCodigo();
				obj[1]=r.getFecha_inicio();
				obj[2]=r.getFecha_fin();
				obj[3]=r.getServicios().toString();
				obj[4]=r.getComentarios();
				obj[5]=r.getTotal();
				ventana_reservas.getModelo().addRow(obj);
			}
		}

	}

}
