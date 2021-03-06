package service.imp;

import org.springframework.transaction.annotation.Transactional;

import dto.CatalogoDTO;
import dto.DTOFactory;
import model.Catalogo;
import repository.RepositoryLocator;
import service.bi.CatalogoServiceBI;
@Transactional
public class CatalogoServiceImp implements CatalogoServiceBI{

	@Override
	public CatalogoDTO modificarCatalogo(Catalogo catalogo) {
		return DTOFactory.getInstance().getCatalagoDTO(RepositoryLocator.getInstance().getCatalogoRepository().modificarCatalogo(catalogo));
	}

}
