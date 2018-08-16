package repository.imp;

import model.Blockbister;
import model.Pelicula;
import repository.bi.PeliculaRepositoryBI;

public class HibernatePeliculaRepository extends BaseHibernateRepository implements PeliculaRepositoryBI{

	@Override
	public Pelicula getPelicula(String titulo) {
		Pelicula pelicula = (Pelicula) this.getSession().createQuery("FROM Pelicula P WHERE (P.titulo="+titulo+") and (P.peliculas is not null)").list().iterator().next();
		return pelicula;
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
