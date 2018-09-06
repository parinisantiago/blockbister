package repository.imp;

import model.Blockbister;
import model.TipoPelicula;
import repository.bi.TipoPeliculaRepositoryBI;

public class HibernateTipoPeliculaRepository extends BaseHibernateRepository implements TipoPeliculaRepositoryBI {

	@Override
	public TipoPelicula getTipoPelicula(String id) {
		TipoPelicula tipoPelicula = (TipoPelicula) this.getSession().createQuery("FROM TipoPelicula tp WHERE tp.id =" + id).list().iterator().next();
		return tipoPelicula;
	}

	@Override
	public TipoPelicula nuevo(TipoPelicula tipoPelicula) {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.addTipoPelicula(tipoPelicula);
		return tipoPelicula;
	}

	@Override
	public TipoPelicula borrarTipoPelicula(long id) {
		TipoPelicula tipoPelicula = (TipoPelicula)this.getSession().createQuery("FROM TipoPelicula P WHERE P.id="+id).list().iterator().next();
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister").list().iterator().next();
		blockbister.removeTipoPelicula(tipoPelicula);
		return tipoPelicula;
	}

}
