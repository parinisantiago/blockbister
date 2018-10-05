package repository.imp;

import java.util.Date;
import java.util.Iterator;

import model.Blockbister;
import model.Catalogo;
import model.Persona;
import model.Renta;
import repository.bi.RentaRepositoryBI;

public class HibernateRentaRepository  extends BaseHibernateRepository implements RentaRepositoryBI{

	@SuppressWarnings("unchecked")
	@Override
	public Renta getRenta(String id) throws Exception {
		Iterator<Renta> renta = this.getSession().createQuery("SELECT bp FROM Blockbister B INNER JOIN B.rentas bp WHERE bp.id ="+id).list().iterator();
		if (!renta.hasNext()) throw new Exception("No existe la renta");
		else{
			return renta.next();
		}
		
	}

	@Override
	public Renta rentar(Renta renta) {
		Blockbister blockbister = (Blockbister) this.getSession().createQuery("FROM Blockbister B").list().iterator().next();
		Persona persona = (Persona) this.getSession().createQuery("FROM Persona P WHERE P.dni="+renta.getPersona().getDni()).list().iterator().next();
		Catalogo catalogo = (Catalogo) this.getSession().createQuery("FROM Catalogo C WHERE C.id="+renta.getCatalogo().getId()).list().iterator().next();
		renta.setCatalogo(catalogo);
		renta.setPersona(persona);
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
