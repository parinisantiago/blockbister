package service.imp;

import dto.DTOFactory;
import repository.RepositoryLocator;

public class BaseServiceImp {

	protected DTOFactory dtoFactory;
	protected RepositoryLocator repositoryLocator;
	
	public RepositoryLocator getRepositoryLocator() {
		return repositoryLocator;
	}
	
	public void setRepositoryLocator(RepositoryLocator repositoryLocator) {
		this.repositoryLocator = repositoryLocator;
	}
	
	public DTOFactory getDtoFactory() {
		return dtoFactory;
	}
	
	public void setDtoFactory(DTOFactory dtoFactory) {
		this.dtoFactory = dtoFactory;
	}
	
	
	
}
