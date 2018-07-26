package service.imp;

import java.util.Collection;

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
	
	public PersonaDTO modificarPersona(Persona persona){
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().modificarPersona(persona));
	}
	
	public Collection<PersonaDTO> getPersonas(){
		return DTOFactory.getInstance().getBlockbisterDTO(RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister()).getPersonas();
	}

}
