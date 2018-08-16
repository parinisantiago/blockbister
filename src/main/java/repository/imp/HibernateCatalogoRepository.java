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
	public void crearCatalogo(Pelicula pelicula) {
		Iterator<TipoPelicula> tipoPeliculas = this.getSession().createQuery("FROM TipoPelicula").list().iterator();
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		while(tipoPeliculas.hasNext()) {
			TipoPelicula tipoPelicula = tipoPeliculas.next();
			Catalogo catalogo = new Catalogo(pelicula, tipoPelicula, 0);
			blockbister.addCatalogo(catalogo);
		}
	}
	
	public Catalogo modificarCatalogo(Catalogo catalogoJSON) {
		Catalogo catalogo = (Catalogo) this.getSession().createQuery("FROM Catalogo WHERE P.id="+catalogoJSON.getId()).list().iterator().next();
		catalogo.setCantidad(catalogoJSON.getCantidad());
		return catalogo;
	}

}
