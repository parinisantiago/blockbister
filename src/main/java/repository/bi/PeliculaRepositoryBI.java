package repository.bi;

import model.Pelicula;

public interface PeliculaRepositoryBI {
	public Pelicula getPelicula(String id) throws Exception;
	public Pelicula crearPelicula(Pelicula pelicula) throws Exception;
	public Pelicula modificarPelicula(Pelicula pelicula);
	public Pelicula borrarPelicula(long id);
}
