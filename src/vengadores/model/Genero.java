package vengadores.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the genero database table.
 * 
 */
@Entity
@NamedQuery(name="Genero.findAll", query="SELECT g FROM Genero g")
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String descripcion;

	//bi-directional many-to-one association to Heroe
	@OneToMany(mappedBy="generoBean")
	private List<Heroe> heroes;

	public Genero() {
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
		heroe.setGeneroBean(this);

		return heroe;
	}

	public Heroe removeHeroe(Heroe heroe) {
		getHeroes().remove(heroe);
		heroe.setGeneroBean(null);

		return heroe;
	}

}