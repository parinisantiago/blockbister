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
		return null;
	}

	@Override
	public PeliculaDTO crearPelicula(Pelicula pelicula) {
		return DTOFactory.getInstance().getPeliculaDTO(RepositoryLocator.getInstance().getPeliculaRepository().crearPelicula(pelicula));
	}

	@Override
	public PeliculaDTO modificarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PeliculaDTO> getPeliculas() {
		return DTOFactory.getInstance().getBlockbisterDTO(RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister()).getPeliculas();
	}

}
