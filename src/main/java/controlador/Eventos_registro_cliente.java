package controlador;

import java.awt.event.*;

import org.hibernate.Session;

import Principal.Inicio;
import modelo.Cliente;
import modeloRepository.ClienteRepository;
import vista.Ventana_guardado_ok;
import vista.Registro_cliente;
import vista.Registro_mascota;
import vista.Ventana_error;

public class Eventos_registro_cliente implements ActionListener{
	
	private Registro_cliente ventana_registro;
	private ClienteRepository clienteDao;
	public static Cliente nuevo;
	public static String mensaje;
	private Session sesion;
	
	public Eventos_registro_cliente(Registro_cliente ventana_registro) {
		this.ventana_registro=ventana_registro;
		sesion=Inicio.sesion;
		clienteDao=new ClienteRepository(sesion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_registro.getBtn_volver()) {
			ventana_registro.dispose();
		}else if(e.getSource()==ventana_registro.getBtn_guardar()) {
			
			if(ventana_registro.getTf_cliente_nombre().getText().isEmpty()||ventana_registro.getTf_cliente_nombre().getText().isBlank()
			||ventana_registro.getTf_cliente_telefono().getText().isBlank()||ventana_registro.getTf_cliente_telefono().getText().isEmpty()
			||ventana_registro.getTf_dni().getText().isBlank()||ventana_registro.getTf_dni().getText().isEmpty()){
				mensaje="<html><body><center>DEBE INTRODUCIR:</center><br><center>NOMBRE,TELÉFONO Y DNI</center><br><center>DEL CLIENTE</center></body></html>";
				new Ventana_error(ventana_registro,true).setVisible(true);
				mensaje=null;
			}else {
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
					ventana_registro.getBtn_mascota_add().setEnabled(true);
					ventana_registro.getBtn_guardar().setEnabled(false);
				}catch(Exception ex) {
					mensaje="<html><body><center>ERROR GUARDANDO LOS DATOS</center></body></html>";
					new Ventana_error(ventana_registro,true).setVisible(true);
					ex.printStackTrace();
					mensaje=null;
				}
			}			
							
			
		}else if(e.getSource()==ventana_registro.getBtn_mascota_add()) {			
			new Registro_mascota(ventana_registro,true).setVisible(true);
		}
		
		
	}
	
	
	

	
	
	

}
