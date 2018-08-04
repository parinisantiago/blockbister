package service.bi;

import dto.TipoPeliculaDTO;
import model.TipoPelicula;

public interface TipoPeliculaServiceBI {

	TipoPeliculaDTO getTipoPelicula(String id);
	TipoPeliculaDTO nuevo(TipoPelicula tipoPelicula);

}
