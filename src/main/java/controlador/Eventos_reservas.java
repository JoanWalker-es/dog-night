package controlador;

import java.awt.event.*;
import java.util.List;
import org.hibernate.Session;

import Principal.Inicio;
import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteRepository;
import modelo.Reserva;
import modelo.ReservaRepository;
import vista.*;

public class Eventos_reservas extends WindowAdapter implements ActionListener{
	
	private Reservas ventana_reservas;
	private ReservaRepository reservaDao;
	private ClienteRepository clienteDao;
	public static Cliente cliente;
	public static String mensaje;
	private Cliente todos=new Cliente("TODOS","LOS CLIENTES");
	public static Reserva reserva;
	public static boolean modificar;
	private Session sesion;
	
	public Eventos_reservas(Reservas ventana_reservas) {
		this.ventana_reservas=ventana_reservas;
		sesion=Inicio.sesion;
		reservaDao=new ReservaRepository(sesion);
		clienteDao=new ClienteRepository(sesion);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_reservas.getBtn_atras()) {
			ventana_reservas.dispose();
		}else if(e.getSource()==ventana_reservas.getBtn_eliminar()) {	
			try {
				Object ob=ventana_reservas.getTabla_reservas().getValueAt(ventana_reservas.getTabla_reservas().getSelectedRow(),ventana_reservas.getTabla_reservas().getSelectedColumn());
				Reserva reser=reservaDao.findOneById(Long.parseLong(ob.toString()));				
				new Eliminar_reserva(ventana_reservas,true).setVisible(true);		
				
				if(Eventos_eliminar_reserva.eliminar) {	
					ventana_reservas.getModelo().setRowCount(0);
					cliente.getReservas().remove(reser);
					reservaDao.delete(reser);
					clienteDao.update(cliente);																	
					rellenaTablaCliente(cliente);
				}
			}catch(Exception ex) {
				mensaje="<html><body><center>DEBE SELECCIONAR UN</center><br><center>CÓDIGO DE RESERVA</center><br></body></html>";
				new Ventana_error(ventana_reservas,true).setVisible(true);
				ex.printStackTrace();
			}						
			
		}else if(e.getSource()==ventana_reservas.getBtn_crear()) {				
			Cliente nuevo=(Cliente) ventana_reservas.getCbox_selec_cliente().getSelectedItem();					
			if(nuevo.getNombre().equals(todos.getNombre())) {
				mensaje="<html><body><center>DEBE SELECCIONAR UN</center><br><center>CLIENTE DEL LISTADO</center><br></body></html>";
				new Ventana_error(ventana_reservas,true).setVisible(true);
			}else {	
				cliente=clienteDao.findOneById(nuevo.getId());
				mensaje="<html><body><center>RESERVA CREADA CORRECTAMENTE</center><br></body></html>";
				new Crear_reserva(ventana_reservas,true).setVisible(true);	
				rellenaTablaCliente(cliente);
			}			
			
		}else if(e.getSource()==ventana_reservas.getBtn_mostrar()) {			
			Cliente nuevo=(Cliente) ventana_reservas.getCbox_selec_cliente().getSelectedItem();			
			if(nuevo.getNombre().equals(todos.getNombre())) {
				rellenaTabla();
			}else {				
				cliente=clienteDao.findOneById(nuevo.getIdCliente());
				ventana_reservas.getBtn_crear().setEnabled(true);	
				rellenaTablaCliente(cliente);
				ventana_reservas.getBtn_eliminar().setEnabled(true);
				ventana_reservas.getBtn_modificar().setEnabled(true);
			}
			
		}else if(e.getSource()==ventana_reservas.getBtn_modificar()) {
			try {				
				Object ob=ventana_reservas.getTabla_reservas().getValueAt(ventana_reservas.getTabla_reservas().getSelectedRow(),ventana_reservas.getTabla_reservas().getSelectedColumn());
				Reserva reser=reservaDao.findOneById(Long.parseLong(ob.toString()));
				reserva=reser;
				modificar=true;
				mensaje="<html><body><center>RESERVA MODIFICADA CORRECTAMENTE</center><br></body></html>";
				new Crear_reserva(ventana_reservas,true).setVisible(true);
				modificar=false;				
				rellenaTablaCliente(cliente);

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
		List<Reserva> reservas=clienteDao.findOneById(cliente.getId()).getReservas();
		ventana_reservas.getModelo().setRowCount(0);
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
