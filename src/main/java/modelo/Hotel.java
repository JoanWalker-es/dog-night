package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos de la sucursal
 * del hotel canino.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 */
@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private long id;
	
	@Column (name="Nombre")
	private String nombre;
	
	@Column (name="Habitaciones")
	private int habitaciones;
	
	@OneToMany(mappedBy="hotel",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Cliente> clientes=new ArrayList<>();	
	
	public Hotel() {		
	}
	
	public Hotel(String nombre, int habitaciones, List<Cliente> clientes) {
		this.nombre=nombre;
		this.habitaciones=habitaciones;
		this.clientes=clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public long getId() {
		return id;
	}
	
	public void addCliente(Cliente cliente) {
		if(cliente==null) {
			clientes=new ArrayList<Cliente>();
		}
		clientes.add(cliente);
	}	
	
	

}
