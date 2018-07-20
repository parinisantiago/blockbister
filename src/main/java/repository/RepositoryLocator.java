package repository;

import repository.bi.PersonaRepositoryBI;

public class RepositoryLocator {
	
	private static RepositoryLocator instance = null;
	private PersonaRepositoryBI personaRepository;
	
	public static RepositoryLocator getInstance(){
		if(instance == null){
			instance = new RepositoryLocator();
		}
		return instance;
	}

	public PersonaRepositoryBI getPersonaRepository() {
		return personaRepository;
	}

	public void setPersonaRepository(PersonaRepositoryBI personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	
}