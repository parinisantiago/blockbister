package service.bi;

import java.util.Collection;

import dto.PeliculaDTO;
import model.Pelicula;

public interface PeliculaServiceBI {
	public PeliculaDTO getPelicula(String id) throws Exception;
	public PeliculaDTO crearPelicula(Pelicula pelicula) throws Exception;
	public PeliculaDTO modificarPelicula(Pelicula pelicula);
	public Collection<PeliculaDTO> getPeliculas();
	public PeliculaDTO borrarPelicula(long id);
}
