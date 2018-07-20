package service;

import service.bi.PersonaServiceBI;

public class ServiceLocator {

	private static ServiceLocator instance = null;
	private PersonaServiceBI personaService;
	
	public static ServiceLocator getInstance(){
		if(instance == null){
			instance = new ServiceLocator();
		}
		return instance;
	}

	public PersonaServiceBI getPersonaService() {
		return personaService;
	}

	public void setPersonaService(PersonaServiceBI personaService) {
		this.personaService = personaService;
	}
	
	
	
}
