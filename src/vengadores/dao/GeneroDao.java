package vengadores.dao;

import vengadores.model.Genero;
import vengadores.util.Conexion;

public class GeneroDao extends Conexion<Genero> 
implements GenericDao<Genero> {
	
	public GeneroDao() {
		super(Genero.class);
	}
	
	public Genero findGenero(String id) {
		Genero generos = (Genero)this.getEm().createQuery("SELECT g FROM Genero g where id="+id).getSingleResult();
		return generos;
	}
}
