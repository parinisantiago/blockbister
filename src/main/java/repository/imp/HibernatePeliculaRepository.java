package repository.imp;

import model.Blockbister;
import model.Pelicula;
import repository.bi.PeliculaRepositoryBI;

public class HibernatePeliculaRepository extends BaseHibernateRepository implements PeliculaRepositoryBI{

	@Override
	public Pelicula getPelicula(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula crearPelicula(Pelicula pelicula) {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.addPelicula(pelicula);
		return pelicula;
	}

	@Override
	public Pelicula modificarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

}
