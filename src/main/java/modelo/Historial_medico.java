package modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * 
 * @author Juan De la Rubia
 * 
 * Clase modelo para persistir datos del historial 
 * médico de las mascotas en la base de datos.
 * Usamos las anotaciones de Hibernate para marcar 
 * las relaciones y los campos de la base de datos.
 */
@Entity
@Table(name="historial_medico")
public class Historial_medico {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
	
	@Column(name="Peso")
	private String peso;
	
	@Column(name="Sexo")	
	private String sexo;
	
	@Column(name="Talla")
	private String talla;
	
	@Column(name="Esterilizado")
	private boolean esterilizado;
	
	@Column(name="Nombre_vacuna")
	private String nombre_vacuna;
	
	@Column(name="Fecha_vacuna")
	private Date fecha_vacuna;
	
	@Column(name="Nombre_medicacion")
	private String nombre_medicacion;
	
	@Column(name="Dosis")
	private String dosis_medicacion;
	
	@Column(name="Comentarios_medicacion")
	private String comentarios_medicacion;	
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "idMascota")
	private Mascota mascota;
	
	public Historial_medico() {		
	}

	public Historial_medico(String peso, String sexo, String talla, boolean esterilizado, String nombre_vacuna,
			Date fecha_vacuna, String nombre_medicacion, String dosis_medicacion, String comentarios_medicacion,
			Mascota perro) {
		super();
		this.peso = peso;
		this.sexo = sexo;
		this.talla = talla;
		this.esterilizado = esterilizado;
		this.nombre_vacuna = nombre_vacuna;
		this.fecha_vacuna = fecha_vacuna;
		this.nombre_medicacion = nombre_medicacion;
		this.dosis_medicacion = dosis_medicacion;
		this.comentarios_medicacion = comentarios_medicacion;
		this.mascota = perro;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public boolean isEsterilizado() {
		return esterilizado;
	}

	public void setEsterilizado(boolean esterilizado) {
		this.esterilizado = esterilizado;
	}

	public String getNombre_vacuna() {
		return nombre_vacuna;
	}

	public void setNombre_vacuna(String nombre_vacuna) {
		this.nombre_vacuna = nombre_vacuna;
	}

	public Date getFecha_vacuna() {
		return fecha_vacuna;
	}

	public void setFecha_vacuna(java.util.Date date) {
		this.fecha_vacuna = (Date) date;
	}

	public String getNombre_medicacion() {
		return nombre_medicacion;
	}

	public void setNombre_medicacion(String nombre_medicacion) {
		this.nombre_medicacion = nombre_medicacion;
	}

	public String getDosis_medicacion() {
		return dosis_medicacion;
	}

	public void setDosis_medicacion(String dosis_medicacion) {
		this.dosis_medicacion = dosis_medicacion;
	}

	public String getComentarios_medicacion() {
		return comentarios_medicacion;
	}

	public void setComentarios_medicacion(String comentarios_medicacion) {
		this.comentarios_medicacion = comentarios_medicacion;
	}	

	public Mascota getPerro() {
		return mascota;
	}

	public void setPerro(Mascota mascota) {
		this.mascota = mascota;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Historial_medico [id=" + id + ", mascota=" + mascota + "]";
	}

	
	

	

}
