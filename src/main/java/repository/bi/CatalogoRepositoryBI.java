package repository.bi;

import model.Catalogo;
import model.Pelicula;

public interface CatalogoRepositoryBI extends BaseRepositoryBI {
	public void crearCatalogo(Pelicula pelicula);

	public Catalogo modificarCatalogo(Catalogo catalogo);
}
