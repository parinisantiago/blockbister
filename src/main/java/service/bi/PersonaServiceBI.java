package service.bi;

import dto.PersonaDTO;

public interface PersonaServiceBI {

	public PersonaDTO getPersona(String dni);
	public PersonaDTO crearPersona(String dni, String nombre,String telefono,String direccion,String mail);

}
