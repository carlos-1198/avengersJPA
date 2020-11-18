package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String descripcion;

	//bi-directional many-to-one association to Heroe
	@OneToMany(mappedBy="estadoBean")
	private List<Heroe> heroes;

	public Estado() {
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

	public List<Heroe> getHeroes() {
		return this.heroes;
	}

	public void setHeroes(List<Heroe> heroes) {
		this.heroes = heroes;
	}

	public Heroe addHeroe(Heroe heroe) {
		getHeroes().add(heroe);
		heroe.setEstadoBean(this);

		return heroe;
	}

	public Heroe removeHeroe(Heroe heroe) {
		getHeroes().remove(heroe);
		heroe.setEstadoBean(null);

		return heroe;
	}

}