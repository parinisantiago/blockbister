package service.imp;

import dto.PersonaDTO;
import service.bi.PersonaServiceBI;

public class PersonaServiceImp extends BaseServiceImp implements PersonaServiceBI{

	public PersonaDTO getPersona(int dni) {
		return this.dtoFactory.getPersonaDTO(this.personaRepository.getPersona(dni));		
	}
	
}
