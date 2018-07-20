package service.imp;

import dto.DTOFactory;
import repository.bi.PersonaRepositoryBI;

public class BaseServiceImp {

	protected DTOFactory dtoFactory = DTOFactory.getInstance();
	protected PersonaRepositoryBI personaRepository;
	
	public PersonaRepositoryBI getPersonaRepository() {
		return personaRepository;
	}
	
	public void setPersonaRepository(PersonaRepositoryBI personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	public DTOFactory getDtoFactory() {
		return dtoFactory;
	}
	
	public void setDtoFactory(DTOFactory dtoFactory) {
		this.dtoFactory = dtoFactory;
	}
	
	
	
}
