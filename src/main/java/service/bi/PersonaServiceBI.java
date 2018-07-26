package service.bi;

import java.util.Collection;

import dto.PersonaDTO;
import model.Persona;

public interface PersonaServiceBI {

	public PersonaDTO getPersona(String dni);
	public PersonaDTO crearPersona(Persona persona);
	public PersonaDTO modificarPersona(Persona persona);
	public Collection<PersonaDTO> getPersonas();
}
