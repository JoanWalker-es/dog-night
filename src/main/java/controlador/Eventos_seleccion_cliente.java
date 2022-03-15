package controlador;

import java.awt.event.*;
import java.util.List;
import org.hibernate.Session;

import Principal.Inicio;
import config.HibernateUtil;
import modelo.Cliente;
import modelo.ClienteDao;
import vista.Consulta_cliente;
import vista.Seleccion_cliente;
import vista.Ventana_error;

public class Eventos_seleccion_cliente implements ActionListener{
	
	public static Session sesion;
	private Seleccion_cliente ventana;
	private ClienteDao clienteDao;
	public static Cliente cliente;
	public static String mensaje;
	
	public Eventos_seleccion_cliente(Seleccion_cliente ventana_seleccion) {
		this.ventana=ventana_seleccion;
		//sesion=HibernateUtil.get().openSession();
		sesion=Inicio.sesion;
		clienteDao=new ClienteDao(sesion);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana.getBtn_atras()) {
			ventana.dispose();
		}else if(e.getSource()==ventana.getBtn_buscar()) { 
			ventana.getCbox_clientes().removeAllItems();
			String busca=ventana.getTf_buscar().getText();
			List <Cliente> clientes=clienteDao.like(busca);
			for(Cliente c:clientes) {				
				ventana.getCbox_clientes().addItem(c);				
			}
		}else if(e.getSource()==ventana.getBtn_consulta()){
			Cliente nuevo=(Cliente) ventana.getCbox_clientes().getSelectedItem();			
			if(nuevo==null) {
				mensaje="<html><body><center>DEBE SELECCIONAR UN</center><br><center>CLIENTE</center><br></body></html>";
				new Ventana_error(ventana,true).setVisible(true);
			}else {
				cliente=clienteDao.findOneById(nuevo.getId());
				new Consulta_cliente(ventana,true).setVisible(true);
			}
			
		}
		
	}
	

}
