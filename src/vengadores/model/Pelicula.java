package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the pelicula database table.
 * 
 */
@Entity
@NamedQuery(name="Pelicula.findAll", query="SELECT p FROM Pelicula p")
public class Pelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private BigDecimal anolanzamiento;

	private BigDecimal anosecuencia;

	private String nombre;

	@Lob
	private String sinopsis;

	//bi-directional many-to-many association to Heroe
	@ManyToMany
	@JoinTable(
		name="participacion"
		, joinColumns={
			@JoinColumn(name="idpelicula")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idheroe")
			}
		)
	private List<Heroe> heroes;

	//bi-directional many-to-one association to Clasificacion
	@ManyToOne
	@JoinColumn(name="clasificacion")
	private Clasificacion clasificacionBean;

	//bi-directional many-to-many association to Planeta
	@ManyToMany(mappedBy="peliculas")
	private List<Planeta> planetas;

	public Pelicula() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAnolanzamiento() {
		return this.anolanzamiento;
	}

	public void setAnolanzamiento(BigDecimal anolanzamiento) {
		this.anolanzamiento = anolanzamiento;
	}

	public BigDecimal getAnosecuencia() {
		return this.anosecuencia;
	}

	public void setAnosecuencia(BigDecimal anosecuencia) {
		this.anosecuencia = anosecuencia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public List<Heroe> getHeroes() {
		return this.heroes;
	}

	public void setHeroes(List<Heroe> heroes) {
		this.heroes = heroes;
	}

	public Clasificacion getClasificacionBean() {
		return this.clasificacionBean;
	}

	public void setClasificacionBean(Clasificacion clasificacionBean) {
		this.clasificacionBean = clasificacionBean;
	}

	public List<Planeta> getPlanetas() {
		return this.planetas;
	}

	public void setPlanetas(List<Planeta> planetas) {
		this.planetas = planetas;
	}

}