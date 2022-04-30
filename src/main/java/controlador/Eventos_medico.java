package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.hibernate.Session;
import Principal.Inicio;
import modelo.Historial_medico;
import modeloRepository.HMedicoRepository;
import modeloRepository.MascotaRepository;
import vista.Datos_medicos;
import vista.Ventana_error;
import vista.Ventana_guardado_ok;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase que se encarga de gestionar los eventos de la ventana de la interfaz 
 * datos médicos de la mascota.
 *
 */
public class Eventos_medico implements ActionListener{

	private Datos_medicos ventana;
	private HMedicoRepository medicoDao;
	private MascotaRepository mascotaDao;
	private Session sesion;
	
	public Eventos_medico(Datos_medicos ventana) {
		this.ventana=ventana;
		sesion=Inicio.sesion;
		medicoDao=new HMedicoRepository(sesion);
		mascotaDao=new MascotaRepository(sesion);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_atras()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_guardar()) {
			
			Historial_medico medico=new Historial_medico();
			medico.setPeso(ventana.getTf_mascota_peso().getText());
			medico.setSexo(ventana.getCbox_sexo().getSelectedItem().toString());			
			medico.setTalla(ventana.getCbox_talla().getSelectedItem().toString());
			medico.setEsterilizado(ventana.getCbox_esterilizado().isSelected());
			medico.setNombre_vacuna(ventana.getTf_vacuna_nombre().getText());			
			if(ventana.getjDate_vacuna_fecha().getDate()!=null) {
				medico.setFecha_vacuna(new java.sql.Date(ventana.getjDate_vacuna_fecha().getDate().getTime()));
			}						
			medico.setNombre_medicacion(ventana.getTf_medicacion_nombre().getText());
			medico.setDosis_medicacion(ventana.getTf_medicacion_dosis().getText());
			medico.setComentarios_medicacion(ventana.getTa_medicacion_comentarios().getText());
			medico.setPerro(Eventos_registro_mascota.mascota);
			Eventos_registro_mascota.mascota.setMedico(medico);
			
			try {
				medicoDao.save(medico);			
				mascotaDao.update(Eventos_registro_mascota.mascota);
				new Ventana_guardado_ok(ventana,true).setVisible(true);
				ventana.getBtn_guardar().setEnabled(false);
			}catch(Exception ex) {				
				new Ventana_error(ventana,true).setVisible(true);
			}			
			
		}
		
	}

}
