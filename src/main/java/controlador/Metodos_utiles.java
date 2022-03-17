package controlador;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JDialog;

import org.hibernate.Session;

import Principal.Inicio;
import modelo.Reserva;
import modelo.ReservaDao;
import vista.Calendario;
import vista.Ventana_error;

public class Metodos_utiles {
	
	private ReservaDao reservaDao;
	private Session sesion;
	private JDialog ventana;
	
	public Metodos_utiles(JDialog ventana) {
		this.ventana=ventana;
		this.sesion=Inicio.sesion;
		reservaDao=new ReservaDao(sesion);
	}
	
	public static List<Date> getListaFechas(Date fechaInicio, Date fechaFin) {
	    Calendar c1 = Calendar.getInstance();
	    c1.setTime(fechaInicio);
	    Calendar c2 = Calendar.getInstance();
	    c2.setTime(fechaFin);
	    List<Date> listaFechas = new ArrayList<Date>();
	    while (!c1.after(c2)) {
	        listaFechas.add(c1.getTime());
	        c1.add(Calendar.DAY_OF_MONTH, 1);
	    }
	    return listaFechas;
	}
	
	public static long diasEntreFechas(java.util.Date fechaInicio, java.util.Date fechaFin){
	     long inicio = fechaInicio.getTime() ;
	     long fin = fechaFin.getTime();
	     long diasDesde = (long) Math.floor(inicio / (1000*60*60*24)); 
	     long diasHasta = (long) Math.floor(fin / (1000*60*60*24)); 
	     long dias = diasHasta - diasDesde;

	     return dias;
	}
	
	public boolean comprobarDia(Date dia) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		int contador=0;
		
		try {
			List<Reserva> reservas=reservaDao.findAll();			
			for(Reserva r:reservas) {
				List<Date> fechas=Metodos_utiles.getListaFechas(r.getFecha_inicio(),r.getFecha_fin());			
				int indice=fechas.size()-1;
				fechas.remove(indice);
				for(Date fecha:fechas) {
					String diaReserva=formato.format(fecha);
					if(diaReserva.equalsIgnoreCase(formato.format(dia))) {
						contador+=r.getNum_mascotas();						
					}
				}
				
			}
			if(contador>=10) {
				return false;
			}else{
				return true;
			}	
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			new Ventana_error(ventana,true).setVisible(true);
		}
		return true;
		
		
	}

}
