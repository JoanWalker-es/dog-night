package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "codigo")
    private long codigo;
	
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
	
	
	@ManyToMany
	@JoinTable(
			name = "reservas_servicios",
			joinColumns = @JoinColumn(name = "codigo"),
			inverseJoinColumns = @JoinColumn(name = "idServicio"))
    private List<Servicios> servicios;

	public Reserva() {		
	}	

	public Reserva(Date fecha_inicio, Date fecha_fin, String comentarios, double total, boolean peluqueria,
			boolean alimentos, List<Servicios> servicios) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.comentarios = comentarios;
		this.total = total;
		this.peluqueria = peluqueria;
		this.alimentos = alimentos;
		this.servicios = servicios;
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

	public long getCodigo() {
		return codigo;
	}

	public List<Servicios> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicios> servicios) {
		this.servicios = servicios;
	}	
	
	public void addServicio(Servicios servicio) {
		if(servicios==null) {
			servicios=new ArrayList<Servicios>();
			}
		servicios.add(servicio);
	}

	
	
	
	

}
