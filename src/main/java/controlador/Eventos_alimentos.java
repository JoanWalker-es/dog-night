package controlador;

import java.awt.event.*;

import org.hibernate.Session;
import config.HibernateUtil;
import modelo.HAlimenticioDao;
import modelo.Historial_alimenticio;
import vista.Datos_alimentos;
import vista.Ventana_error;
import vista.Ventana_guardado_ok;

public class Eventos_alimentos implements ActionListener{

	private Datos_alimentos ventana;
	private HAlimenticioDao alimentoDao;
	private Historial_alimenticio alimento;
	private Session sesion;
	
	public Eventos_alimentos(Datos_alimentos ventana) {
		this.ventana=ventana;
		sesion=HibernateUtil.get().openSession();
		alimentoDao=new HAlimenticioDao(sesion);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_atras()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_guardar()) {			
			alimento=new Historial_alimenticio();
			alimento.setTipo_pienso(ventana.getTf_alimentos_tipo().getText());
			alimento.setCantidad_pienso(ventana.getTf_alimentos_cantidad().getText());
			alimento.setComentarios_pienso(ventana.getTa_alimentos_comentarios().getText());
			alimento.setTipo_intolerancia(ventana.getTf_intolerancia_tipo().getText());
			alimento.setDescripcion_intolerancia(ventana.getTa_intolerancia_descripcion().getText());			
			alimento.setPerro(Eventos_registro_mascota.mascota);
			
			try {
				alimentoDao.save(alimento);						
				new Ventana_guardado_ok(ventana,true).setVisible(true);
				ventana.getBtn_guardar().setEnabled(false);
			}catch(Exception ex) {				
				new Ventana_error(ventana,true).setVisible(true);
			}
		}
		
	}

}