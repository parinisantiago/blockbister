package service.imp;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.PeliculaDTO;
import model.Pelicula;
import repository.RepositoryLocator;
import service.bi.PeliculaServiceBI;

@Transactional
public class PeliculaServiceImp implements PeliculaServiceBI{

	@Override
	public PeliculaDTO getPelicula(String titulo) {
		return DTOFactory.getInstance().getPeliculaDTO(RepositoryLocator.getInstance().getPeliculaRepository().getPelicula(titulo));
	}

	@Override
	public PeliculaDTO crearPelicula(Pelicula pelicula) throws Exception {
		PeliculaDTO peliculaDTO = DTOFactory.getInstance().getPeliculaDTO(RepositoryLocator.getInstance().getPeliculaRepository().crearPelicula(pelicula));
		RepositoryLocator.getInstance().getCatalogoRepository().crearCatalogo(pelicula);
		return peliculaDTO;
	}

	@Override
	public PeliculaDTO modificarPelicula(Pelicula pelicula) {
		return DTOFactory.getInstance().getPeliculaDTO(RepositoryLocator.getInstance().getPeliculaRepository().modificarPelicula(pelicula));
	}

	@Override
	public Collection<PeliculaDTO> getPeliculas() {
		return DTOFactory.getInstance().getBlockbisterDTO(RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister()).getPeliculas();
	}

	@Override
	public PeliculaDTO borrarPelicula(long id) {
		return DTOFactory.getInstance().getPeliculaDTO(RepositoryLocator.getInstance().getPeliculaRepository().borrarPelicula(id));
	}

}
