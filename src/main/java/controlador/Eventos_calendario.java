package controlador;

import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.*;

import org.hibernate.Session;

import Principal.Inicio;
import modelo.Reserva;
import modelo.ReservaDao;
import vista.*;

public class Eventos_calendario extends WindowAdapter implements ActionListener, PropertyChangeListener{
	
	private Calendario ventana_calendario;
	private ReservaDao reservaDao;
	private Session sesion;
	
	public Eventos_calendario(Calendario ventana) {
		this.ventana_calendario=ventana;
		sesion=Inicio.sesion;
		reservaDao=new ReservaDao(sesion);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventana_calendario.getBtn_atras()) {
			ventana_calendario.dispose();
		}

	}

	public void windowOpened(WindowEvent e) {
		
	}



	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().compareTo("day") == 0) {
            //SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            //System.out.println(formatoDeFecha.format(ventana_calendario.getjCalendar().getDate()));
			comprobarDia(ventana_calendario.getjCalendar().getDate());
        }
	}
	
	private void comprobarDia(Date dia) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		int contador=0;
		
		try {
			List<Reserva> reservas=reservaDao.findAll();
			for(Reserva r:reservas) {
				List<Date> fechas=getListaFechas(r.getFecha_inicio(),r.getFecha_fin());			
				
				for(Date fecha:fechas) {
					String diaReserva=formato.format(fecha);
					if(diaReserva.equalsIgnoreCase(formato.format(dia))) {
						System.out.println("Reserva: "+r.getCodigo()+" tiene: "+r.getNum_mascotas()+" mascotas");	
						
					}
				}
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	private void enumeracionDias(Date llegada,Date salida) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha inicio:" +formato.format(llegada)+", fecha fin: "+formato.format(salida));
		
		
		
		
	}
	
	public List<Date> getListaFechas(Date fechaInicio, Date fechaFin) {
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
	
        

}
