package repository.imp;

import java.util.Iterator;

import model.Blockbister;
import model.Pelicula;
import repository.bi.PeliculaRepositoryBI;

public class HibernatePeliculaRepository extends BaseHibernateRepository implements PeliculaRepositoryBI{

	@SuppressWarnings("unchecked")
	@Override
	public Pelicula getPelicula(String id) throws Exception {
		
		Iterator<Pelicula> pelicula = this.getSession().createQuery("SELECT bp FROM Blockbister B INNER JOIN B.peliculas bp WHERE bp.id ="+id).list().iterator();
		if (!pelicula.hasNext()) throw new Exception("No existe la peli");
		else{
			return pelicula.next();
		}
			
		
	}

	@Override
	public Pelicula crearPelicula(Pelicula pelicula) throws Exception {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.addPelicula(pelicula);
		return pelicula;
	}

	@Override
	public Pelicula modificarPelicula(Pelicula peliculaJSON) {
		Pelicula pelicula = (Pelicula) this.getSession().createQuery("FROM Pelicula P WHERE P.id="+peliculaJSON.getId()).list().iterator().next();
		pelicula.modificar(peliculaJSON);
		return pelicula;
	}

	@Override
	public Pelicula borrarPelicula(long id) {
		Pelicula pelicula = (Pelicula)this.getSession().createQuery("FROM Pelicula P WHERE P.id="+id).list().iterator().next();
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.removePelicula(pelicula);
		return pelicula;

	}

}
