package service.bi;

import dto.RentaDTO;
import model.Renta;

public interface RentaServiceBI {

	public RentaDTO getRenta(String id) throws Exception;
	public RentaDTO rentar(Renta renta);
	public RentaDTO devolver(long id);
	public RentaDTO cancelar(long id);
	
}
