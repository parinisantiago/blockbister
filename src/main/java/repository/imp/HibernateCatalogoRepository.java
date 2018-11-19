package repository.imp;

import repository.bi.CatalogoRepositoryBI;

import java.util.Iterator;

import model.Catalogo;
import model.Pelicula;
import model.TipoPelicula;
import model.Blockbister;

public class HibernateCatalogoRepository extends BaseHibernateRepository implements CatalogoRepositoryBI{

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<TipoPelicula> crearCatalogo(Pelicula pelicula) {
		Iterator<TipoPelicula> tipoPeliculas = this.getSession().createQuery("FROM TipoPelicula").list().iterator();
		return tipoPeliculas;
	}
	
	public Catalogo modificarCatalogo(Catalogo catalogoJSON) {
		Catalogo catalogo = (Catalogo) this.getSession().createQuery("FROM Catalogo C WHERE C.id="+catalogoJSON.getId()).list().iterator().next();
		return catalogo;
	}

}
