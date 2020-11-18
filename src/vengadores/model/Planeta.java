package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the planeta database table.
 * 
 */
@Entity
@NamedQuery(name="Planeta.findAll", query="SELECT p FROM Planeta p")
public class Planeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nombre;

	//bi-directional many-to-many association to Pelicula
	@ManyToMany
	@JoinTable(
		name="ubicacion"
		, joinColumns={
			@JoinColumn(name="idplaneta")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idpelicula")
			}
		)
	private List<Pelicula> peliculas;

	public Planeta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}