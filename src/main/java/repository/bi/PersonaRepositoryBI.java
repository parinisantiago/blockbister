package repository.bi;

import model.Persona;

public interface PersonaRepositoryBI extends BaseRepositoryBI {

	Persona getPersona(String dni);
	Persona crearPersona(Persona persona);
	
}
