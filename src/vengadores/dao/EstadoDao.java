package vengadores.dao;

import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;

import vengadores.model.Estado;
import vengadores.util.Conexion;

public class EstadoDao  extends Conexion<Estado> 
implements GenericDao<Estado> {
	
	public EstadoDao() {
		super(Estado.class);
	}
	
	public Estado findEstado(String id) {
		Estado estados = (Estado)this.getEm().createQuery("SELECT e FROM Estado e where id=:id").getSingleResult();
		return estados;
	}
	/*
	public Estado findEstado3(String desc) {
		Criteria criteria = session.createCriteria(Estado.class);
		Estado es = (Estado)criteria.add(Restrictions.eq("descripcion", desc)).uniqueResult();
	}
	*/
	public void findEstado4(String id) {
		//Query query = getSession().createQuery("from user where name =:name ").setParameter("name ", "abc");
		//Estado e = (Estado) query.uniqueResult();
		//return e;
	}
	
	public Estado findByDescripcion(String descripcion){
		Estado e = new Estado();
		e = (Estado) this.getEm().createNamedQuery("Estado.findByDescripcion")
			.setParameter("descripcion", descripcion).getSingleResult();
		
		return e;
	}
	/*
	public Estado findEstado2(String id) {
		Estado es = new Estado();
		 try {
			 this.getEm().getTransaction().begin();
			 es =  this.getEm().find(Estado.class, id);
			 this.getEm().getTransaction().commit();
			
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }
		 return es;
		 
	}
	*/
}
