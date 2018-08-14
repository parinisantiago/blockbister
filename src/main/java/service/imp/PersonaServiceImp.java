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
	
	@Override
	public PersonaDTO getPersona(String dni) {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().getPersona(dni));		
	}
	
	@Override
	public PersonaDTO crearPersona(Persona persona) throws Exception {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().crearPersona(persona));		
	}
	
	@Override
	public PersonaDTO modificarPersona(Persona persona){
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().modificarPersona(persona));
	}
	
	@Override
	public Collection<PersonaDTO> getPersonas(){
		return DTOFactory.getInstance().getBlockbisterDTO(RepositoryLocator.getInstance().getBlockbisterRepository().getBlockbister()).getPersonas();
	}

	@Override
	public PersonaDTO borrarPersona(int dni){
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().borrarPersona(dni));
	}
		
	
}
