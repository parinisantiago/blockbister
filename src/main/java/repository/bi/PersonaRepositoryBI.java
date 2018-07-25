package repository.bi;

import model.Persona;

public interface PersonaRepositoryBI extends BaseRepositoryBI {

	public Persona getPersona(String dni);
	public Persona crearPersona(Persona persona);
	public Persona modificarPersona(Persona persona);
}
