package vengadores.dao;

import vengadores.model.Estado;
import vengadores.util.Conexion;

public class EstadoDao  extends Conexion<Estado> 
implements GenericDao<Estado> {
	
	public EstadoDao() {
		super(Estado.class);
	}
	
	public Estado findEstado(String id) {
		Estado estados = (Estado)this.getEm().createQuery("SELECT e FROM Estado e where id="+id+"").getSingleResult();
		return estados;
	}
}
