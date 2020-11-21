package vengadores.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ant.FindLeaksTask;

import vengadores.dao.HeroeDao;
import vengadores.dao.GeneroDao;
import vengadores.dao.EstadoDao;
import vengadores.model.Heroe;
import vengadores.model.Estado;
import vengadores.model.Genero;

@WebServlet("/HeroeController")
public class HeroeController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	HeroeDao dao = new HeroeDao();
	GeneroDao daoG = new GeneroDao();
	EstadoDao daoE = new EstadoDao();
	public HeroeController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		switch(action) {
			case "index":
				index(request, response);
				break;
			case "buscar":
				buscarHeroe(request, response);
				break;
			case "insert":
				registrarHeroe(request, response);
				break;
			case "nuevo":
				showNewForm(request, response);
				break;
			case "listar":
				listarHeroes(request, response);
				break;
			case "edit":
				editarHeroe(request, response);
				break;
			case "update":
				updateHeroe(request, response);
				break;
			case "delete":
				deleteHeroe(request, response);
				break;
			default:
				index(request, response);
				break;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private void index (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	public void buscarHeroe(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String codigo = request.getParameter("id");	
		Heroe heroe = dao.find(codigo);
		if (heroe != null) {
            request.getSession().setAttribute("heroe", heroe);
            request.getRequestDispatcher("heroeView/consultar-empleado.jsp").forward(request, response);
        }
        else {
            request.setAttribute("error", "Empleado no registrado");
            request.getRequestDispatcher("index.jsp?estado=Fail").forward(request, response);
        }
	}

	public void registrarHeroe(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		//if (esValido(request.getParameter("nombre")) && esValido(request.getParameter("alias"))
				//&& esValido(request.getParameter("estado")) && esValido(request.getParameter("genero"))) {
		Heroe heroe = new Heroe();
		Genero genero = daoG.find(request.getParameter("generos"));
		Estado estado = daoE.find(request.getParameter("estados"));
		heroe.setNombre(request.getParameter("nombre"));
		heroe.setHeroe(request.getParameter("alias"));
		heroe.setGeneroBean(genero);
		heroe.setEstadoBean(estado);
		dao.insert(heroe);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		//} else {
			//request.getRequestDispatcher("index.jsp").forward(request, response);
		//}
	}
	
	
	public void listarHeroes(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List <Heroe> listaHeroes = dao.list();
		request.getSession().setAttribute("listaHeroes", listaHeroes);
		
		request.getRequestDispatcher("heroeView/listar-heroes.jsp").forward(request, response);
		
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		List <Estado> estados = dao.listEstados();
		List <Genero> generos = dao.listGeneros();
        RequestDispatcher dispatcher = request.getRequestDispatcher("heroeView/heroe-form.jsp");
        request.setAttribute("estados", estados);
        request.setAttribute("generos", generos);
        dispatcher.forward(request, response);
	}
	
	public void editarHeroe(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		List <Estado> estados = dao.listEstados();
		List <Genero> generos = dao.listGeneros();
        int id = Integer.parseInt(request.getParameter("id"));
        Heroe existingHeroe = dao.find(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("heroeView/heroe-form.jsp");
        request.setAttribute("heroe", existingHeroe);
        request.setAttribute("estados", estados);
        request.setAttribute("generos", generos);
        dispatcher.forward(request, response);
	}
	
	private void deleteHeroe(HttpServletRequest request, HttpServletResponse response) 
			throws  ServletException, IOException {
	    int id = Integer.parseInt(request.getParameter("id"));
	    Heroe heroe = dao.find(id);
	    dao.delete(heroe);
	    response.sendRedirect("index.jsp");
		
	}

	private void updateHeroe(HttpServletRequest request, HttpServletResponse response) 
			throws  ServletException, IOException {
	        Heroe heroe = dao.find(Integer.parseInt(request.getParameter("id")));
	        heroe.setNombre(request.getParameter("nombre"));
	        heroe.setHeroe(request.getParameter("alias"));
	        
	        dao.update(heroe);
	        response.sendRedirect("index.jsp");
	    }
		
	
	public <T> boolean esValido(T valor) {
		if (valor == null) {
			return false;
		}
		return valor != "";
	}
}
