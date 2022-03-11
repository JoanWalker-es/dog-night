package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import org.hibernate.Session;

import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Mascota;
import vista.Consulta_cliente;
import vista.Consulta_mascota;

public class Eventos_consulta_cliente extends WindowAdapter implements ActionListener {

	private Session sesion;
	private Consulta_cliente ventana;
	public static Cliente cliente;
	public static Mascota mascota;
	private ClienteDao clienteDao;
	
	public Eventos_consulta_cliente(Consulta_cliente ventana) {
		sesion=Eventos_seleccion_cliente.sesion;
		this.ventana=ventana;
		this.cliente=Eventos_seleccion_cliente.cliente;
		clienteDao=new ClienteDao(sesion);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_volver()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_reserva()) {
			//ABRIR RESERVA NUEVA
		}else if(e.getSource()==ventana.getBtn_mascota_datos()) {
			//ABRIR CONSULTA DE MASCOTA
			mascota=(Mascota)ventana.getCb_mascotas().getSelectedItem();
			new Consulta_mascota(ventana,true).setVisible(true);
			
		}else if(e.getSource()==ventana.getBtn_editar()) {
			habilitarCampos(true);
			ventana.getBtn_editar().setEnabled(false);
			ventana.getBtn_guardar().setEnabled(true);
		}else if(e.getSource()==ventana.getBtn_guardar()) {
			guardarCliente();			
			habilitarCampos(false);
			ventana.getBtn_editar().setEnabled(true);
			ventana.getBtn_guardar().setEnabled(false);
		}
		
	}
	
	public void windowOpened(WindowEvent e) {
		
		ventana.getTf_cliente_nombre().setText(cliente.getNombre());
		ventana.getTf_cliente_apellidos().setText(cliente.getApellidos());
		ventana.getTf_cliente_correo().setText(cliente.getCorreo());
		ventana.getTf_cliente_direccion().setText(cliente.getDireccion());
		ventana.getTf_cliente_DNI().setText(cliente.getDNI());
		ventana.getTf_cliente_telefono().setText(cliente.getTelefono());
		for(Mascota m:cliente.getPerros()) {
			ventana.getCb_mascotas().addItem(m);
		}
		
	}
	
	private void habilitarCampos(boolean variable) {
		ventana.getTf_cliente_nombre().setEditable(variable);
		ventana.getTf_cliente_apellidos().setEditable(variable);
		ventana.getTf_cliente_correo().setEditable(variable);
		ventana.getTf_cliente_direccion().setEditable(variable);
		ventana.getTf_cliente_DNI().setEditable(variable);
		ventana.getTf_cliente_telefono().setEditable(variable);
	}
	
	private void guardarCliente() {
		cliente.setNombre(ventana.getTf_cliente_nombre().getText());
		cliente.setApellidos(ventana.getTf_cliente_apellidos().getText());
		cliente.setCorreo(ventana.getTf_cliente_correo().getText());
		cliente.setDireccion(ventana.getTf_cliente_direccion().getText());
		cliente.setDNI(ventana.getTf_cliente_DNI().getText());
		cliente.setTelefono(ventana.getTf_cliente_telefono().getText());
		clienteDao.update(cliente);
	}

}
