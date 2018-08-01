package service;

import service.bi.CatalogoServiceBI;
import service.bi.PeliculaServiceBI;
import service.bi.PersonaServiceBI;
import service.bi.RentaServiceBI;

public class ServiceLocator {

	private static ServiceLocator instance = null;
	private PersonaServiceBI personaService;
	private PeliculaServiceBI peliculaService;
	private CatalogoServiceBI catalogoService;
	private RentaServiceBI rentaService;
	
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

	public CatalogoServiceBI getCatalogoService() {
		return catalogoService;
	}

	public void setCatalogoService(CatalogoServiceBI catalogoService) {
		this.catalogoService = catalogoService;
	}

	public RentaServiceBI getRentaService() {
		return rentaService;
	}

	public void setRentaService(RentaServiceBI rentaService) {
		this.rentaService = rentaService;
	}
	
}
