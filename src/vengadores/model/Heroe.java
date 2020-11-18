package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the heroe database table.
 * 
 */
@Entity
@NamedQuery(name="Heroe.findAll", query="SELECT h FROM Heroe h")
public class Heroe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String arma;

	@Lob
	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechaaparicion;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String heroe;

	private String nombre;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="estado")
	private Estado estadoBean;

	//bi-directional many-to-one association to Genero
	@ManyToOne
	@JoinColumn(name="genero")
	private Genero generoBean;

	//bi-directional many-to-many association to Pelicula
	@ManyToMany(mappedBy="heroes")
	private List<Pelicula> peliculas;

	public Heroe() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArma() {
		return this.arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaaparicion() {
		return this.fechaaparicion;
	}

	public void setFechaaparicion(Date fechaaparicion) {
		this.fechaaparicion = fechaaparicion;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getHeroe() {
		return this.heroe;
	}

	public void setHeroe(String heroe) {
		this.heroe = heroe;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstadoBean() {
		return this.estadoBean;
	}

	public void setEstadoBean(Estado estadoBean) {
		this.estadoBean = estadoBean;
	}

	public Genero getGeneroBean() {
		return this.generoBean;
	}

	public void setGeneroBean(Genero generoBean) {
		this.generoBean = generoBean;
	}

	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}