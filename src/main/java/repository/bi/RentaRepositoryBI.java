package repository.bi;

import model.Renta;

public interface RentaRepositoryBI extends BaseRepositoryBI{

	public Renta getRenta(String id);
	public Renta rentar(Renta renta);
	public Renta devolver(long id);
	public Renta cancelar(long id);
}
