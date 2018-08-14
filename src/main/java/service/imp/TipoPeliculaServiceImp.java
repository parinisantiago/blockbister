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
	public TipoPeliculaDTO getTipoPelicula(String id) {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().getTipoPelicula(id));
	}

	@Override
	public TipoPeliculaDTO nuevo(TipoPelicula tipoPelicula) {
		return DTOFactory.getInstance().getTipoPeliculaDTO(RepositoryLocator.getInstance().getTipoPeliculaRepository().nuevo(tipoPelicula));
	}

}
