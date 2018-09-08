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
	public RentaDTO getRenta(String id) throws Exception {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().getRenta(id));
	}

	@Override
	public RentaDTO rentar(Renta renta) {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().rentar(renta));
	}

	@Override
	public RentaDTO devolver(long id) {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().devolver(id));
	}

	@Override
	public RentaDTO cancelar(long id) {
		return DTOFactory.getInstance().getRentaDTO(RepositoryLocator.getInstance().getRentaRepository().cancelar(id));
	}

	
}
