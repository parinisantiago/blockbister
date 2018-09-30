package service.bi;

import dto.TipoPeliculaDTO;
import model.TipoPelicula;

public interface TipoPeliculaServiceBI {

	TipoPeliculaDTO getTipoPelicula(String id) throws Exception;
	TipoPeliculaDTO nuevo(TipoPelicula tipoPelicula);
	TipoPeliculaDTO borrarPelicula(long id);

}
