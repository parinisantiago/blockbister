package repository.bi;

import model.Pelicula;

public interface PeliculaRepositoryBI {
	public Pelicula getPelicula(String titulo);
	public Pelicula crearPelicula(Pelicula pelicula) throws Exception;
	public Pelicula modificarPelicula(Pelicula pelicula);
}
