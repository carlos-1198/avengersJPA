package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clasificacion database table.
 * 
 */
@Entity
@NamedQuery(name="Clasificacion.findAll", query="SELECT c FROM Clasificacion c")
public class Clasificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String descripcion;

	//bi-directional many-to-one association to Pelicula
	@OneToMany(mappedBy="clasificacionBean")
	private List<Pelicula> peliculas;

	public Clasificacion() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public Pelicula addPelicula(Pelicula pelicula) {
		getPeliculas().add(pelicula);
		pelicula.setClasificacionBean(this);

		return pelicula;
	}

	public Pelicula removePelicula(Pelicula pelicula) {
		getPeliculas().remove(pelicula);
		pelicula.setClasificacionBean(null);

		return pelicula;
	}

}