package modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="historial_medico")
public class Historial_medico {
	
	@Id @GeneratedValue
    @Column(name = "id")
    private int id;
	
	@Column(name="Peso")
	private int peso;
	
	@Column(name="Sexo")	
	private String sexo;
	
	@Column(name="Talla")
	private char talla;
	
	@Column(name="Esterilizado")
	private boolean esterilizado;
	
	@Column(name="Nombre_vacuna")
	private String nombre_vacuna;
	
	@Column(name="Fecha_vacuna")
	private Date fecha_vacuna;
	
	@Column(name="Nombre_medicacion")
	private String nombre_medicacion;
	
	@Column(name="Dosis")
	private int dosis_medicacion;
	
	@Column(name="Comentarios_medicacion")
	private String comentarios_medicacion;
	
	@Column(name="Descripcion_cirujia")
	private String descripcion_cirujia;
	
	@Column(name="Fecha_cirujia")
	private Date fecha_cirujia;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "idPerro")
	private Perro perro;
	
	public Historial_medico() {		
	}

	public Historial_medico(int peso, String sexo, char talla, boolean esterilizado, String nombre_vacuna,
			Date fecha_vacuna, String nombre_medicacion, int dosis_medicacion, String comentarios_medicacion,
			String descripcion_cirujia, Date fecha_cirujia, Perro perro) {
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
		this.descripcion_cirujia = descripcion_cirujia;
		this.fecha_cirujia = fecha_cirujia;
		this.perro = perro;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
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

	public void setFecha_vacuna(Date fecha_vacuna) {
		this.fecha_vacuna = fecha_vacuna;
	}

	public String getNombre_medicacion() {
		return nombre_medicacion;
	}

	public void setNombre_medicacion(String nombre_medicacion) {
		this.nombre_medicacion = nombre_medicacion;
	}

	public int getDosis_medicacion() {
		return dosis_medicacion;
	}

	public void setDosis_medicacion(int dosis_medicacion) {
		this.dosis_medicacion = dosis_medicacion;
	}

	public String getComentarios_medicacion() {
		return comentarios_medicacion;
	}

	public void setComentarios_medicacion(String comentarios_medicacion) {
		this.comentarios_medicacion = comentarios_medicacion;
	}

	public String getDescripcion_cirujia() {
		return descripcion_cirujia;
	}

	public void setDescripcion_cirujia(String descripcion_cirujia) {
		this.descripcion_cirujia = descripcion_cirujia;
	}

	public Date getFecha_cirujia() {
		return fecha_cirujia;
	}

	public void setFecha_cirujia(Date fecha_cirujia) {
		this.fecha_cirujia = fecha_cirujia;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public int getId() {
		return id;
	}

	
	

	

}
