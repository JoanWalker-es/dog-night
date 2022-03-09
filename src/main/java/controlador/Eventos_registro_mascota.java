package controlador;

import java.awt.event.*;
import org.hibernate.Session;
import modelo.*;
import vista.*;

public class Eventos_registro_mascota implements ActionListener{
	
	private Registro_mascota ventana_registro;
	private MascotaDao mascotaDao;
	private Session sesion;
	private ClienteDao clienteDao;	
	public static Mascota mascota;
	public static String mensaje;
	
	public Eventos_registro_mascota(Registro_mascota ventana_registro) {
		this.ventana_registro=ventana_registro;
		sesion=Eventos_registro_cliente.sesion;
		mascotaDao=new MascotaDao(sesion);
		clienteDao=new ClienteDao(sesion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_registro.getBtn_atras()) {
			ventana_registro.dispose();
		}else if(e.getSource()==ventana_registro.getBtn_guardar()) {
		
			if(ventana_registro.getTf_mascota_nombre().getText().isBlank()||ventana_registro.getTf_mascota_nombre().getText().isEmpty()) {
				mensaje="<html><body><center>DEBE INTRODUCIR:</center><br><center>UN NOMBRE</center><br><center>DELA MASCOTA</center></body></html>";
				new Ventana_error(ventana_registro,true).setVisible(true);
			}else {
				mascota=new Mascota();
				mascota.setNombre(ventana_registro.getTf_mascota_nombre().getText());
				mascota.setChip(ventana_registro.getTf_mascota_chip().getText());			
				if(ventana_registro.getjDate_mascota_fecha().getDate()!=null) {
					mascota.setFecha(new java.sql.Date(ventana_registro.getjDate_mascota_fecha().getDate().getTime()));
				}			
				mascota.setRaza(ventana_registro.getTf_mascota_raza().getText());			
							
				Eventos_registro_cliente.nuevo.getPerros().add(mascota);
				
				try {
					
					mascotaDao.save(mascota);
					clienteDao.update(Eventos_registro_cliente.nuevo);
					new Ventana_guardado_ok(ventana_registro,true).setVisible(true);				
					ventana_registro.getBtn_mascota_alimentos().setEnabled(true);
					ventana_registro.getBtn_mascota_medico().setEnabled(true);
					
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
		}
		
	}

}
