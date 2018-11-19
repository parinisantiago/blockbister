package repository.imp;

import java.util.Iterator;

import model.Blockbister;
import model.Pelicula;
import repository.bi.PeliculaRepositoryBI;

public class HibernatePeliculaRepository extends BaseHibernateRepository implements PeliculaRepositoryBI{

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<Pelicula> getPelicula(String id) throws Exception {
		
		Iterator<Pelicula> pelicula = this.getSession().createQuery("SELECT bp FROM Blockbister B INNER JOIN B.peliculas bp WHERE bp.id ="+id).list().iterator();
		return pelicula;

		
	}

	@Override
	public Pelicula modificarPelicula(Pelicula peliculaJSON) {
		Pelicula pelicula = (Pelicula) this.getSession().createQuery("FROM Pelicula P WHERE P.id="+peliculaJSON.getId()).list().iterator().next();
		return pelicula;
	}

	@Override
	public Pelicula borrarPelicula(long id) {
		Pelicula pelicula = (Pelicula)this.getSession().createQuery("FROM Pelicula P WHERE P.id="+id).list().iterator().next();
		return pelicula;

	}

}
