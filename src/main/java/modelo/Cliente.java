package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id @GeneratedValue
	@Column (name="idCliente")
	private int idCliente;
	
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
	private List<Perro> perros;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Reservas> reservas;
	
	public Cliente() {		
	}
	
	public Cliente(String DNI,String nombre,String apellidos,String telefono,String correo,String direccion,List<Perro> perros) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		this.correo=correo;
		this.direccion=direccion;
		this.perros=perros;
			
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
	
	
	
}
