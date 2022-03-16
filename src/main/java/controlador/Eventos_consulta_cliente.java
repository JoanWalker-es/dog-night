package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import org.hibernate.Session;

import Principal.Inicio;
import modelo.Cliente;
import modelo.ClienteDao;
import modelo.Mascota;
import modelo.MascotaDao;
import vista.Consulta_cliente;
import vista.Consulta_mascota;
import vista.Crear_reserva;
import vista.Registro_mascota;

public class Eventos_consulta_cliente extends WindowAdapter implements ActionListener {

	private Consulta_cliente ventana;
	public static Cliente cliente;
	public static Mascota mascota;
	private ClienteDao clienteDao;
	public static boolean consulta;
	private MascotaDao mascotaDao;
	private Session sesion;
	

	public Eventos_consulta_cliente(Consulta_cliente ventana) {
		sesion=Inicio.sesion;
		this.ventana=ventana;
		this.cliente=Eventos_seleccion_cliente.cliente;
		clienteDao=new ClienteDao(sesion);		
		mascotaDao=new MascotaDao(sesion);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_volver()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_reserva()) {
			consulta=true;
			new Crear_reserva(ventana,true).setVisible(true);
			consulta=false;
		}else if(e.getSource()==ventana.getBtn_mascota_datos()) {
			Mascota perro=(Mascota)ventana.getCb_mascotas().getSelectedItem();
			mascota=mascotaDao.findOneById(perro.getIdPerro());			
			new Consulta_mascota(ventana,true).setVisible(true);
			rellenaCombo();
			
		}else if(e.getSource()==ventana.getBtn_editar()) {
			habilitarCampos(true);
			ventana.getBtn_editar().setEnabled(false);
			ventana.getBtn_guardar().setEnabled(true);
		}else if(e.getSource()==ventana.getBtn_guardar()) {
			guardarCliente();			
			habilitarCampos(false);
			ventana.getBtn_editar().setEnabled(true);
			ventana.getBtn_guardar().setEnabled(false);
		}else if(e.getSource()==ventana.getBtn_mascota_add()) {
			new Registro_mascota(ventana,true).setVisible(true);
			rellenaCombo();
		}
		
	}
	
	public void windowOpened(WindowEvent e) {
		rellenaCombo();		
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
	
	private void rellenaCombo() {
		ventana.getCb_mascotas().removeAllItems();
		ventana.getTf_cliente_nombre().setText(cliente.getNombre());
		ventana.getTf_cliente_apellidos().setText(cliente.getApellidos());
		ventana.getTf_cliente_correo().setText(cliente.getCorreo());
		ventana.getTf_cliente_direccion().setText(cliente.getDireccion());
		ventana.getTf_cliente_DNI().setText(cliente.getDNI());
		ventana.getTf_cliente_telefono().setText(cliente.getTelefono());
		for(Mascota m:cliente.getMascotas()) {
			ventana.getCb_mascotas().addItem(m);
		}
	}

}
