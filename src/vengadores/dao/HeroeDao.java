package vengadores.dao;

import java.util.List;

import vengadores.dao.GenericDao;
import vengadores.model.Heroe;
import vengadores.model.Estado;
import vengadores.model.Genero;
import vengadores.util.Conexion;

public class HeroeDao extends Conexion<Heroe> 
implements GenericDao<Heroe>  {

	public HeroeDao() {
		super(Heroe.class);
	}

	public List<Estado> listEstados() {
		List<Estado> estados = this.getEm().createQuery("SELECT e FROM Estado e").getResultList();
		return estados;
	}
	
	public List<Genero> listGeneros() {
		List<Genero> generos = this.getEm().createQuery("SELECT g FROM Genero g").getResultList();
		return generos;
	}

}