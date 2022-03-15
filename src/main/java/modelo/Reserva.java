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
	
	@Column(name="Mascotas")
	private int num_mascotas;
		
	@ManyToOne
    @JoinColumn(name="idCliente")
    private Cliente cliente;
	
	@ManyToMany	
	@JoinTable(
			name = "reservas_servicios",
			joinColumns = @JoinColumn(name = "codigo"),
			inverseJoinColumns = @JoinColumn(name = "idServicio"))
    private List<Servicios> servicios;

	public Reserva() {		
	}	

	public Reserva(Date fecha_inicio, Date fecha_fin, String comentarios, double total, 
			List<Servicios> servicios) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.comentarios = comentarios;
		this.total = total;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNum_mascotas() {
		return num_mascotas;
	}

	public void setNum_mascotas(int mascotas) {
		this.num_mascotas = mascotas;
	}

	
	
	
	
	

}
