package repository.imp;

import model.Blockbister;
import model.Renta;
import repository.bi.RentaRepositoryBI;

public class RentaHibernateRepository  extends BaseHibernateRepository implements RentaRepositoryBI{

	@Override
	public Renta getRenta(String id) {
		Renta renta = (Renta) this.getSession().createQuery("FROM Renta R WHERE R.idRenta = " + id).list().iterator().next();
		return renta;
	}

	@Override
	public Renta rentar(Renta renta) {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister B").list().iterator().next();
		blockbister.addRenta(renta);
		return renta;
	}
	
}
