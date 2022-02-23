package modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas {
	
	@Id @GeneratedValue
    @Column(name = "codigo")
    private int codigo;
	
	@Column(name="Fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name="Fecha_fin")
	private Date fecha_fin;
	
	@Column(name="Comentarios")
	private String comentarios;
	
	@Column(name="Total")
	private double total;
	
	@Column(name="Peluqueria")
	private boolean peluqueria;
	
	@Column(name="Alimentos")
	private boolean alimentos;

	public Reservas() {		
	}

	public Reservas(Date fecha_inicio, Date fecha_fin, String comentarios, double total, boolean peluqueria,
			boolean alimentos) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.comentarios = comentarios;
		this.total = total;
		this.peluqueria = peluqueria;
		this.alimentos = alimentos;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isPeluqueria() {
		return peluqueria;
	}

	public void setPeluqueria(boolean peluqueria) {
		this.peluqueria = peluqueria;
	}

	public boolean isAlimentos() {
		return alimentos;
	}

	public void setAlimentos(boolean alimentos) {
		this.alimentos = alimentos;
	}

	public int getCodigo() {
		return codigo;
	}	
	
	
	
	
	

}
