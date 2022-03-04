package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.HMedicoDao;
import modelo.Historial_medico;
import vista.Datos_medicos;
import vista.Ventana_error;
import vista.Ventana_guardado_ok;

public class Eventos_medico implements ActionListener{

	private Session sesion;
	private Datos_medicos ventana;
	private HMedicoDao medicoDao;
	
	public Eventos_medico(Datos_medicos ventana) {
		this.ventana=ventana;
		sesion=HibernateUtil.get().openSession();
		medicoDao=new HMedicoDao(sesion);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_atras()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_guardar()) {
			
			Historial_medico medico=new Historial_medico();
			medico.setPeso(ventana.getTf_mascota_peso().getText());
			medico.setSexo(ventana.getTf_mascota_sexo().getText());
			medico.setTalla(ventana.getCbox_talla().getSelectedItem().toString());
			medico.setEsterilizado(ventana.getCbox_esterilizado().isSelected());
			medico.setNombre_vacuna(ventana.getTf_vacuna_nombre().getText());
			medico.setFecha_vacuna(ventana.getTf_vacuna_fecha().getText());
			medico.setNombre_medicacion(ventana.getTf_medicacion_nombre().getText());
			medico.setDosis_medicacion(ventana.getTf_medicacion_dosis().getText());
			medico.setComentarios_medicacion(ventana.getTa_medicacion_comentarios().getText());
			medico.setPerro(Eventos_registro_mascota.mascota);
			
			try {
				medicoDao.save(medico);						
				new Ventana_guardado_ok(ventana,true).setVisible(true);
				ventana.getBtn_guardar().setEnabled(false);
			}catch(Exception ex) {				
				new Ventana_error(ventana,true).setVisible(true);
			}			
			
		}
		
	}

}
