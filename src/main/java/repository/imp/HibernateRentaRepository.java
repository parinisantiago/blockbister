package repository.imp;

import java.util.Date;

import model.Blockbister;
import model.Renta;
import repository.bi.RentaRepositoryBI;

public class HibernateRentaRepository  extends BaseHibernateRepository implements RentaRepositoryBI{

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

	@Override
	public Renta devolver(long id) {
		Renta renta = (Renta) this.getSession().createQuery("FROM Renta R WHERE R.idRenta = " + id).list().iterator().next();
		renta.setDevolucion(new Date());
		return renta;
	}

	@Override
	public Renta cancelar(long id) {
		Renta renta = (Renta) this.getSession().createQuery("FROM Renta R WHERE R.idRenta = " + id).list().iterator().next();
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister B").list().iterator().next();
		blockbister.removeRenta(renta);
		return renta;
	}
	
}
