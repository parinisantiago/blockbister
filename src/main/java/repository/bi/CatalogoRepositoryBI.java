package repository.bi;

import java.util.Iterator;

import model.Catalogo;
import model.Pelicula;
import model.TipoPelicula;

public interface CatalogoRepositoryBI extends BaseRepositoryBI {
	public Iterator<TipoPelicula> crearCatalogo(Pelicula pelicula);

	public Catalogo modificarCatalogo(Catalogo catalogo);
}
