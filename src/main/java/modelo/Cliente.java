package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos de los clientes
 * en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 */
@Entity
@Table(name="cliente")
public class Cliente {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="idCliente")
	private long idCliente;
	
	@Column (name="DNI")
	private String DNI;
	
	@Column (name="Nombre")
	private String nombre;
	
	@Column (name="Apellidos")
	private String apellidos;
	
	@Column (name="Telefono")
	private String telefono;
	
	@Column (name="Correo")
	private String correo;
	
	@Column (name="Direccion")
	private String direccion;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Mascota> mascotas=new ArrayList<>();
	
	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Reserva> reservas=new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name="id")
    private Hotel hotel;
	
	public Cliente() {		
	}
	
	public Cliente(String DNI,String nombre,String apellidos,String telefono,String correo,String direccion,List<Mascota> perros) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		this.correo=correo;
		this.direccion=direccion;
		this.mascotas=perros;
			
	}	

	public Cliente(String dNI, String nombre, String apellidos, String telefono, String correo, String direccion,
			List<Mascota> perros, List<Reserva> reservas) {		
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.mascotas = perros;
		this.reservas = reservas;
	}
	
	public Cliente(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public long getId() {
		return idCliente;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public long getIdCliente() {
		return idCliente;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public void addReserva(Reserva reserva) {
		if(reservas==null) {
			reservas=new ArrayList<Reserva>();
		}
		reservas.add(reserva);
	}
	
	public void addPerro(Mascota perro) {
		if(mascotas==null) {
			mascotas=new ArrayList<Mascota>();
		}
		mascotas.add(perro);
	}	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return nombre+" "+apellidos;
	}
	
	
	
	
}
