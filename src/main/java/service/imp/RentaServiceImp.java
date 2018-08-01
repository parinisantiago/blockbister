package service.imp;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.RentaDTO;
import model.Renta;
import repository.RepositoryLocator;
import service.bi.RentaServiceBI;

@Transactional
public class RentaServiceImp implements RentaServiceBI{

	@Override
	public RentaDTO getRenta(String id) {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().getRenta(id));
	}

	@Override
	public RentaDTO rentar(Renta renta) {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().rentar(renta));
	}

	@Override
	public RentaDTO nuevo(Renta renta) {
		return null;
	}

	
	
}
