package repository.bi;

import model.TipoPelicula;

public interface TipoPeliculaRepositoryBI extends BaseRepositoryBI{

	public TipoPelicula getTipoPelicula(String id);
	public TipoPelicula	nuevo(TipoPelicula tipoPelicula);
	
}
