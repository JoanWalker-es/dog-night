package modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicios {

	@Id @GeneratedValue
	@Column(name="idServicio")
	private int idServicio;
	
	@Column(name="nombre_servicio")
	private String nombre;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToMany(mappedBy = "reservas_servicios")
    Set<Reservas> reservas;
	
	public Servicios() {		
	}

	public Servicios(String nombre, double precio, String descripcion, Set<Reservas> reservas) {
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

	public Set<Reservas> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reservas> reservas) {
		this.reservas = reservas;
	}

	public int getIdServicio() {
		return idServicio;
	}
	
	
	
	
}
