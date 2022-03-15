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
import modelo.HAlimenticioDao;
import modelo.HMedicoDao;
import modelo.Historial_alimenticio;
import modelo.Historial_medico;
import modelo.Mascota;
import modelo.MascotaDao;
import vista.Consulta_cliente;
import vista.Consulta_mascota;

public class Eventos_consulta_mascota extends WindowAdapter implements ActionListener {

	private Session sesion;
	private Consulta_mascota ventana;
	private Mascota mascota;
	private MascotaDao mascotaDao;
	private HMedicoDao medicoDao;
	private HAlimenticioDao alimentoDao;
	private Historial_medico medico;
	private Historial_alimenticio alimento;
	
	public Eventos_consulta_mascota(Consulta_mascota ventana) {
		//sesion=Eventos_seleccion_cliente.sesion;
		sesion=Inicio.sesion;
		this.ventana=ventana;
		//this.mascota=Eventos_consulta_cliente.mascota;		
		mascotaDao=new MascotaDao(sesion);		
		medicoDao=new HMedicoDao(sesion);
		alimentoDao=new HAlimenticioDao(sesion);
		medico=new Historial_medico();
		alimento=new Historial_alimenticio();
		this.mascota=mascotaDao.findOneById(Eventos_consulta_cliente.mascota.getIdPerro());		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_volver()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_editar()) {			
			habilitarCampos(true);
			ventana.getBtn_guardar().setEnabled(true);
			ventana.getBtn_editar().setEnabled(false);
		}else if(e.getSource()==ventana.getBtn_guardar()) {			
			guardarMascota();
			habilitarCampos(false);
			ventana.getBtn_guardar().setEnabled(false);
			ventana.getBtn_editar().setEnabled(true);
		}
		
	}
	
	public void windowOpened(WindowEvent e) {		
		ventana.getTf_mascota_nombre().setText(mascota.getNombre());
		ventana.getTf_mascota_chip().setText(mascota.getChip());
		ventana.getJdate_mascota_fecha().setDate(mascota.getFecha());
		ventana.getTf_mascota_raza().setText(mascota.getRaza());
		
		if(mascota.getAlimentos()==null) {
			ventana.getTf_alimento_tipo().setText("");		
			ventana.getTf_alimento_cantidad().setText("");
			ventana.getJt_alimento().setText("");
			ventana.getTf_intolerancia_tipo().setText("");
			ventana.getJt_intolerancia().setText("");
		}else {
			ventana.getTf_alimento_tipo().setText(mascota.getAlimentos().getTipo_pienso());		
			ventana.getTf_alimento_cantidad().setText(mascota.getAlimentos().getCantidad_pienso());
			ventana.getJt_alimento().setText(mascota.getAlimentos().getComentarios_pienso());
			ventana.getTf_intolerancia_tipo().setText(mascota.getAlimentos().getTipo_intolerancia());
			ventana.getJt_intolerancia().setText(mascota.getAlimentos().getDescripcion_intolerancia());
		}
		if(mascota.getMedico()==null) {
			ventana.getCbox_talla().setSelectedItem("");
			ventana.getCbox_esterilizado().setSelected(false);
			ventana.getTf_medicacion_nombre().setText("");
			ventana.getTf_medicacion_dosis().setText("");
			ventana.getJt_medicacion().setText("");		
			ventana.getTf_vacuna_nombre().setText("");
			ventana.getTf_mascota_peso().setText("");		
			ventana.getTf_mascota_sexo().setText("");		
			ventana.getJdate_mascota_rabia_fecha().setDate(null);
		}else {
			ventana.getCbox_talla().setSelectedItem(mascota.getMedico().getTalla());
			ventana.getCbox_esterilizado().setSelected(mascota.getMedico().isEsterilizado());
			ventana.getTf_medicacion_nombre().setText(mascota.getMedico().getNombre_medicacion());
			ventana.getTf_medicacion_dosis().setText(mascota.getMedico().getDosis_medicacion());
			ventana.getJt_medicacion().setText(mascota.getMedico().getComentarios_medicacion());		
			ventana.getTf_vacuna_nombre().setText(mascota.getMedico().getNombre_vacuna());
			ventana.getTf_mascota_peso().setText(mascota.getMedico().getPeso());		
			ventana.getTf_mascota_sexo().setText(mascota.getMedico().getSexo());		
			ventana.getJdate_mascota_rabia_fecha().setDate(mascota.getMedico().getFecha_vacuna());
		}
		
		
		
	}
	
	private void habilitarCampos(boolean variable) {
		
		ventana.getTf_mascota_nombre().setEditable(variable);
		ventana.getTf_mascota_chip().setEditable(variable);
		ventana.getJdate_mascota_fecha().setEnabled(variable);
		ventana.getTf_mascota_peso().setEditable(variable);
		ventana.getTf_mascota_raza().setEditable(variable);
		ventana.getTf_mascota_sexo().setEditable(variable);
		ventana.getCbox_talla().setEnabled(variable);
		ventana.getCbox_esterilizado().setEnabled(variable);
		ventana.getTf_medicacion_nombre().setEditable(variable);
		ventana.getTf_medicacion_dosis().setEditable(variable);
		ventana.getJt_medicacion().setEditable(variable);
		ventana.getTf_alimento_tipo().setEditable(variable);
		ventana.getTf_alimento_cantidad().setEditable(variable);
		ventana.getJt_alimento().setEditable(variable);
		ventana.getTf_intolerancia_tipo().setEditable(variable);
		ventana.getJt_intolerancia().setEditable(variable);
		ventana.getTf_vacuna_nombre().setEditable(variable);
		ventana.getJdate_mascota_rabia_fecha().setEnabled(variable);
	}
	
	private void guardarMascota() {
		
		mascota.setNombre(ventana.getTf_mascota_nombre().getText());
		mascota.setChip(ventana.getTf_mascota_chip().getText());
		if(ventana.getJdate_mascota_fecha().getDate()!=null) {
			mascota.setFecha(new java.sql.Date(ventana.getJdate_mascota_fecha().getDate().getTime()));
		}		
		mascota.setRaza(ventana.getTf_mascota_raza().getText());
		
		
		if(mascota.getMedico()!=null) {
			mascota.getMedico().setPeso(ventana.getTf_mascota_peso().getText());
			mascota.getMedico().setSexo(ventana.getTf_mascota_sexo().getText());
			mascota.getMedico().setTalla(ventana.getCbox_talla().getSelectedItem().toString());
			mascota.getMedico().setEsterilizado(ventana.getCbox_esterilizado().isSelected());
			mascota.getMedico().setNombre_medicacion(ventana.getTf_medicacion_nombre().getText());
			mascota.getMedico().setDosis_medicacion(ventana.getTf_medicacion_dosis().getText());
			mascota.getMedico().setComentarios_medicacion(ventana.getJt_medicacion().getText());
			mascota.getMedico().setNombre_vacuna(ventana.getTf_vacuna_nombre().getText());
			if(ventana.getJdate_mascota_rabia_fecha().getDate()!=null) {
				mascota.getMedico().setFecha_vacuna(new java.sql.Date(ventana.getJdate_mascota_rabia_fecha().getDate().getTime()));
			}
			
		}else {
					
			medico.setPerro(mascota);
			medico.setPeso(ventana.getTf_mascota_peso().getText());
			medico.setSexo(ventana.getTf_mascota_sexo().getText());			
			medico.setTalla(ventana.getCbox_talla().getSelectedItem().toString());
			medico.setEsterilizado(ventana.getCbox_esterilizado().isSelected());
			medico.setNombre_medicacion(ventana.getTf_medicacion_nombre().getText());
			medico.setDosis_medicacion(ventana.getTf_medicacion_dosis().getText());
			medico.setComentarios_medicacion(ventana.getJt_medicacion().getText());
			medico.setNombre_vacuna(ventana.getTf_vacuna_nombre().getText());
			if(ventana.getJdate_mascota_rabia_fecha().getDate()!=null) {
				medico.setFecha_vacuna(new java.sql.Date(ventana.getJdate_mascota_rabia_fecha().getDate().getTime()));
			}
			
			medicoDao.save(medico);
		}
		
		if(mascota.getAlimentos()!=null) {
			mascota.getAlimentos().setTipo_pienso(ventana.getTf_alimento_tipo().getText());
			mascota.getAlimentos().setCantidad_pienso(ventana.getTf_alimento_cantidad().getText());
			mascota.getAlimentos().setComentarios_pienso(ventana.getJt_alimento().getText());
			mascota.getAlimentos().setTipo_intolerancia(ventana.getTf_intolerancia_tipo().getText());
			mascota.getAlimentos().setDescripcion_intolerancia(ventana.getJt_intolerancia().getText());
		}else {
			
			alimento.setPerro(mascota);
			alimento.setTipo_pienso(ventana.getTf_alimento_tipo().getText());
			alimento.setCantidad_pienso(ventana.getTf_alimento_cantidad().getText());
			alimento.setComentarios_pienso(ventana.getJt_alimento().getText());
			alimento.setTipo_intolerancia(ventana.getTf_intolerancia_tipo().getText());
			alimento.setDescripcion_intolerancia(ventana.getJt_intolerancia().getText());
			
			alimentoDao.save(alimento);
		}				
		
		mascotaDao.update(mascota);
	}

}
