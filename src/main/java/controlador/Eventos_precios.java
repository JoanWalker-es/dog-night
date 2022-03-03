package controlador;

import java.awt.event.*;
import java.util.List;

import org.hibernate.Session;

import config.HibernateUtil;
import modelo.*;
import vista.*;

public class Eventos_precios implements ActionListener{
	
	private Precios ventana_precios;
	private ServiciosDao servicioDao;
	
	public Eventos_precios(Precios ventana) {
		this.ventana_precios=ventana;
		Session sesion=HibernateUtil.get().openSession();
		servicioDao=new ServiciosDao(sesion);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_precios.getBtn_atras()) {
			ventana_precios.dispose();
		}else if(e.getSource()==ventana_precios.getBtn_guardar()) {			
			//PROBANDO FUNCIONALIDAD BOTON PARA SACAR DATOS PRECIOS BBDD
			List<Servicios> lista=servicioDao.findAll();
			for(Servicios s:lista) {
				System.out.println(s.toString());
			}
				
		}
		
	}

}
