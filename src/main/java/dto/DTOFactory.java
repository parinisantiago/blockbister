package dto;

import model.Blockbister;
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
	
	public BlockbisterDTO getBlockbisterDTO(Blockbister blockbister)
	{
		return new BlockbisterDTO(blockbister);
	}
}
