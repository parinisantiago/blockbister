package repository.imp;

import java.util.Iterator;

import model.Blockbister;
import model.TipoPelicula;
import repository.bi.TipoPeliculaRepositoryBI;

public class HibernateTipoPeliculaRepository extends BaseHibernateRepository implements TipoPeliculaRepositoryBI {

	@SuppressWarnings("unchecked")
	@Override
	public TipoPelicula getTipoPelicula(String id) throws Exception {
		Iterator<TipoPelicula> persona = this.getSession().createQuery("SELECT bp FROM Blockbister B INNER JOIN B.tipospelicula bp WHERE bp.id ="+id).list().iterator();
		if (!persona.hasNext()) throw new Exception("No existe el tipo de pelicula");
		else{
			return persona.next();
		}
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

	@Override
	public TipoPelicula modificar(TipoPelicula tipoPeliculaJSON) {
		TipoPelicula tipoPelicula = (TipoPelicula) this.getSession().createQuery("FROM TipoPelicula P WHERE P.id="+tipoPeliculaJSON.getId()).list().iterator().next();
		tipoPelicula.modificar(tipoPeliculaJSON);
		return tipoPelicula;
	}

}
