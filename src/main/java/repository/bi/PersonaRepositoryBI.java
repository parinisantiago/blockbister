package repository.bi;


import model.Persona;

public interface PersonaRepositoryBI extends BaseRepositoryBI {

	public Persona getPersona(String dni);
	public Persona crearPersona(Persona persona) throws Exception;
	public Persona modificarPersona(Persona persona);
	public Persona borrarPersona(int dni);
}
