package controlador;

import java.awt.event.*;

import org.hibernate.Session;
import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import vista.Ventana_guardado_ok;
import vista.Registro_cliente;
import vista.Registro_mascota;
import vista.Ventana_error;

public class Eventos_registro_cliente extends WindowAdapter implements ActionListener{
	
	private Registro_cliente ventana_registro;
	private ClienteDao clienteDao;
	private Session sesion;
	public static Cliente nuevo;
	
	public Eventos_registro_cliente(Registro_cliente ventana_registro) {
		this.ventana_registro=ventana_registro;
		sesion=HibernateUtil.get().openSession();
		clienteDao=new ClienteDao(sesion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_registro.getBtn_volver()) {
			ventana_registro.dispose();
		}else if(e.getSource()==ventana_registro.getBtn_guardar()) {
			
			nuevo=new Cliente();
			nuevo.setNombre(ventana_registro.getTf_cliente_nombre().getText());
			nuevo.setApellidos(ventana_registro.getTf_cliente_apellidos().getText());
			nuevo.setTelefono(ventana_registro.getTf_cliente_telefono().getText());
			nuevo.setCorreo(ventana_registro.getTf_cliente_correo().getText());
			nuevo.setDireccion(ventana_registro.getTf_cliente_direccion().getText());
			nuevo.setDNI(ventana_registro.getTf_dni().getText());
			
			try {
				clienteDao.save(nuevo);										
				new Ventana_guardado_ok(ventana_registro,true).setVisible(true);
				ventana_registro.getBtn_reserva().setEnabled(true);
				ventana_registro.getBtn_mascota_add().setEnabled(true);
				ventana_registro.getBtn_guardar().setEnabled(false);
			}catch(Exception ex) {
				new Ventana_error(ventana_registro,true).setVisible(true);
			}				
			
		}else if(e.getSource()==ventana_registro.getBtn_mascota_add()) {			
			new Registro_mascota(ventana_registro,true).setVisible(true);
		}
		
	}
	
	
	//LIMPIAR CAMPOS AL CERRAR LA VENTANA DE REGISTRAR MASCOTAS
	@Override
	public void windowGainedFocus(WindowEvent e) {
		ventana_registro.getBtn_guardar().setEnabled(false);
		ventana_registro.getTf_cliente_nombre().setText("");
		System.out.println("He ganado el foco");
		
		
	}

	
	
	

}
