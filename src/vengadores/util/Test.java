package vengadores.util;

import java.util.List;

import vengadores.dao.EstadoDao;
import vengadores.dao.HeroeDao;
import vengadores.dao.PeliculaDao;
import vengadores.model.Estado;
import vengadores.model.Heroe;
import vengadores.model.Pelicula;

public class Test {

	public static void main(String[] args) {
		/*
		EstadoDao prueba = new EstadoDao();
		Estado e = prueba.findByDescripcion("Retirado");
		if(e!=null)
			System.out.println(e.getId());
	}
		 */
		HeroeDao h = new HeroeDao();
		PeliculaDao pdao = new PeliculaDao();
		Pelicula p = pdao.find(1);
		Heroe heroe = h.find(3);//2 5
		
		List <Heroe> lista = p.getHeroes();
		lista.add(heroe);
		p.setHeroes(lista);
		
		//List <Pelicula> peliculas = heroe.getPeliculas();
		//peliculas.add(p);
		//heroe.setPeliculas(peliculas);
		pdao.update(p);

		System.out.println(p.getHeroes().size());
		for (int i = 0; i < p.getHeroes().size(); i++) {
			System.out.println(p.getHeroes().get(i).getHeroe());
		}
	}
	
	
}
