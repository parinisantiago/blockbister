package repository.bi;

import model.TipoPelicula;

public interface TipoPeliculaRepositoryBI extends BaseRepositoryBI{

	public TipoPelicula getTipoPelicula(String id) throws Exception;
	public TipoPelicula	nuevo(TipoPelicula tipoPelicula);
	public TipoPelicula borrarTipoPelicula(long id);
	
}
