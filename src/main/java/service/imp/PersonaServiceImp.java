package service.imp;

import org.springframework.transaction.annotation.Transactional;

import dto.DTOFactory;
import dto.PersonaDTO;
import model.Persona;
import repository.RepositoryLocator;
import service.bi.PersonaServiceBI;
@Transactional
public class PersonaServiceImp implements PersonaServiceBI{
	
	public PersonaDTO getPersona(String dni) {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().getPersona(dni));		
	}
	
	public PersonaDTO crearPersona(Persona persona) {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().crearPersona(persona));		
	}
	
}
