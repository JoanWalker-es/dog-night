package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="perro")
public class Perro {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPerro")
	private long idPerro;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Chip")
	private String chip;
	
	@Column(name="Raza")
	private String raza;
			
	@OneToOne(mappedBy = "perro", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Historial_medico medico;
	
	@OneToOne(mappedBy = "perro", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Historial_alimenticio alimentos;
	
	public Perro() {		
	}

	public Perro(String nombre, String chip, String raza, Historial_medico medico, Historial_alimenticio alimentos) {
		super();
		this.nombre = nombre;
		this.chip = chip;
		this.raza = raza;
		this.medico = medico;
		this.alimentos = alimentos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Historial_medico getMedico() {
		return medico;
	}

	public void setMedico(Historial_medico medico) {
		this.medico = medico;
	}

	public Historial_alimenticio getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(Historial_alimenticio alimentos) {
		this.alimentos = alimentos;
	}

	public long getIdPerro() {
		return idPerro;
	}
	
	
}
