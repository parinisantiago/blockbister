package dto;

import model.Persona;

public class DTOFactory {

	private static DTOFactory instance = null;	
	
	public static DTOFactory getInstance(){
		if (instance == null) {
			instance = new DTOFactory();
		}
		return instance;
	}
	
	public PersonaDTO getPersonaDTO(Persona persona) {
		return new PersonaDTO(persona);
	}
	
}
