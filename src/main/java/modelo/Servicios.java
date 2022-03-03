package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicios {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idServicio")
	private long idServicio;
	
	@Column(name="nombre_servicio")
	private String nombre;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToMany(mappedBy = "servicios")
    private List<Reserva> reservas;
	
	public Servicios() {		
	}

	public Servicios(String nombre, double precio, String descripcion, List<Reserva> reservas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.reservas = reservas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public long getIdServicio() {
		return idServicio;
	}
	
	public void addReserva(Reserva reserva) {
		if(reservas==null) {
			reservas=new ArrayList<Reserva>();
			}
		reservas.add(reserva);
	}

	@Override
	public String toString() {
		return "Servicios [idServicio=" + idServicio + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + "]";
	}
	
	
	
	
	
	
}
