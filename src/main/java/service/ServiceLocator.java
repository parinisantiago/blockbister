package service;

import service.bi.PeliculaServiceBI;
import service.bi.PersonaServiceBI;

public class ServiceLocator {

	private static ServiceLocator instance = null;
	private PersonaServiceBI personaService;
	private PeliculaServiceBI peliculaService;
	
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

	public PeliculaServiceBI getPeliculaService() {
		return peliculaService;
	}

	public void setPeliculaService(PeliculaServiceBI peliculaService) {
		this.peliculaService = peliculaService;
	}
	
}
