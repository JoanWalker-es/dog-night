package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="historial_alimenticio")
public class Historial_alimenticio {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
	
	@Column(name="Pienso_tipo")
	private String tipo_pienso;
	
	@Column(name="Pienso_cantidad")
	private String cantidad_pienso;
	
	@Column(name="Pienso_comentarios")
	private String comentarios_pienso;
	
	@Column(name="Intolerancia_tipo")
	private String tipo_intolerancia;
	
	@Column(name="Intolerancia_descripcion")
	private String descripcion_intolerancia;	
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "idMascota")
	private Mascota mascota;

	public Historial_alimenticio() {		
	}

	public Historial_alimenticio(String tipo_pienso, String cantidad_pienso, String comentarios_pienso,
			String tipo_intolerancia, String descripcion_intolerancia, Mascota mascota) {
		super();		
		this.tipo_pienso = tipo_pienso;
		this.cantidad_pienso = cantidad_pienso;
		this.comentarios_pienso = comentarios_pienso;
		this.tipo_intolerancia = tipo_intolerancia;
		this.descripcion_intolerancia = descripcion_intolerancia;
		this.mascota = mascota;
	}

	public String getTipo_pienso() {
		return tipo_pienso;
	}

	public void setTipo_pienso(String tipo_pienso) {
		this.tipo_pienso = tipo_pienso;
	}

	public String getCantidad_pienso() {
		return cantidad_pienso;
	}

	public void setCantidad_pienso(String cantidad_pienso) {
		this.cantidad_pienso = cantidad_pienso;
	}

	public String getComentarios_pienso() {
		return comentarios_pienso;
	}

	public void setComentarios_pienso(String comentarios_pienso) {
		this.comentarios_pienso = comentarios_pienso;
	}

	public String getTipo_intolerancia() {
		return tipo_intolerancia;
	}

	public void setTipo_intolerancia(String tipo_intolerancia) {
		this.tipo_intolerancia = tipo_intolerancia;
	}

	public String getDescripcion_intolerancia() {
		return descripcion_intolerancia;
	}

	public void setDescripcion_intolerancia(String descripcion_intolerancia) {
		this.descripcion_intolerancia = descripcion_intolerancia;
	}

	public Mascota getPerro() {
		return mascota;
	}

	public void setPerro(Mascota perro) {
		this.mascota = perro;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Historial_alimenticio [id=" + id + ", mascota=" + mascota + "]";
	}
	
	
	
	
	

}
