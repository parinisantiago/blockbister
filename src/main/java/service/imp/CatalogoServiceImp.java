package service.imp;

import dto.CatalogoDTO;
import dto.DTOFactory;
import model.Catalogo;
import repository.RepositoryLocator;
import service.bi.CatalogoServiceBI;

public class CatalogoServiceImp implements CatalogoServiceBI{

	@Override
	public CatalogoDTO modificarCatalogo(Catalogo catalogo) {
		// TODO Auto-generated method stub
		return DTOFactory.getInstance().getCatalagoDTO(RepositoryLocator.getInstance().getCatalogoRepository().modificarCatalogo(catalogo));
	}

}
