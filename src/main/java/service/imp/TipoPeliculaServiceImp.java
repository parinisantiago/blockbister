package service.imp;

import org.springframework.transaction.annotation.Transactional;
import dto.DTOFactory;
import dto.TipoPeliculaDTO;
import model.TipoPelicula;
import repository.RepositoryLocator;
import service.bi.TipoPeliculaServiceBI;

@Transactional
public class TipoPeliculaServiceImp implements TipoPeliculaServiceBI{

	@Override
	public TipoPeliculaDTO getTipoPelicula(String id) throws Exception {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().getTipoPelicula(id));
	}

	@Override
	public TipoPeliculaDTO nuevo(TipoPelicula tipoPelicula) {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().nuevo(tipoPelicula));
	}

	@Override
	public TipoPeliculaDTO borrarPelicula(long id) {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().borrarTipoPelicula(id));
	}

	@Override
	public TipoPeliculaDTO modificar(TipoPelicula tipoPelicula) {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().modificar(tipoPelicula));
	}

}
