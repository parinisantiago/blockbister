package service.bi;

import dto.RentaDTO;
import model.Renta;

public interface RentaServiceBI {

	public RentaDTO getRenta(String id);
	public RentaDTO rentar(Renta renta);
	public RentaDTO nuevo(Renta renta);
	
}
