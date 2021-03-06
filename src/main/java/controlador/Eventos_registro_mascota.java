package controlador;

import java.awt.event.*;
import org.hibernate.Session;

import Principal.Inicio;
import modelo.*;
import modeloRepository.ClienteRepository;
import modeloRepository.MascotaRepository;
import vista.*;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * registro de mascota.
 *
 */
public class Eventos_registro_mascota implements ActionListener{
	
	private Registro_mascota ventana_registro;
	private MascotaRepository mascotaDao;
	private ClienteRepository clienteDao;	
	public static Mascota mascota;
	public static String mensaje;
	private Cliente cliente;
	private Session sesion;
	
	public Eventos_registro_mascota(Registro_mascota ventana_registro) {
		this.ventana_registro=ventana_registro;
		sesion=Inicio.sesion;
		mascotaDao=new MascotaRepository(sesion);
		clienteDao=new ClienteRepository(sesion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_registro.getBtn_atras()) {
			ventana_registro.dispose();
		}else if(e.getSource()==ventana_registro.getBtn_guardar()) {
		
			if(ventana_registro.getTf_mascota_nombre().getText().isBlank()||ventana_registro.getTf_mascota_nombre().getText().isEmpty()) {
				mensaje="<html><body><center>DEBE INTRODUCIR:</center><br><center>UN NOMBRE</center><br><center>DE LA MASCOTA</center></body></html>";
				new Ventana_error(ventana_registro,true).setVisible(true);
			}else {
				mascota=new Mascota();
				mascota.setNombre(ventana_registro.getTf_mascota_nombre().getText());
				mascota.setChip(ventana_registro.getTf_mascota_chip().getText());			
				if(ventana_registro.getjDate_mascota_fecha().getDate()!=null) {
					mascota.setFecha(new java.sql.Date(ventana_registro.getjDate_mascota_fecha().getDate().getTime()));
				}			
				mascota.setRaza(ventana_registro.getTf_mascota_raza().getText());			
							
				if(Eventos_registro_cliente.nuevo==null) {
					cliente=Eventos_consulta_cliente.cliente;					
				}else {
					cliente=Eventos_registro_cliente.nuevo;
				}
				cliente.getMascotas().add(mascota);
				
				try {
					
					mascotaDao.save(mascota);
					clienteDao.update(cliente);
					new Ventana_guardado_ok(ventana_registro,true).setVisible(true);				
					ventana_registro.getBtn_mascota_alimentos().setEnabled(true);
					ventana_registro.getBtn_mascota_medico().setEnabled(true);
					ventana_registro.getBtn_guardar().setEnabled(false);
					Campos(false);
					
				}catch(Exception ex) {
					ex.printStackTrace();
					new Ventana_error(ventana_registro,true).setVisible(true);
				}
			}		
			
			
		}else if(e.getSource()==ventana_registro.getBtn_mascota_alimentos()) {
			new Datos_alimentos(ventana_registro,true).setVisible(true);			
			
		}else if(e.getSource()==ventana_registro.getBtn_mascota_medico()) {
			new Datos_medicos(ventana_registro,true).setVisible(true);
		}
		else if(e.getSource()==ventana_registro.getBtn_limpiar()) {			
			ventana_registro.getTf_mascota_nombre().setText("");
			ventana_registro.getTf_mascota_raza().setText("");
			ventana_registro.getTf_mascota_chip().setText("");
			ventana_registro.getjDate_mascota_fecha().setDate(null);
			ventana_registro.getBtn_guardar().setEnabled(true);	
			Campos(true);
		}
		
	}
	
	/**
	 * M?todo que se encarga de activar o desactivar los campos para
	 * introducir datos de una mascota al clicar en el bot?n limpiar campos.
	 * @param activar
	 */
	
	private void Campos(boolean activar) {
		ventana_registro.getTf_mascota_nombre().setEnabled(activar);
		ventana_registro.getTf_mascota_raza().setEnabled(activar);
		ventana_registro.getTf_mascota_chip().setEnabled(activar);
		ventana_registro.getjDate_mascota_fecha().setEnabled(activar);
	}

}
