package repository.bi;

import java.util.Iterator;

import model.Pelicula;

public interface PeliculaRepositoryBI {
	public Iterator<Pelicula> getPelicula(String id) throws Exception;
	public Pelicula modificarPelicula(Pelicula pelicula);
	public Pelicula borrarPelicula(long id);
}
