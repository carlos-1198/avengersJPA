package vengadores.dao;

import vengadores.model.Pelicula;
import vengadores.util.Conexion;

public class PeliculaDao  extends Conexion<Pelicula> 
implements GenericDao<Pelicula> {
	
	public PeliculaDao() {
		super(Pelicula.class);
	}
}
	