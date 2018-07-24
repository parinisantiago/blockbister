package service.imp;

import dto.DTOFactory;
import dto.PersonaDTO;
import repository.RepositoryLocator;
import service.bi.PersonaServiceBI;

public class PersonaServiceImp extends BaseServiceImp implements PersonaServiceBI{

	public PersonaDTO getPersona(String dni) {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().getPersona(dni));		
	}
	public PersonaDTO crearPersona(String dni, String nombre,String telefono,String direccion,String mail) {
		return DTOFactory.getInstance().getPersonaDTO(RepositoryLocator.getInstance().getPersonaRepository().getPersona(dni));		
	}
	
}
